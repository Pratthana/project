package Project;

import Project.Bill;
import java.util.Scanner;


class Carry extends accessory implements Carryy{
    public static int ps,bb;
    public static String NY;
    public static String YN2;
    public static int a;
    public static int price_c,price_e,price_d,price_carry;
    public static int price_carry1,price_carry2,price_carry3;
    Bill bbb = new Bill();
    public void choice1(){}
    
    public void Carry(){
        Scanner c = new Scanner(System.in);
        super.balance();
        
        System.out.println("\n");
          this.EMS((int) Balance);
          this.LTB((int) Balance );
          this.PSD((int) Balance);
          do{
          System.out.print(" โปรดเลือกการขนส่ง --> ");
          ps = c.nextInt();
          this.pricee();

          if(ps==1){
               super.address();
               System.out.println("");
               }else if(ps==2){
               super.address();
               System.out.println("");
           }else if(ps==3){
               super.address();
               System.out.println("");   
           }else{
               System.out.println(" ___________ โปรดเลือกใหม่อีกครั้ง!! _____________ ");
            }
          }while(ps!=1&&ps!=2&&ps!=3);
    
    
                    
           do{
           Scanner cc = new Scanner(System.in);
           System.out.print(" ต้องการเพิ่มรายการการขนส่ง ( Y / N ) ??  --> ");
                                    NY = cc.nextLine();
  }while(!(NY.equals("y") || NY.equals("Y") || NY.equals("n") || NY.equals("N")));
        if(NY.equals("y") || NY.equals("Y")) {
            Carry();
        }else if (NY.equals("n") || NY.equals("N")){ 
            do{
           System.out.println(" ");
           Scanner sc3 = new Scanner(System.in);
           System.out.print(" ต้องการชำระเงิน  ( Y / N ) ??  --> ");
                      YN2 = sc3.nextLine();
} while(!(YN2.equals("y")||YN2.equals("Y")| YN2.equals("n")||YN2.equals("N")));
        if(YN2.equals("y") || YN2.equals("Y")) {
            bbb.bill();
        } else if (YN2.equals("n") || YN2.equals("N")){ 
            choice1();
        }   
        } 
}            
      
    
           void EMS(int Balance){
               bb = Balance/100;
                      switch(bb){
                        case 0 : System.out.println(" (1)   EMS   42.- "); 
                                       price_carry = 42;  break;
                        case 1 : System.out.println(" (1)   EMS   67.- ");
                                       price_carry = 67;  break;
                        case 2 : System.out.println(" (1)   EMS   93.- ");
                                       price_carry = 93;  break; 
                        case 3 : 
                        case 4 :    
                        case 5 : System.out.println(" (1)   EMS  122.- ");
                                       price_carry = 122;  break;
                        case 6 : 
                        case 7 :    
                        case 8 :     
                        case 9 :    
                        case 10 : System.out.println(" (1)   EMS  157.- ");
                                       price_carry = 157;  break; 
                        default : System.out.println(" (1)   EMS  300.- ");
                                       price_carry = 300;  break; 
                      }
                      
                      
         }
           
           void LTB(int Balance){
               bb = Balance/100;
                      switch(bb){
                         case 0 : System.out.println(" (2)   ลงทะเบียน   16.- "); 
                                       price_carry1 = 16;  break;
                         case 1 : 
                         case 2 : System.out.println(" (2)   ลงทะเบียน   18.- ");
                                       price_carry1 = 18;  break; 
                         case 3 : 
                         case 4 :    
                         case 5 : System.out.println(" (2)   ลงทะเบียน   28.- ");
                                       price_carry1 = 28;  break;
                         case 6 : 
                         case 7 :    
                         case 8 :     
                         case 9 :    
                         case 10 : System.out.println(" (2)   ลงทะเบียน  38.- ");
                                       price_carry1 = 38;  break; 
                         default : System.out.println(" (2)   ลงทะเบียน   58.- ");
                                       price_carry1 = 58;  break; 
                      } 
                       
                   
           }
           
           void PSD(int Balance){
               bb = Balance/1000;
                      switch(bb){
                         case 0 : 
                         case 1 : System.out.println(" (3)   พัสดุธรรมดา   20.- ");
                                       price_carry2 = 20;  break;
                         case 2 : System.out.println(" (3)   พัสดุธรรมดา   35.- ");
                                       price_carry2 = 35;  break; 
                         case 3 : System.out.println(" (3)   พัสดุธรรมดา   50.- ");
                                       price_carry2 = 50;  break; 
                         case 4 : System.out.println(" (3)   พัสดุธรรมดา   65.- ");
                                       price_carry2 = 65;  break;    
                         case 5 : System.out.println(" (3)   พัสดุธรรมดา   80.- ");
                                       price_carry2 = 80;  break;                       
                         default : System.out.println(" (3)   พัสดุธรรมดา   100.- ");
                                       price_carry2 = 100;  break; 
                      }
          
           }

    public double pricee(){
       price_c = price_carry;
       price_d = price_carry1;
       price_e = price_carry2;
       
       if(ps==1){
           
           System.out.println(" \n ราคา EMS  = " + price_c+ " บาท ");
           total1 = total1+price_c ;
       }else if(ps==2){
           
           System.out.println(" \n ราคาลงทะเบียน  = " + price_d+ " บาท ");
           total2 = total2+price_d ;
           
       }else if(ps==3){
           
           System.out.println(" \n ราคาพัสดุธรรมดา   " + price_e+ " บาท ");
           total3 = total3+price_e;
           }
           total_c=total1+total2+total3;
           System.out.println(" ราคารวมการขนส่ง "+total_c+ " บาท ");
        return total_c;
 }}

    
 
