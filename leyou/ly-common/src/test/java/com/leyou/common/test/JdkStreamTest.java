package com.leyou.common.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JdkStreamTest {

    @Test
    public void test(){
        List<User> users = Arrays.asList(
                new User(100, "小飞飞", "天河"),
                new User(200, "小鸭鸭", "深圳"),
                new User(300, "小猪猪", "珠海"));
        // ==================================================
        System.out.println("jdk1.8流式处理");
        String userNames = users.stream()
                .map(User::getUserName)// 映射 搜集用户名称
                .filter(name -> name.startsWith("小")) // 把搜集的名字 过滤
                .collect(Collectors.joining("|"));// 把结果 汇总，并且使用 | 拼接
        System.out.println(userNames);
    }
}
