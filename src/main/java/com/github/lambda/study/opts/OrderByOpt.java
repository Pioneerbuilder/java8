package com.github.lambda.study.opts;

import com.github.lambda.study.init.Buss;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tangxiaodong on 2018/3/1.
 */
public class OrderByOpt {

    public static void opt(List<Buss> bussList) {
        Map<String, Buss> bussMap = bussList.stream()
                .collect(Collectors.toMap(Buss::getName, Buss -> Buss, (k1, k2) -> k2));
        System.out.println(bussMap);
        bussMap.forEach((k, v) -> System.out.println("排序前的map：key：" + k + ";value:" + v));

        /**
         * sorted by keys asc output without map
         */
        List<String> keyList = bussMap.keySet().stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        keyList.forEach(e -> System.out.println("倒排序后的key list：" + e));

        /**
         * sorted by keys desc output without map
         */

        /**
         * sorted by keys asc output with map
         */
        bussMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).collect(Collectors.toList())
                .forEach(entry -> System.out.println("排序后的map：entry：" + entry));

        /**
         * sorted by keys desc output with map
         */
        bussMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .forEach(entry -> System.out.println("倒排序后的map：entry：" + entry));
    }

}
