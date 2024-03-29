package com.newcoder.community.service;

import com.newcoder.community.mapper.DiscussPostMapper;
import com.newcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userID, int offset, int limit){
        return discussPostMapper.selectDiscussPosts(userID,offset,limit);
    }

    public int findDiscussPostRows(int userID){
        return discussPostMapper.selectDiscussPostRows(userID);
    }
}
