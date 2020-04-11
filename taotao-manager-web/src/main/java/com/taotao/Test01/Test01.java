package com.taotao.Test01;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.Test.InformationShow;
import org.junit.Test;

/**
 * @Author zd
 * @Date 2020/4/9 0:40
 * @Version 1.0
 * 描述:
 */
public class Test01 extends SpringJUnit4BaseTest {

    @Reference
    private InformationShow informationShow;

    @Test
    public void test01() {
        System.out.println(informationShow.getInfo());
    }
}
