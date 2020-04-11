package com.taotao.Test;

import com.taotao.entity.TbItemCat;
import com.taotao.mapper.TbItemCatMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zd
 * @Date 2020/4/9 10:59
 * @Version 1.0
 * 描述:
 */
public class TestMybatis {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
        TbItemCatMapper bean = context.getBean("tbItemCatMapper", TbItemCatMapper.class);
        TbItemCat tbItemCat = bean.selectByPrimaryKey(1l);
        System.out.println(tbItemCat);
    }
}
