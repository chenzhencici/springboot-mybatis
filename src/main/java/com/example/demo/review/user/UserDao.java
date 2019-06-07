package com.example.demo.review.user;

import com.example.demo.review.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from pub_user")
    @Results({@Result(property = "id", column = "id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userCode", column = "user_code")
    })
    List<User> findAll();

    List<User> getAll();
}
