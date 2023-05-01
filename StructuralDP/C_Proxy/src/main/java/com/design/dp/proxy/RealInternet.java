package com.design.dp.proxy;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String site) throws Exception {
        System.out.println("connecting to " + site);
    }
}
