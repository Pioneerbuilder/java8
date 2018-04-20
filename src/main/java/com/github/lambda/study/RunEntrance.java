package com.github.lambda.study;

import com.github.lambda.study.init.Buss;
import com.github.lambda.study.init.DataInit;
import com.github.lambda.study.init.PredicateFactory;
import com.github.lambda.study.opts.BasicOpt;
import com.github.lambda.study.opts.GroupByOpt;
import com.github.lambda.study.opts.OrderByOpt;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tangxiaodong on 2018/2/8.
 */
public class RunEntrance {
    public static void main(String[] args) {
        //初始化list集合
        List<String> list = DataInit.initTestData();

        //使用λ表达式遍历集合
        list.forEach(s -> System.out.println(s));

        //结合Predicate使用和过滤条件筛选元素
        Predicate<String> contain1 = PredicateFactory.productPredicate("1");
        Predicate<String> contain2 = PredicateFactory.productPredicate("2");

        BasicOpt.opt(list, contain1, contain2);


        List<Buss> busslist = DataInit.bussInit();
        busslist.forEach(s -> System.out.println(s));

        GroupByOpt.opt(busslist);

        OrderByOpt.opt(busslist);
    }
}
