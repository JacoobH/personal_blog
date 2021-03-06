package com.example.personal_blog.controller;

import com.example.personal_blog.model.TagModel;
import com.example.personal_blog.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
@CrossOrigin
public class TagController {
    private static final String TAG = "TagController";
    private ITagService ts;

    @Autowired
    public void setTs(ITagService ts) {
        this.ts = ts;
    }

    @RequestMapping("/add")
    public void add(TagModel tm){
        ts.add(tm);
    }

    @RequestMapping("/addTags")
    public void addTags(int aid, @RequestBody List<TagModel> tms){
        ts.addTags(aid,tms);
    }

    @RequestMapping("/modify")
    public void modify(@RequestBody TagModel tm){
        ts.modify(tm);
    }

    @RequestMapping("/remove")
    public void remove(@RequestBody TagModel tm){
        ts.remove(tm);
    }

    @RequestMapping("/getListByArticle")
    public List<TagModel> getListByArticle(int aid){
        return ts.getListByArticle(aid);
    }

    @RequestMapping("/getListByAll")
    public List<TagModel> getListByAll(){
        return ts.getListByAll();
    }
}
