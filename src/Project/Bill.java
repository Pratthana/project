package Project;

import java.util.Scanner;
class Bill extends KD_Post{
     
    public void choice(){}
    public void choice1(){}
    public void price(){}
    public static String NY1;
    public static double money = 0;
    public static double change = 0;
  
    
    public void bill(){
        
        total = total_a + total_c;
        System.out.println("");
        System.out.println("______________________________________________");
        System.out.println(" ");
        System.out.println("               KD_Toppost          ");
        System.out.println("                 ขนส่งไทย             ");
        System.out.println("          โทร : 093-7507052       ");
        System.out.println(" ");
        System.out.println("----------------------------------------------");
        System.out.println(" เลขอ้างอิง                         #Ttds4448 ");
        System.out.println(" ");
        System.out.println(" ค่าอุปกรณ์ & บรรจุภัณฑ์                " +total_a+ " บาท ");
        System.out.println(" ค่าขนส่ง                              " +total_c+ " บาท ");
        System.out.println(" จำนวนเงินชำระ                        " +total+     " บาท ");
        System.out.println(" ");
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" รวมทั้งสิ้น                            " +total+    " บาท ");
        Money(); total=0;
        System.out.println(" เงินทอน                             "+change+ " บาท ");
        System.out.println("_____________________________________________");
        System.out.println("=============== ขอบคุณที่ใช้บริการ ==============");
        System.out.println("______________________________________________");
        System.out.println("");
          total=0;
          total_a=0;
          total_c=0;
      

        
      } 
    
    
    
    public static void Money(){
        Scanner mon = new Scanner(System.in);
                     System.out.print(" เงินสด :                             ");
                            money = mon.nextDouble();
        if( money<total ){
do{      
           System.out.println(" ");
           System.out.println(" #### ยอดเงินไม่พอชำระ  กรุณาเพิ่มเงินด้วยค่ะ ! #### ");
                     System.out.print(" เงินสด :                             ");
                            money = mon.nextDouble();
                    
}while(money< total);         
            change = money - total;  
            
        }else if( money >= total){
                   change = money - total;  
        } else {
           
        }
        
    
    }


}