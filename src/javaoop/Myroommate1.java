package javaoop;
import java.util.Scanner;
public class Myroommate1 {
   
    public static void main(String[] args) {
        String p;
        Roommate1 k = new Roommate1(" My Roommate ");
       
        Scanner name = new Scanner(System.in);
        System.out.print(" Nickname is >> ");
        p = name.nextLine();
    
        k.ID = 427;
        k.setNickname(p);
        k.room();
        System.out.println(" \n============================================ ");
        System.out.println("\n \t Hello !! >>> " + p);
        k.helloRoommate();
        System.out.println(" \n============================================ ");
        System.out.println();
        k.Privateroommate();
        System.out.println(" \n ");
        k.gettotal();
        System.out.println(" \n Nice to you ><' ");
    }
}

