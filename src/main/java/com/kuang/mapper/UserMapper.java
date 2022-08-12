package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.stereotype.Repository;

import java.util.List;


//这个类的实现类不像之前一样将一个xml文件与这个接口写在一个包下面而是在resources下面新创建一个mybatis.mapper包用来存放xml文件
//这个注解表示了这是一个mybatis的mapper类
@Mapper
@Repository
public interface UserMapper{

    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
