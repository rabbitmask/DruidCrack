package com.rabbitmask.dc;

import com.alibaba.druid.util.DruidPasswordCallback;
import com.alibaba.druid.filter.config.ConfigTools;

import java.util.Scanner;

public class DruidCrack extends DruidPasswordCallback {
    public static void main(String[] args) {

        String banner = " ____          _   _ _____             _\n" +
                "|    \\ ___ _ _|_|_| |     |___ ___ ___| |_\n" +
                "|  |  |  _| | | | . |   --|  _| .'|  _| '_|\n" +
                "|____/|_| |___|_|___|_____|_| |__,|___|_,_|";
        System.out.println(banner);

        System.out.print("\t\tA Tiny Tools To DruidCrack | By RabbitMask\n");

        Scanner s = new Scanner(System.in);
        System.out.print("请输入您的密文：");
        String pwd = s.nextLine();

        Scanner k = new Scanner(System.in);
        System.out.print("请输入您的公钥：");
        String key = k.nextLine();

        try {
            String decryptword = ConfigTools.decrypt(key, pwd);
            System.out.println("您的密码明文为："+decryptword);
        } catch (Exception e) {
            System.out.println("ERROR！请确认公钥与密文是否正确");
        }
    }
}
