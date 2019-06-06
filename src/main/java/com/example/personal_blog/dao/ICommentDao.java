package com.example.personal_blog.dao;

import com.example.personal_blog.model.CommentModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ICommentDao {
    void insert(CommentModel cm);
    void update(CommentModel cm);
    void delete(CommentModel cm);
    List<CommentModel> selectListByArticleAndPage(@Param("aid") int aid, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
