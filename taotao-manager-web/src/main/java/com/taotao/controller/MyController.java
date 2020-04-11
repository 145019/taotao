package com.taotao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.Test.InformationShow;
import com.taotao.common.util.EasyUIDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zd
 * @Date 2020/4/9 0:53
 * @Version 1.0
 * 描述:
 */
@Controller
public class MyController {

    @Reference
    private ItemService itemService;

    @RequestMapping("/t")
    @ResponseBody
    public String test(@RequestParam Integer page,
                       @RequestParam Integer rows){
//        System.out.println(informationShow.getInfo());
        EasyUIDataGridResult itemList = itemService.getItemList(page, rows);
        itemList.getTotal();
        return "success";
    }
}
