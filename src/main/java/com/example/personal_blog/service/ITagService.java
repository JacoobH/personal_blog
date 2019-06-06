package com.example.personal_blog.service;

import com.example.personal_blog.model.TagModel;

import java.util.List;

public interface ITagService {
    void add(TagModel tm);
    void addTags(int aid, List<TagModel> tms);
    boolean isExist(TagModel tm);
    void remove(TagModel tm);
    void modify(TagModel tm);

    List<TagModel> getListByArticle(int aid);
}
