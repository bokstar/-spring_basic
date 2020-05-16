package com.example.mybatis_xml.mapper;

import com.example.mybatis_xml.enums.UserSexEnum;
import com.example.mybatis_xml.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    // 모든 User를 출력한다.
    @Select("select * from users")

    @Results({
            @Result(property = "userSex" , column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName" , column = "nick_name")
    })
    List<User> getAll();



    // 하나의 데이터를 얻어온다.
    @Select("select * from users from id = #{id} ")
    @Results({
            @Result(property = "userSex" , column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName" , column = "nick_name")
    })
    User getOne(Long id);


    // DB에 값을 입력한다.
    @Insert("insert into users(userName,passWord,user_sex) values(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);


    // DB에 값을 update 한다.

    @Update("update users set userName= #{userName}, passWord= #{passWord}, user_sex= #{userSex} ")
    void update(User user);

    // DB에 있는 값을 삭제한다.
    @Delete("delete from users where id = #{id}")
    void delete(Long id);
}
