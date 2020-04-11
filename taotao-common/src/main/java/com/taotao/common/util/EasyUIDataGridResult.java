package com.taotao.common.util;

import java.io.Serializable;
import java.util.List;

/**
 * 商品列表查询的返回的数据类
 * @Author zd
 * @Date 2020/4/9 21:34
 * @Version 1.0
 * 描述:
 */
public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List rows;
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
}
