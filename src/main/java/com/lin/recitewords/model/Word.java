package com.lin.recitewords.model;

import javax.persistence.*;

public class Word {
    /**
     * 单词id
     */
    @Id
    @Column(name = "word_id")
    private Integer wordId;

    /**
     * 英文
     */
    private String english;

    /**
     * 中文
     */
    private String chinese;

    /**
     * 单词本id
     */
    @Column(name = "word_book_id")
    private Integer wordBookId;

    /**
     * 获取单词id
     *
     * @return word_id - 单词id
     */
    public Integer getWordId() {
        return wordId;
    }

    /**
     * 设置单词id
     *
     * @param wordId 单词id
     */
    public void setWordId(Integer wordId) {
        this.wordId = wordId;
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

    @Override
    public String toString() {
        return "Word{" +
            "wordId=" + wordId +
            ", english='" + english + '\'' +
            ", chinese='" + chinese + '\'' +
            ", wordBookId=" + wordBookId +
            '}';
    }
}