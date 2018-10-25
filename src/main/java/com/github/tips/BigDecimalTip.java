package com.github.tips;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTip {

    public static void main(String[] args) {
        BigDecimal bigDecimal0 = new BigDecimal(0);
        BigDecimal bigDecimal1 = new BigDecimal(0.00);
        BigDecimal bigDecimal2 = new BigDecimal(0).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(0, 2);

        System.out.println(bigDecimal0.equals(bigDecimal1));
        System.out.println(bigDecimal1.equals(bigDecimal2));
        System.out.println(bigDecimal2.equals(bigDecimal3));

        System.out.println(bigDecimal0.compareTo(bigDecimal1));
        System.out.println(bigDecimal1.compareTo(bigDecimal2));
        System.out.println(bigDecimal2.compareTo(bigDecimal3));
    }

}
