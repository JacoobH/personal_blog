package com.example.personal_blog.model;

import org.apache.ibatis.type.Alias;

import java.sql.Date;
@Alias("Article")
public class ArticleModel {
    private Integer id;
    private String title;
    private Date time = null;
    private Integer visit;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", visit=" + visit +
                ", content='" + content + '\'' +
                '}';
    }
}
