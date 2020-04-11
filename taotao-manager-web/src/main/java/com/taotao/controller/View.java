package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zd
 * @Date 2020/4/8 23:03
 * @Version 1.0
 * 描述: 显示所有页面
 */
@Controller
public class View {

    @RequestMapping("/{name}")
    public String show(@PathVariable("name") String viewName){

        return viewName;
    }
}
