package com.example.personal_blog.controller;

import com.example.personal_blog.model.CommentModel;
import com.example.personal_blog.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private ICommentService cs;

    @Autowired
    public void setCs(ICommentService cs) {
        this.cs = cs;
    }

    @RequestMapping("/add")
    public void add(CommentModel cm){
        cs.add(cm);
    }

    @RequestMapping("/remove")
    public void remove(CommentModel cm){
        cs.remove(cm);
    }

    @RequestMapping("/modify")
    public void modify(CommentModel cm){
        cs.modify(cm);
    }

    @RequestMapping("/getListByArticleAndPage")
    public List<CommentModel> getListByArticleAndPage(int aid, int pageNo, int pageSize){
        return cs.getListByArticleAndPage(aid, pageNo, pageSize);
    }
}
