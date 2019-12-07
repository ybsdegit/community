package com.ybs.community.mapper;

import com.ybs.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author Paulson
 * @date 2019/12/7 14:18
 */

@Mapper
public interface UserMapper {
    @Select("select * from user")
    User findAll();

    @Insert("insert into user(name, account_id, token, gmt_create, gmt_modified) " +
            "values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);

}
