package com.security;

import java.util.Base64;

public class Encrypt implements IEncrypt {

    private int complex = 1;
    private static Encrypt encrypt;

    private Encrypt() {

    }

    public static Encrypt secure() {
        if (encrypt == null) {
            encrypt = new Encrypt();
        }
        return encrypt;
    }

    public Encrypt complex(int complex) {
        this.complex = complex;
        return encrypt;
    }

    @Override
    public String encrypt(String clear) {

        String encodedString = clear;

        for (int a = 0; a < this.complex; a++) {

            encodedString = Base64.getEncoder().encodeToString(encodedString.getBytes());

        }
        return encodedString;

    }

    @Override
    public String decrypt(String encodedstring) {

        String decodedString = encodedstring;

        for (int a = 0; a < this.complex; a++) {

            byte[] decodedBytes = Base64.getDecoder().decode(decodedString);
            decodedString = new String(decodedBytes);

        }

        return decodedString;

    }

}
