package com.security;

public class Demo {

    public static void main(String args[]) {

        // la complejidad debe ser la misma para poder cifrar y decifrar un mensaje

        String encoded = Encrypt.secure().complex(3).encrypt("clear");
        System.out.println(encoded);
        String decoded = Encrypt.secure().complex(3).decrypt(encoded);
        System.out.println(decoded);

    }

}
