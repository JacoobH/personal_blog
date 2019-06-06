package com.example.personal_blog.service.impl;

import com.example.personal_blog.dao.IArticleDao;
import com.example.personal_blog.model.ArticleModel;
import com.example.personal_blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("articleService")
@Transactional
public class ArticleServiceImpl implements IArticleService {
    private IArticleDao ad = null;

    @Autowired
    public void setAd(IArticleDao ad) {
        this.ad = ad;
    }

    @Override
    public void add(ArticleModel am) {
        ad.insert(am);
    }

    @Override
    public void modify(ArticleModel am) {
        ad.update(am);
    }

    @Override
    public void remove(ArticleModel am) {
        ad.delete(am);
    }

    @Override
    public List<ArticleModel> getListByPage(int pageNo, int pageSize) {
        return ad.selectListByPage(pageNo,pageSize);
    }

    @Override
    public List<ArticleModel> getListByTagAndPage(int tid, int pageNo, int pageSize) {
        return ad.selectListByTagAndPage(tid,pageNo,pageSize);
    }

    @Override
    public List<String> getYearByTime() {
        return ad.selectYearByTime();
    }
}
