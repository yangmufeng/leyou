package com.leyou.common.test;

import com.leyou.common.utils.JsonUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JsonUtilsTest {

    @Test
    public void test(){
        User user = new User();
        user.setUserId(100);
        user.setUserName("小飞飞");
        user.setAddr("天河九巷");

        // 把对象转成字符串
        System.out.println(user);
        System.out.println("把对象转成字符串："+ JsonUtils.toString(user));


        System.out.println("=====================================");
        // 把集合对象转成字符串
        // 拷贝集合
        List<User> users = Arrays.asList(user, new User(200, "小鸭鸭", "深圳"), new User(300, "小猪猪", "珠海"));
        System.out.println("把集合转成json字符串："+JsonUtils.toString(users));

        System.out.println("=====================================");
        System.out.println("把字符串转成对象");
        User user1 = JsonUtils.toBean("{\"userId\":100,\"userName\":\"小飞飞222\",\"addr\":\"天河九巷\"}", User.class);
        System.out.println(user1);

        System.out.println("=====================================");
        System.out.println("把集合json字符串转成对象");
        List<User> userList = JsonUtils.toList("[{\"userId\":100,\"userName\":\"小飞飞\",\"addr\":\"天河九巷\"},{\"userId\":200,\"userName\":\"小鸭鸭\",\"addr\":\"深圳\"},{\"userId\":300,\"userName\":\"小猪猪\",\"addr\":\"珠海\"}]", User.class);
        for (User u : userList) {
            System.out.println(u);
        }

    }

}