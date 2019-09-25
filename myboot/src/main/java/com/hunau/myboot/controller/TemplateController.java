package com.hunau.myboot.controller;

/**
 * @param 参数有 个，第一个是   ，第二个是  。
 * @Description:
 * @Return: 返回结果是    。
 * @开发人员: 彭子涵
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * @开发版本：综合练习Vo.1
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
@Controller
public class TemplateController {
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","基于Freemarker from TemplateController.helloFtl");
        return"/helloFtl";
    }
}
