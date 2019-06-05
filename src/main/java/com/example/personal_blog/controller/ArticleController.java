package com.example.personal_blog.controller;

import com.example.personal_blog.model.ArticleModel;
import com.example.personal_blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    private IArticleService as;

    @Autowired
    public void setAs(IArticleService as) {
        this.as = as;
    }

    @RequestMapping("/add")
    public void add(ArticleModel am){
        as.add(am);
    }

    @RequestMapping("/update")
    public void update(ArticleModel am){
        as.modify(am);
    }

    @RequestMapping("/delete")
    public void delete(ArticleModel am){
        as.delete(am);
    }

    @RequestMapping("/getListByPage")
    public List<ArticleModel> getAllByPage(int pageNo, int pageSize){
        return as.getListByPage(pageNo, pageSize);
    }
}
