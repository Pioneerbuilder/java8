package com.github.lambda.study.init;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangxiaodong on 2018/2/8.
 */
public class DataInit {

    public static List<String> initTestData() {
        List<String> list = new ArrayList<String>();
        list.add("测试数据1");
        list.add("测试数据2");
        list.add("测试数据3");
        list.add("测试数据12");
        return list;
    }

    public static List<Buss> bussInit() {
        List<Buss> bussList = new ArrayList<>();
        bussList.add(new Buss("apple", 10, new BigDecimal(0.3).setScale(2,BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("banana", 3, new BigDecimal(0.8).setScale(2, BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("banana", 15, new BigDecimal(1.8).setScale(2, BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("cat", 5, new BigDecimal(2.0).setScale(2, BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("banana", 30, new BigDecimal(3.2).setScale(2, BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("cat", 20, new BigDecimal(0.1).setScale(2, BigDecimal.ROUND_HALF_UP)));
        bussList.add(new Buss("cat", 25, new BigDecimal(2.1).setScale(2, BigDecimal.ROUND_HALF_UP)));
        return bussList;
    }
}
