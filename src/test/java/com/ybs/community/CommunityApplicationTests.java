package com.ybs.community;

import com.ybs.community.mapper.UserMapper;
import com.ybs.community.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void select(){
        List<User> users = userMapper.findAll();
        System.out.println("-------------------------");
        System.out.println(users);
    }
}
