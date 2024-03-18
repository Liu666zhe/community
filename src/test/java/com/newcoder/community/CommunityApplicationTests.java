package com.newcoder.community;

import com.newcoder.community.mapper.DiscussPostMapper;
import com.newcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {


    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : list) {

            System.out.println(discussPost);
        }
    }


}
