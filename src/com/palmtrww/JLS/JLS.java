package com.palmtrww.JLS;

public class JLS {

    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();



        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());


    }

}
