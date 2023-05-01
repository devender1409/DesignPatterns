package com.design.dp;

import com.design.dp.proxy.Internet;
import com.design.dp.proxy.InternetProxy;

public class ProxyTester {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        try
        {
            internet.connectTo("calmdevender.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}