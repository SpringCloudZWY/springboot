package com.zwy.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author wenyu.zhao
 * @Date 2020/8/11 19:50
 */
@Data
@Component
//@ConfigurationProperties(prefix = "person")
public class Person {

    @Value(value = "${person.lastName}")
    private String lastName;

    @Value(value = "#{11 * 2}")
    private Integer age;

    @Value("true")
    private Boolean boss;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private Map<String, String> maps;

    private List<String> list;

    private Dog dog;
}
