package com.taotao.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.Test.InformationShow;
import com.taotao.entity.TbItemCat;
import com.taotao.entity.TbItemCatExample;
import com.taotao.mapper.TbItemCatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zd
 * @Date 2020/4/7 21:44
 * @Version 1.0
 * 描述:
 */
@Component
@Service
public class Test implements InformationShow {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public TbItemCat getInfo() {
        PageHelper.startPage(1,10);
//        TbItemCat tbItemCat = tbItemCatMapper.selectByPrimaryKey(1l);
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);
        //获取分页页面信息
        PageInfo<TbItemCat> pageInfo = new PageInfo<TbItemCat>(tbItemCats);
        System.out.println(tbItemCats.toString());
        return null;
    }
}
