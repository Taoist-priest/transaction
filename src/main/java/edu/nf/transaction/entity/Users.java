package edu.nf.transaction.entity;

import java.util.UUID;

public class Users {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString().replace("-","");
        int length = str.length();
        System.out.println(str+"||"+length);
    }
}
