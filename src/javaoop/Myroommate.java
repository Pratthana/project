package javaoop;

import java.util.Scanner;

            public class Myroommate {
                public static void main(String[] args ){
          String p ;
          
                    Scanner name = new Scanner( System.in);
                    System.out.print(" Nickname is >> ");
                                      p = name.nextLine();
                                      
                     
                     Roommate d = new Roommate();
                                  d.ID = 427;
                                  d.setNickname(p);
                                  
                     Roommate  k = new Roommate();
                     k.room();
                     System.out.println(" \n============================================ " );
                     System.out.println("\n \t  Hello !! >>> "+ p);          
                     k.helloRoommate();  
                     System.out.println(" \n============================================ " );
                     System.out.println( );
                     k.Privateroommate();
                     System.out.println(" \n " );
                     k.total();
                     System.out.println(" \n Nice to you ><' " );
                    
                }

    
    }

    
    

    
    

    

    

