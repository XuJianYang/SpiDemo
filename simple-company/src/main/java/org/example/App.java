package org.example;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         使用ServiceLoader 发现并加载服务
         */
        ServiceLoader<InternetService> loader = ServiceLoader.load(InternetService.class);

        /*
        面向接口编程
         */
        for (InternetService provider : loader) {
            provider.connectInternet();
        }
    }
}
