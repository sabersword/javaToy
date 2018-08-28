package org.ypq.proxyfactory;

import java.util.Date;

public class Person {

    public void code(String ide) {
        System.out.println("正在使用的ide是" + ide);
    }

    public Date eod(int times) {
        System.out.println("调用的是int, 下班时间" + new Date().toGMTString());
        return new Date();
    }

    public void eod(Integer times) {
        System.out.println("调用的是Integer,下班时间" + new Date().toGMTString());
    }
}
