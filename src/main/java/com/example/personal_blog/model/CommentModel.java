package com.example.personal_blog.model;

import org.apache.ibatis.type.Alias;

import java.sql.Date;
@Alias("Comment")
public class CommentModel {
    private Integer id;
    private ArticleModel article;
    private String content;
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticleModel getArticle() {
        return article;
    }

    public void setArticle(ArticleModel article) {
        this.article = article;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "id=" + id +
                ", article=" + article +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
