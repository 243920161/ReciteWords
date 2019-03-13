
// 登录验证
$('#loginForm').validate({
    // 验证规则
    rules: {
        usernameOrEmail: {
            required: true  // 必填
        },
        password: {
            required: true
        }
    },

    // 错误消息
    messages: {
        usernameOrEmail: {
            required: '用户名或邮箱不能为空'
        },
        password: {
            required: '密码不能为空'
        }
    },

    // 设置错误字体格式
    errorPlacement: function(error, element) {
        error.css('fontSize', '10px');
        error.css('margin', '5px');
        error.css('color', 'red');
        element.after(error); // 在元素后添加字体
    },

    // 表单提交事件
    submitHandler: function(form) {
        $.ajax({
            url: URL_LOGIN,
            type: 'post',
            dataType: 'json',
            data: $(form).serialize(),
            success: function(data) {
                if (data.code === 200) {
                    layer.msg(data.msg, {
                        time: 1500
                    }, function() {
                        location.href = URL_INDEX;
                    });
                } else {
                    layer.alert(data.msg, {
                        icon: 5
                    });
                }
            }
        });
    }
});