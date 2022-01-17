package com.security;

public class Protect implements IEncrypt {

    @Override
    public String encrypt(String clear) {
        return Encrypt.secure().complex(1).encrypt(clear);
    }

    @Override
    public String decrypt(String encodedstring) {
        return Encrypt.secure().complex(1).decrypt(encodedstring);

    }

}
