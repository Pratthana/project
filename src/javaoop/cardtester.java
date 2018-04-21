package javaoop;

import java.util.Scanner;
abstract class cardtester {
    public static void main(String[] args){
    String to;
    String from;
    String me;
    Scanner str = new Scanner(System.in);
    System.out.print("Your name (TO) : ");
    me = str.nextLine();
    
    String you;
    Scanner str1 = new Scanner(System.in);
    System.out.print("Your name (FROM) : ");
    you = str1.nextLine();
    
    holiday h = new holiday(me,you);
    h.print();
    System.out.println();
    valentine v = new valentine(me,you);
    v.print();
    
    }
    }