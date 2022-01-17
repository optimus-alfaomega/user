package com.security.ao.user;

import java.util.HashMap;

import com.security.IEncrypt;

public interface User {

    public String getUserName();

    public String getPasword();

    public void setUsername(String username);

    public void setPassword(String pwd);

    public void parms(HashMap<String, String> parms);

    public User encryptAlgoritm(IEncrypt ie);
}
