package javaoop;

import java.util.Scanner;

        public class Roommate {  
    
       public static int ID;
            public String nickname;
            static int room;
            static String name;
            static String faculty;
            static  int major;
            static int pay, total;
            
        
        public void setNickname(String name){ 
                nickname = name;
}           

         void room(){
           int id;  
do{
              Scanner room= new Scanner( System.in);
              System.out.print(" Password >> ");
                          id = room.nextInt();        
}while(id!=ID);              
        }
          
        public  void  helloRoommate(){
            
                    System.out.println(" My nickname is Daow. Welcome to our room ^^' ");
}
        public void  Privateroommate()  { 
               
                Scanner privater = new Scanner(System.in);
                       System.out.print(" What is your name ?? \n     >>>  ");
                                   name = privater.nextLine();
                 Scanner privater1 = new Scanner(System.in);  
do{
                       System.out.print(" Did you study Coc ??  Y/N \n    >>>  ");
                                    faculty = privater1.nextLine(); 
                                    
          if( faculty.equals("Y") || faculty.equals("y")  ){
                      System.out.print(" College of Computing ");
                      major();           
          } else if ( faculty.equals("N") || faculty.equals("n") ){
                        Scanner privaterr = new Scanner(System.in);                  
                       System.out.print(" Did you study ??  \n    >>>  ");
                                    faculty = privaterr.nextLine(); 
                                    
           }
}while(!faculty.equals("Y")&&!faculty.equals("y")&&!faculty.equals("N")&&!faculty.equals("n"));
        }
   public int total(){
                                total = total+pay*4;
                              System.out.println("Total is "+total);
                              
    return total;
        }         
 
        public void major(){
                       System.out.println(" (1) SE   \n (2) GEO   \n (3) E-biz  ");
do{                       
               Scanner privater2 = new Scanner(System.in);            
                       System.out.println(" Where are the major  ?? \n     >>>  ");
                                    major = privater2.nextInt(); 
          if( major==1 ){
              System.out.print(" \n(1) SE ");
              pay = 23000;
          }else if ( major==2 ){
              System.out.print(" (2) GEO ");
              pay = 20000;
          }else if ( major==3 ){
              System.out.print(" (3) E-biz ");
              pay = 18000;
          }
          
}while( major!= 1 && major!= 2 && major!= 3);
        }

        }