package com.lin.recitewords.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    @Transient
    private int count;
    private List<Word> wordList;

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
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public int getCount() {
        return wordList == null ? 0 : wordList.size();
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        return "WordBook{" +
            "wordBookId=" + wordBookId +
            ", name='" + name + '\'' +
            ", remark='" + remark + '\'' +
            ", createTime=" + createTime +
            ", userId=" + userId +
            ", count=" + getCount() +
            '}';
    }
}