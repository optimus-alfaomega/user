package com.security.ao.user;

import java.util.HashMap;

import com.security.IEncrypt;

public class UserProtected implements User {

    private String username = "";
    private String password = "";
    HashMap<String, String> parms;
    IEncrypt ie;

    public UserProtected() {

    }

    @Override
    public String getUserName() {
        return this.username;
    }

    @Override
    public String getPasword() {
        return this.password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String pwd) {
        if (this.ie != null) {
            this.password = ie.encrypt(pwd);
        } else {
            this.password = pwd;
        }

    }

    @Override
    public void parms(HashMap<String, String> parms) {
        this.parms = parms;
    }

    public HashMap<String, String> parms() {
        if (this.parms == null) {
            this.parms = new HashMap<String, String>();
        }
        return this.parms;
    }

    @Override
    public User encryptAlgoritm(IEncrypt ie) {
        this.ie = ie;
        return this;

    }
}