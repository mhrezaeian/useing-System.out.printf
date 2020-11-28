package com.makabstu;

import java.util.Scanner;

    public class Main{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            // در یک حلقه از وردی یک استرینگ و یک اینتیجر میگیریم
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                // پس از چک کردن شرط آن را با فرمت خواسته شده چاپ می کنیم
                if (s1.length()<11&&x<1000){
                    System.out.printf("%-10s%03d%n",s1,x);
                    // %-10s برای ایجاده فاصله از راست به اندازه 10 کاراکتر از نشان روبرو استفاده می کنیم
                }
                else
                    System.out.println("I can not print this");

                }
            System.out.println("================================");


        }
    }