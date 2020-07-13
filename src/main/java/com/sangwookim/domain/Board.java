package com.sangwookim.domain;

import java.util.Date;

public class Board {
    private Long id;
    private String category;
    private String title;
    private String content;
    private String writer;
    private Date reg_date;
    private Date update_date;

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}

