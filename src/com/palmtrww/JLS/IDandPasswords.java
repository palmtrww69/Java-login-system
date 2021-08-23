package com.palmtrww.JLS;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();



    IDandPasswords(){



        logininfo.put("palmtrww","pizza");

        logininfo.put("GG","PASSWORD");

        logininfo.put("palmtrwwisawesome","abc123");

    }



    public HashMap getLoginInfo(){

        return logininfo;

    }


}
