package com.lin.recitewords.model;

import java.util.Date;
import javax.persistence.*;

public class Exam {
    /**
     * 考试id
     */
    @Id
    @Column(name = "exam_id")
    private Integer examId;

    /**
     * 考试名称
     */
    private String name;

    /**
     * 正确数量
     */
    private Integer positive;

    /**
     * 错误数量
     */
    private Integer negative;

    /**
     * 总数量
     */
    private Integer altogether;

    /**
     * 正确率
     */
    private Float rate;

    /**
     * 考试时间
     */
    private Date time;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 获取考试id
     *
     * @return exam_id - 考试id
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * 设置考试id
     *
     * @param examId 考试id
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 获取考试名称
     *
     * @return name - 考试名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置考试名称
     *
     * @param name 考试名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取正确数量
     *
     * @return positive - 正确数量
     */
    public Integer getPositive() {
        return positive;
    }

    /**
     * 设置正确数量
     *
     * @param positive 正确数量
     */
    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    /**
     * 获取错误数量
     *
     * @return negative - 错误数量
     */
    public Integer getNegative() {
        return negative;
    }

    /**
     * 设置错误数量
     *
     * @param negative 错误数量
     */
    public void setNegative(Integer negative) {
        this.negative = negative;
    }

    /**
     * 获取总数量
     *
     * @return altogether - 总数量
     */
    public Integer getAltogether() {
        return altogether;
    }

    /**
     * 设置总数量
     *
     * @param altogether 总数量
     */
    public void setAltogether(Integer altogether) {
        this.altogether = altogether;
    }

    /**
     * 获取正确率
     *
     * @return rate - 正确率
     */
    public Float getRate() {
        return rate;
    }

    /**
     * 设置正确率
     *
     * @param rate 正确率
     */
    public void setRate(Float rate) {
        this.rate = rate;
    }

    /**
     * 获取考试时间
     *
     * @return time - 考试时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置考试时间
     *
     * @param time 考试时间
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
        return "Exam{" +
            "examId=" + examId +
            ", name='" + name + '\'' +
            ", positive=" + positive +
            ", negative=" + negative +
            ", altogether=" + altogether +
            ", rate=" + rate +
            ", time=" + time +
            ", userId=" + userId +
            '}';
    }
}