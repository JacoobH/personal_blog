package com.example.personal_blog.dao;

import com.example.personal_blog.model.TagModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ITagDao {
    void insert(TagModel tm);
    void insertTags(@Param("aid") int aid, @Param("tms") List<TagModel> tms);
    int isExist(TagModel tm);

    void update(TagModel tm);
    void delete(TagModel tm);

    //根据文章查找标签
    List<TagModel> selectListByArticle(int aid);
}
