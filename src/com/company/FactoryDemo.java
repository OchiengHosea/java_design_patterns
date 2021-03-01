package com.company;

import com.company.factory_pattern.Website;
import com.company.factory_pattern.WebsiteFactory;
import com.company.factory_pattern.WebsiteType;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
