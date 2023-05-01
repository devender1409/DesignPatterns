package com.design.dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String site) throws Exception {
        if(bannedSites.contains(site)) throw new Exception("Acces Denied");
        internet.connectTo(site);
    }
}
