package com.ybs.community.service;

import com.ybs.community.mapper.UserMapper;
import com.ybs.community.model.User;
import com.ybs.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 *
 * @author Paulson
 * @date 2020/2/16 21:25
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public void createOrUpdate(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andAccountIdEqualTo(user.getAccountId());
        List<User> users = userMapper.selectByExample(userExample);
       if (users.size() == 0){
           // 插入
           user.setGmtCreate(System.currentTimeMillis());
           user.setGmtModified(user.getGmtCreate());
           userMapper.insert(user);
       }else {
           // 更新
           User dbUser = users.get(0);
           User updateUser = new User();
           updateUser.setToken(user.getToken());
           updateUser.setName(user.getName());
           updateUser.setAvatarUrl(user.getAvatarUrl());
           updateUser.setGmtModified(System.currentTimeMillis());

           UserExample example = new UserExample();
           example.createCriteria()
                   .andIdEqualTo(dbUser.getId());
           userMapper.updateByExampleSelective(updateUser, example);
       }

    }
}
