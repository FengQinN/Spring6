package org.atguigu.annoAop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        System.out.println("输出结果:" + (i+j));
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return i-j;
    }

    @Override
    public int mul(int i, int j) {
        return i*j;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
