package com.yc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shop-pc
 * @description:
 * @author: 作者
 * @create: 2021-06-04 20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments implements Serializable {
    private static final long serialVersionUID = -6110117701936217180L;
    private Integer commentno;
    private GoodDetail goodDetail;//sizeno;
    private MemberInfo memberInfo;//mno;

    private String word;
    private Integer type;
    private String pic;
    private Date date;

    private GoodInfo goodInfo;//gno;

}
