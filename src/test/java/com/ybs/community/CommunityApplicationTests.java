package com.ybs.community;

import com.ybs.community.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Autowired
    private UserMapper userMapper;

//    @Test
    public void select(){
//        List<User> users = userMapper.selectByExample("1");
        System.out.println("-------------------------");
//        System.out.println(users);
    }
}
