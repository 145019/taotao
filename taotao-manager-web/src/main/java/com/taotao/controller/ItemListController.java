package com.taotao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.common.util.EasyUIDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zd
 * @Date 2020/4/9 23:35
 * @Version 1.0
 * 描述:
 */
@Controller
public class ItemListController {

    @Reference
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    public EasyUIDataGridResult getGoodsList(@RequestParam Integer page,
                                            @RequestParam Integer rows){
        EasyUIDataGridResult itemList = itemService.getItemList(page, rows);
        return itemList;
    }
}
