package com.ruoyi.framework.task;


import org.springframework.stereotype.Component;

@Component("renwu2")
public class renwu2 {
    public void print(String params)
    {
        System.out.println("执行没有参方法：" + params);
        System.out.println("执行没有参方法2：" + params);
    }
}
