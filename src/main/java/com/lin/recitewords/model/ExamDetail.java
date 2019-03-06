package com.lin.recitewords.model;

import javax.persistence.*;

@Table(name = "exam_detail")
public class ExamDetail {
    /**
     * 考试详情id
     */
    @Id
    @Column(name = "exam_detail_id")
    private Integer examDetailId;

    /**
     * 英文
     */
    private String english;

    /**
     * 中文
     */
    private String chinese;

    /**
     * 用户英文
     */
    @Column(name = "user_english")
    private String userEnglish;

    /**
     * 用户中文
     */
    @Column(name = "user_chinese")
    private String userChinese;

    /**
     * 结果：正确 or 错误
     */
    private String result;

    /**
     * 正确答案
     */
    private String correct;

    /**
     * 考试类型：中文 or 英文
     */
    private String type;

    /**
     * 考试id
     */
    @Column(name = "exam_id")
    private Integer examId;

    /**
     * 获取考试详情id
     *
     * @return exam_detail_id - 考试详情id
     */
    public Integer getExamDetailId() {
        return examDetailId;
    }

    /**
     * 设置考试详情id
     *
     * @param examDetailId 考试详情id
     */
    public void setExamDetailId(Integer examDetailId) {
        this.examDetailId = examDetailId;
    }

    /**
     * 获取英文
     *
     * @return english - 英文
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 设置英文
     *
     * @param english 英文
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * 获取中文
     *
     * @return chinese - 中文
     */
    public String getChinese() {
        return chinese;
    }

    /**
     * 设置中文
     *
     * @param chinese 中文
     */
    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取用户英文
     *
     * @return user_english - 用户英文
     */
    public String getUserEnglish() {
        return userEnglish;
    }

    /**
     * 设置用户英文
     *
     * @param userEnglish 用户英文
     */
    public void setUserEnglish(String userEnglish) {
        this.userEnglish = userEnglish;
    }

    /**
     * 获取用户中文
     *
     * @return user_chinese - 用户中文
     */
    public String getUserChinese() {
        return userChinese;
    }

    /**
     * 设置用户中文
     *
     * @param userChinese 用户中文
     */
    public void setUserChinese(String userChinese) {
        this.userChinese = userChinese;
    }

    /**
     * 获取结果：正确 or 错误
     *
     * @return result - 结果：正确 or 错误
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置结果：正确 or 错误
     *
     * @param result 结果：正确 or 错误
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取正确答案
     *
     * @return correct - 正确答案
     */
    public String getCorrect() {
        return correct;
    }

    /**
     * 设置正确答案
     *
     * @param correct 正确答案
     */
    public void setCorrect(String correct) {
        this.correct = correct;
    }

    /**
     * 获取考试类型：中文 or 英文
     *
     * @return type - 考试类型：中文 or 英文
     */
    public String getType() {
        return type;
    }

    /**
     * 设置考试类型：中文 or 英文
     *
     * @param type 考试类型：中文 or 英文
     */
    public void setType(String type) {
        this.type = type;
    }

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

    @Override
    public String toString() {
        return "ExamDetail{" +
            "examDetailId=" + examDetailId +
            ", english='" + english + '\'' +
            ", chinese='" + chinese + '\'' +
            ", userEnglish='" + userEnglish + '\'' +
            ", userChinese='" + userChinese + '\'' +
            ", result='" + result + '\'' +
            ", correct='" + correct + '\'' +
            ", type='" + type + '\'' +
            ", examId=" + examId +
            '}';
    }
}