package com.example.personal_blog.controller;

import com.example.personal_blog.model.ArticleModel;
import com.example.personal_blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
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

    @RequestMapping("/modify")
    public void modify(ArticleModel am){
        as.modify(am);
    }

    @RequestMapping("/remove")
    public void remove(ArticleModel am){
        as.remove(am);
    }

    @RequestMapping("/getPageNumber")
    public int getPageNumber(int pageSize){
        return as.getPageNumber(pageSize);
    }

    @RequestMapping("/getListByPage")
    public List<ArticleModel> getListByPage(int pageNo, int pageSize){
        return as.getListByPage(pageNo, pageSize);
    }

    @RequestMapping("/getListByTagAndPage")
    public List<ArticleModel> getListByTagAndPage(int tid, int pageNo, int pageSize){
        return as.getListByTagAndPage(tid,pageNo,pageSize);
    }

    @RequestMapping("/getYearByTime")
    public List<String> getYearByTime(){
        return as.getYearByTime();
    }

    @RequestMapping("/getListByTimeAndPage")
    public List<ArticleModel> getListByTimeAndPage(String year, int pageNo, int pageSize){
        return as.getListByTimeAndPage(year,pageNo,pageSize);
    }
}
