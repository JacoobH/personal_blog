package com.example.personal_blog.controller;

import com.example.personal_blog.model.ArticleModel;
import com.example.personal_blog.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
    public void add(@RequestBody ArticleModel am){
        as.add(am);
    }

    @RequestMapping("/modify")
    public void modify(@RequestBody ArticleModel am){
        as.modify(am);
    }

    @RequestMapping("/remove")
    public void remove(@RequestBody ArticleModel am){
        as.remove(am);
    }

    @RequestMapping("/getPageNumber")
    public int getPageNumber(int pageSize, String searchText){
        return as.getPageNumber(pageSize, searchText);
    }

    @RequestMapping("/getArticleById")
    public ArticleModel getArticleById(int id){
        return as.getArticleById(id);
    }

    @RequestMapping("/getListByPage")
    public List<ArticleModel> getListByPage(int pageNo, int pageSize, String searchText){
        return as.getListByPage(pageNo, pageSize,searchText);
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
