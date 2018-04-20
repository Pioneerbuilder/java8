package com.github.lambda.study.init;

import java.math.BigDecimal;

/**
 * Created by tangxiaodong on 2018/2/8.
 */
public class Buss {

    private String name;
    private int count;
    private BigDecimal value;

    public Buss(String name, int count, BigDecimal value) {
        this.name = name;
        this.count = count;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Buss{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", value=" + value +
                '}';
    }

}
