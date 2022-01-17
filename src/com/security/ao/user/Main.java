package com.security.ao.user;

import com.security.Protect;
import com.security.IEncrypt;

public class Main {

    public static void main(String[] args) {

        /*
         * User basic = new BasicUser("Alex");
         * System.out.println(basic.getPasword());
         */
        User protect = new UserProtected();
        IEncrypt ie = new Protect();
        protect.encryptAlgoritm(ie);
        protect.setPassword("AlexReyes2021");
        System.out.print(protect.getPasword());

    }

}
