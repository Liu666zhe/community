package com.newcoder.community.mapper;


import com.newcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userID, int offset, int limit);

    int selectDiscussPostRows(@Param("userID") int userID);

}
