package Project;

import Project.Carry;
import java.util.Scanner;

class Choice extends Carry{ 
    public static int a;
    static public  String admins;
    
    Login ll = new Login();
    
    public void choice(){
            System.out.println("");
            System.out.println("______________________________________________");
            System.out.println("- - - - - - - - - - รายการ - - - - - - - - - -");
            System.out.println(" (1)   จำหน่ายอุปกรณ์ บรรจุภัณฑ์ ");
            System.out.println(" (2)   การขนส่ง ");
            System.out.println(" (0)   ออกระบบ ");

        }
    
    public void choice1(){
        this.choice();
    do{
      Scanner sc = new Scanner(System.in);
        System.out.print(" โปรดเลือกรายการ --> ");
        a = sc.nextInt();
     
        if(a == 0){
            System.out.println("");
            ll.login();
            
         }else if(a == 1){
            System.out.println("");
            System.out.println("______________________________________________");
            System.out.println("- - - - - - - อุปกรณ์ & บรรจุภัณฑ์ - - - - - - - ");
            Accessory(); 
       
            
        }else if(a == 2){
            System.out.println("");
            System.out.println("______________________________________________");
            System.out.println("- - - - - - - - - การขนส่ง  - - - - - - - - - -");
            Carry();
               
        }else{
            System.out.println(" ___________ โปรดเลือกใหม่อีกครั้ง!! _____________ ");
        }    
    }while(a!=1&&a!=2&&a!=0);
    
    }

}
   

    
   



  
        
