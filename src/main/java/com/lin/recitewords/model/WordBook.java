package com.lin.recitewords.model;

import javax.persistence.*;

@Table(name = "word_book")
public class WordBook {
    /**
     * 单词本id
     */
    @Id
    @Column(name = "word_book_id")
    private Integer wordBookId;

    /**
     * 单词本名称
     */
    private String name;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 获取单词本id
     *
     * @return word_book_id - 单词本id
     */
    public Integer getWordBookId() {
        return wordBookId;
    }

    /**
     * 设置单词本id
     *
     * @param wordBookId 单词本id
     */
    public void setWordBookId(Integer wordBookId) {
        this.wordBookId = wordBookId;
    }

    /**
     * 获取单词本名称
     *
     * @return name - 单词本名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置单词本名称
     *
     * @param name 单词本名称
     */
    public void setName(String name) {
        this.name = name;
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
        return "WordBook{" +
            "wordBookId=" + wordBookId +
            ", name='" + name + '\'' +
            ", userId=" + userId +
            '}';
    }
}