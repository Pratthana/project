package javaoop;

import java.util.Scanner;
abstract class KD_Post {
    public abstract void choice1();
    public abstract void choice();
    public abstract void price();
    public static int a;
    public static String b,c,t;
    static double Balance;
    static double total=0;
    static double total_a=0;
    static double total_c=0;
    static int total1=0;
    static int total2=0;
    static int total3=0;
    static int sum  =0;
    static int Count;
   
public void balance() {   
        System.out.println("");
        Scanner f = new Scanner(System.in);
        for(int x =1 ; x<16 ; x++){ 
             System.out.print(" = ");
        }
        System.out.print(" \n      กรุณากรอกน้ำหนักของสินค้า  -->  ");  
                                 Balance = f.nextDouble( );
        for(int x =1 ; x<16 ; x++){
             System.out.print(" = ");
        }
}
    

public void count() {
        System.out.println("");
        Scanner c = new Scanner(System.in);
        System.out.print(" ต้องการจำนวนสินค้าเท่าไร  ??? --> ");
                                Count = c.nextInt();
    }


public void address(){
      System.out.println(" ");
      for(int x =1 ; x<16 ; x++){ 
             System.out.print(" = ");
        }
             System.out.print(" \n           กรุณากรอกข้อมูลผู้รับ   \n");    
     for(int x =1 ; x<16 ; x++){
             System.out.print(" = ");
        }
             addresss1();
}

public void addresss1(){
         System.out.println("");
         Scanner bb = new Scanner(System.in);
           System.out.print(" ชื่อผู้รับ --> ");
                  b = bb.nextLine();
            
        Scanner cc = new Scanner(System.in);
           System.out.print(" ที่อยู่ผู้รับ --> ");
                  c = cc.nextLine(); 
     
        Scanner tt = new Scanner(System.in);
           System.out.print(" รหัสไปรษณีย์ --> ");
                  t = tt.nextLine(); 
   
            
            
                  
}

}