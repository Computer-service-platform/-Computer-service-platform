package com.yc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: shop-pc
 * @description:
 * @author: 作者
 * @create: 2021-06-04 19:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodType {
    private Integer tno;
    private String tname;
    private String pic;
    private Integer status;
    private List<GoodInfo> goodInfoList;
}