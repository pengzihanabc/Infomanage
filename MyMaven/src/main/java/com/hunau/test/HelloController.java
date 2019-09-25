package com.hunau.test;

/**
 * @param 参数有 个，第一个是   ，第二个是  。
 * @Description:
 * @Return: 返回结果是    。
 * @开发人员: 彭子涵
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * @开发版本：综合练习Vo.1
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "彭子涵，学号是201841882308";
    }
}
