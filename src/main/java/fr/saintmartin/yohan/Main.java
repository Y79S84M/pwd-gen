package fr.saintmartin.yohan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final int FIRST_WORD = 0;
    public static final int SECOND_WORD = 1;
    public static final int THIRD_WORD = 2;
    public static String[] usersWords = {"","",""};

    public static void main(String[] args) {

        greetUser();
        getInputFromUser(FIRST_WORD);
        getInputFromUser(SECOND_WORD);
        getInputFromUser(THIRD_WORD);
        System.out.println(Arrays.toString(usersWords));
        makeTheUserBelieveItIsHardToGenerateThePassword();
        provideTheUserWithTheSimplestSolution();
        provideTheUserWithAStrongSolution();


    }

    public static void greetUser() {
        System.out.println("================================");
        System.out.println();
        System.out.println("PWD-GEN is warming up ... ");
        System.out.println("Start thinking about three words.");
        System.out.println("Three words that are not related to each others.");
        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.println("PWD-GEN is ready to help you out !");
        System.out.println();
        System.out.println("================================");
    }

    public static void getInputFromUser(int wordSequence){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert word number "+ (wordSequence+1) +":");
        usersWords[wordSequence] = sc.nextLine();
        while(usersWords[wordSequence].isBlank()) {
            System.out.println(usersWords[wordSequence]);
            System.out.println("The word must not be blank... try again");
            usersWords[wordSequence] = sc.nextLine();
        }
    }

    public static void makeTheUserBelieveItIsHardToGenerateThePassword() {
        for(int i = 0; i<= 7; i++){
            try {
                TimeUnit.MILLISECONDS.sleep(750);
                System.out.print('#');
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" F*^k ! that was hard...");
    }

    public static void provideTheUserWithTheSimplestSolution(){
        System.out.println("Here is the simplest password you can have with the words you've picked up :");
        String password = String.join("",usersWords);
        System.out.println(password);
    }

    public static void provideTheUserWithAStrongSolution(){
        System.out.println("________________________________");
        System.out.println("Now here is what I would use as my new password if I were you :");

    }
}