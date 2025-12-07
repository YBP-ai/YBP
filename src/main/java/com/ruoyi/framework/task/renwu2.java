package com.ruoyi.framework.task;


import org.springframework.stereotype.Component;

@Component("任务2")
public class renwu2 {
    public void 任务2(String params)
    {
        System.out.println("执行没有参方法：" + params);
        System.out.println("执行没有参方法2：" + params);
    }
}
