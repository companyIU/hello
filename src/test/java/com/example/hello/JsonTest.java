package com.example.hello;

import com.example.hello.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author wbstart
 * @create 2022-12-31 11:17
 */
public class JsonTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonStr = objectMapper.writeValueAsString(new User("张三", 18, "清华"));
        System.out.println(jsonStr);


    }
}
