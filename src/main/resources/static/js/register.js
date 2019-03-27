
$('#registerForm').validate({
    // 错误规则
    rules: {
        username: {
            required: true // 必填
        },
        password: {
            required: true
        },
        confirmPassword: {
            required: true,
            confirmPassword: true // 自定义验证
        },
        email: {
            required: true,
            email: true
        },
        code: {
            required: true
        }
    },

    // 错误提示消息
    messages: {
        username: {
            required: '请输入用户名'
        },
        password: {
            required: '请输入密码'
        },
        confirmPassword: {
            required: '请输入确认密码',
            confirmPassword: '密码不一致' // 自定义验证的错误提示
        },
        email: {
            required: '请输入邮箱',
            email: '邮箱格式不正确'
        },
        code: {
            required: '请输入验证码'
        }
    },

    // 设置错误字体样式
    errorPlacement: function(error, element) {
        error.css('fontSize', '15px');
        error.css('color', 'red');
        error.css('margin', '5px');
        element.after(error);
    },

    // 提交
    submitHandler: function(form) {
        $.ajax({
            url: URL_REGISTER,
            type: 'post',
            dataType: 'json',
            data: $('#registerForm').serialize(),
            async: true,
            success: function(data) {
                if (data.code === 200) {
                    layer.msg(data.msg, {
                        time: 1500
                    }, function() {
                        location.href = URL_LOGIN;
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

// -------------------自定义验证---------------------
// 确认密码
jQuery.validator.addMethod('confirmPassword', function(value, element) {
    return $('[name="password"]').val() === value;
});

// 验证邮箱
jQuery.validator.addMethod('email', function(value, element) {
    var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
    return reg.test(value);
});
// -------------------------------------------------

// 发送邮件
$('#send').click(function() {
    var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
    var email = $('[name="email"]').val();

    if (email === '') {
        layer.msg('请输入邮箱');
        return;
    }

    if (!reg.test(email)) {
        layer.msg('邮箱格式不正确');
        return;
    }

    // 执行发送
    $.get(URL_SEND_MAIL, 'to=' + email, function(r) {
        if (r.code === 200) {
            layer.msg(r.msg, {
                time: 1500
            });
        } else {
            layer.alert(r.msg, {
                icon: 5
            });
        }
    });
});