package com.example.personal_blog.service;

import com.example.personal_blog.model.CommentModel;

import java.util.List;

public interface ICommentService {
    void add(CommentModel cm);
    void remove(CommentModel cm);
    void modify(CommentModel cm);
    List<CommentModel> getListByArticleAndPage(int aid, int pageNo, int pageSize);
}
