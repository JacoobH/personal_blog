package com.example.personal_blog.service;

import com.example.personal_blog.model.ArticleModel;

import java.util.List;

public interface IArticleService {
    void add(ArticleModel am);
    void modify(ArticleModel am);
    void remove(ArticleModel am);
    int getPageNumber(int pageSize);
    ArticleModel getArticleById(int id);
    List<ArticleModel> getListByPage(int pageNo, int pageSize);
    List<ArticleModel> getListByTagAndPage(int tid, int pageNo, int pageSize);
    List<String> getYearByTime();
    List<ArticleModel> getListByTimeAndPage(String year, int pageNo, int pageSize);
}
