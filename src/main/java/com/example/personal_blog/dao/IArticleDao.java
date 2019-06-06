package com.example.personal_blog.dao;

import com.example.personal_blog.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface IArticleDao {
    void insert(ArticleModel am);
    void update(ArticleModel am);
    void delete(ArticleModel am);
    List<ArticleModel> selectListByPage(@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    List<ArticleModel> selectListByTagAndPage(@Param("tid") int tid, @Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
    //归档时间列表
    List<String> selectYearByTime();
    //得到年内的文章列表
    List<ArticleModel> selectListByTimeAndPage(@Param("year") String year,@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);
}
