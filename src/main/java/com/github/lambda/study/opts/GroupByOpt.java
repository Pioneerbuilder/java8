package com.github.lambda.study.opts;

import com.github.lambda.study.init.Buss;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 分组求和
 * Created by tangxiaodong on 2018/2/8.
 */
public class GroupByOpt {

    public static void opt(List<Buss> bussList) {

//        List<Buss> st = new ArrayList<>();
//        bussList.stream()
//                .collect(Collectors.groupingBy(Buss::getName)) //分组(Name can't be null)
//                .forEach((k, v) -> {
//                    Optional<Buss> sum = v.stream().reduce((v1, v2) -> {  //合并
//                        v1.setCount(v1.getCount() + v2.getCount());
//                        v1.setValue(v1.getValue().add(v2.getValue()));
//                        return v1;
//                    });
//                    st.add(sum.orElse(new Buss("other", 0, new BigDecimal(0.0))));
//                });
//        System.out.println(st);

        List<Buss> st = new ArrayList<>();
        bussList.stream()
                .collect(Collectors.groupingBy(Buss::getName)) //分组(Name can't be null)
                .forEach((k, v) -> {
                    Buss buss = new Buss(k, 1325, new BigDecimal(2.3));
                    Buss sum = v.stream().reduce(buss, (v1, v2) -> {  //合并
                        v1.setCount(v1.getCount() + v2.getCount());
                        v1.setValue(v1.getValue().add(v2.getValue()));
                        return v1;
                    });
                    st.add(sum);
                });
        System.out.println(st);
    }
}
