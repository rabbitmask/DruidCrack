package com.rabbitmask.dc;

import com.alibaba.druid.util.DruidPasswordCallback;
import com.alibaba.druid.filter.config.ConfigTools;

import java.util.Scanner;

public class DruidCrack extends DruidPasswordCallback {
    public static void main(String[] args) {
        System.out.print("Welcome To DruidCrack！By RabbitMask\n");
        Scanner s = new Scanner(System.in);
        System.out.print("请输入您的密文：");
        String pwd = s.nextLine();
        s.close();
        String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKZxh/6AESER0sRSuq2K35FTNtGMv4yAvX3B/VMLx0F9VJtwhZdDgU/VEpvv1sNmRU9zp4abp+EL2dljss1VILsCAwEAAQ==";
        try {
            String decryptword = ConfigTools.decrypt(publicKey, pwd);
            System.out.println("您的密码明文为："+decryptword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
