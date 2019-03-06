package com.lin.recitewords.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "wrong_book")
public class WrongBook {
    /**
     * 错题本id
     */
    @Id
    @Column(name = "wrong_book_id")
    private Integer wrongBookId;

    /**
     * 错题本名称
     */
    private String name;

    /**
     * 时间
     */
    private Date time;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 获取错题本id
     *
     * @return wrong_book_id - 错题本id
     */
    public Integer getWrongBookId() {
        return wrongBookId;
    }

    /**
     * 设置错题本id
     *
     * @param wrongBookId 错题本id
     */
    public void setWrongBookId(Integer wrongBookId) {
        this.wrongBookId = wrongBookId;
    }

    /**
     * 获取错题本名称
     *
     * @return name - 错题本名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置错题本名称
     *
     * @param name 错题本名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "WrongBook{" +
            "wrongBookId=" + wrongBookId +
            ", name='" + name + '\'' +
            ", time=" + time +
            ", userId=" + userId +
            '}';
    }
}