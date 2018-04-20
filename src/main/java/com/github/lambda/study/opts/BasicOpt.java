package com.github.lambda.study.opts;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 集合过滤及遍历
 * Created by tangxiaodong on 2018/2/8.
 */
public class BasicOpt {

    public static void opt(List<String> list, Predicate<String> contain1, Predicate<String> contain2) {

        //根据条件遍历集合
        list.stream().filter(contain1).forEach(n -> System.out.println(n));
        list.stream().filter(s -> contain1.test(s)).forEach(s -> System.out.println(s));
        list.stream().filter(contain1.and(contain2)).forEach(n -> System.out.println(n));
        list.stream().filter(contain1.or(contain2)).forEach(n -> System.out.println("dfs" + n));

        //将过滤后的元素重新放到一个集合中
        List<String> newList = list.stream().filter(contain1.and(contain2)).collect(Collectors.toList());

        newList.forEach(System.out::println);
    }
}
