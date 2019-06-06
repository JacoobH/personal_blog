package com.example.personal_blog.service;

import com.example.personal_blog.model.ArticleModel;

import java.util.List;

public interface IArticleService {
    void add(ArticleModel am);
    void modify(ArticleModel am);
    void remove(ArticleModel am);
    List<ArticleModel> getListByPage(int pageNo, int pageSize);
}
