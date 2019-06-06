package com.example.personal_blog.service.impl;

import com.example.personal_blog.dao.ITagDao;
import com.example.personal_blog.model.TagModel;
import com.example.personal_blog.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("tagService")
@Transactional
public class TagServiceImpl implements ITagService {
    private ITagDao td;

    @Autowired
    public void setTd(ITagDao td) {
        this.td = td;
    }

    @Override
    public void add(TagModel tm) {
        td.insert(tm);
    }

    @Override
    public void addTags(int aid, List<TagModel> tms) {
        //如果标签不存在则添加标签
        for(TagModel tm : tms){
            if (!isExist(tm)){
                add(tm);
            }
        }

        td.insertTags(aid,tms);
    }


    @Override
    public boolean isExist(TagModel tm) {
        return td.isExist(tm) > 0;
    }

    @Override
    public void remove(TagModel tm) {
        td.delete(tm);
    }

    @Override
    public void modify(TagModel tm) {
        td.update(tm);
    }

    @Override
    public List<TagModel> getListByArticle(int aid) {
        return td.selectListByArticle(aid);
    }
}
