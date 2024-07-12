package com.designpatterns.structural;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
        OfficeInternetAccess access = new ProxyInternetAccess("Yeswanth Yerra");  
        access.grantInternetAccess();  
    }  
}
