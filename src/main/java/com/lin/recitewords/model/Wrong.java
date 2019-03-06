package com.lin.recitewords.model;

import javax.persistence.*;

public class Wrong {
    /**
     * 错题id
     */
    @Id
    private Integer id;

    /**
     * 英文
     */
    private String english;

    /**
     * 中文
     */
    private String chinese;

    /**
     * 错题本id
     */
    @Column(name = "wrong_book_id")
    private Integer wrongBookId;

    /**
     * 获取错题id
     *
     * @return id - 错题id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置错题id
     *
     * @param id 错题id
     */
    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Wrong{" +
            "id=" + id +
            ", english='" + english + '\'' +
            ", chinese='" + chinese + '\'' +
            ", wrongBookId=" + wrongBookId +
            '}';
    }
}