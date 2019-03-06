package com.lin.recitewords.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "login_log")
public class LoginLog {
    /**
     * 登录日志id
     */
    @Id
    @Column(name = "login_log_id")
    private Integer loginLogId;

    /**
     * 用户名
     */
    private String username;

    /**
     * ip
     */
    private String ip;

    /**
     * 登录地址
     */
    private String address;

    /**
     * 登录时间
     */
    private Date time;

    /**
     * 获取登录日志id
     *
     * @return login_log_id - 登录日志id
     */
    public Integer getLoginLogId() {
        return loginLogId;
    }

    /**
     * 设置登录日志id
     *
     * @param loginLogId 登录日志id
     */
    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取ip
     *
     * @return ip - ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置ip
     *
     * @param ip ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取登录地址
     *
     * @return address - 登录地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置登录地址
     *
     * @param address 登录地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取登录时间
     *
     * @return time - 登录时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置登录时间
     *
     * @param time 登录时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
            "loginLogId=" + loginLogId +
            ", username='" + username + '\'' +
            ", ip='" + ip + '\'' +
            ", address='" + address + '\'' +
            ", time=" + time +
            '}';
    }
}