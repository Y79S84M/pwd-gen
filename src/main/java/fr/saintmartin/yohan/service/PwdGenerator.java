package fr.saintmartin.yohan.service;

public class PwdGenerator {

    public PwdGenerator(){};

    public static String generatePwd(String[] usersInput) {
        return String.join("",usersInput);
    }
}
