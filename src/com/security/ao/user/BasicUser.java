package com.security.ao.user;

import java.util.HashMap;

import com.security.IEncrypt;

public class BasicUser implements User {

    private String username;
    private String pwd;
    private HashMap<String, String> parms;
    private IEncrypt ie;

    public BasicUser(String username) {
        this.username = username;
    }

    public BasicUser(String username, String pwd, HashMap<String, String> parms) {
        this.username = username;
        this.pwd = pwd;
        this.parms = parms;

    }

    @Override
    public String getUserName() {

        return this.username;
    }

    @Override
    public String getPasword() {
        return this.pwd;
    }

    @Override
    public void setUsername(String username) {

        this.username = username;
    }

    @Override
    public void setPassword(String pwd) {
        this.pwd = pwd;

    }

    @Override
    public void parms(HashMap<String, String> parms) {
        this.parms = parms;

    }

    @Override
    public User encryptAlgoritm(IEncrypt ie) {
        return null;
    }

}