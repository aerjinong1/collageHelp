package com.collage.wxz.mapper;

import com.collage.wxz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
@Autowired
    private UserMapper usermapper;
    @Test
    public void insert(){
        User user = new User();
        user.setStudentId(0007);
        user.setUsername("wxz1");
        user.setPassword("123");
        user.setUserClassification(0);
        usermapper.insert(user);

    }

    @Test
    public void findStudentById(){
        User user = usermapper.findByStudentId(1);
        System.out.println(user);
    }

    @Test
    public void modifyUserData(){
        User user = new User();
        user.setUsername("6696");
        user.setStudentId(1);
        user.setEmail("112233");
        user.setGender(1);
        int res = usermapper.modifyUserData(user);
    }
    @Test
    public void findListByStuId(){
        System.out.println(usermapper.getListByStuId(0));
//        String list = usermapper.getListByStuId(0);
//        System.out.println(list+"123");
    }
}
