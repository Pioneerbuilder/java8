package com.github.lambda.study.init;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by tangxiaodong on 2018/2/8.
 */
public class PredicateFactory {

    public static Predicate<String> productPredicate(String val) {
        Objects.requireNonNull(val, "val cannot be null!");
        return n -> n.contains(val);
    }
}
