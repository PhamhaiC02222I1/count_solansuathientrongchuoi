package com.company;


import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap noi dung chuoi: ");
        s=sc.nextLine();
        System.out.println("Nhap ki tu: ");
        char c;
        c=sc.next().charAt(0);
        int count =0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                count++;

            }

        }
        System.out.println("so lan suat hien cua ki tu la :"+count);

    }

}
