package com.example.personal_blog.service.impl;

import com.example.personal_blog.dao.ICommentDao;
import com.example.personal_blog.model.CommentModel;
import com.example.personal_blog.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("commentService")
@Transactional
public class CommentServiceImpl implements ICommentService {
    private ICommentDao cd;

    @Autowired
    public void setCd(ICommentDao cd) {
        this.cd = cd;
    }

    @Override
    public void add(CommentModel cm) {
        cd.insert(cm);
    }

    @Override
    public void remove(CommentModel cm) {
        cd.delete(cm);
    }

    @Override
    public void modify(CommentModel cm) {
        cd.update(cm);
    }

    @Override
    public List<CommentModel> getListByArticleAndPage(int aid, int pageNo, int pageSize) {
        return cd.selectListByArticleAndPage(aid, pageNo, pageSize);
    }
}
