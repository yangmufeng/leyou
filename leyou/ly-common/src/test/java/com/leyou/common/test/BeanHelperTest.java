package com.leyou.common.test;

import com.leyou.common.utils.BeanHelper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BeanHelperTest {

    @Test
    public void test() {
        User user = new User();
        user.setUserId(100);
        user.setUserName("小飞飞");
        user.setAddr("天河九巷");

        // 拷贝对象
        UserDTO userDTO = BeanHelper.copyProperties(user, UserDTO.class);
        System.out.println(userDTO);

        // =======================
        // 拷贝集合
        List<User> users = Arrays.asList(user, new User(200, "小鸭鸭", "深圳"), new User(300, "小猪猪", "珠海"));
        List<UserDTO> userDTOS = BeanHelper.copyWithCollection(users, UserDTO.class);
        System.out.println(userDTOS);
    }


}



