package com.frankieyao.springcore.syntax;

public class InstanceOfTest {
    public static void main(String[] args) {
//        Object bean = "Frankie Yao";
        Object bean = 12;

        if (bean instanceof String beanStr) {
            System.out.printf("The value of bean is %s\n", beanStr);
        } else if (bean instanceof Integer beanInt) {
            System.out.printf("The value of bean is %d\n", beanInt);
        }
    }
}
