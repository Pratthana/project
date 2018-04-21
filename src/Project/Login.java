package Project;

import java.util.Scanner;
class Login {  //loginพนักงาน
    
    private String  Username[] = {"PJ" , "BN","Admin"};
    private String  Password[] = {"7052" , "3347","1234"};
    private String  Staff[] = {" Pratthana  Jinapol " , " Bussaporn  Nopparat ","NewPost"};
    public static String staff1,staff2,admin;
    
    public void login(){
        System.out.println("");
        System.out.println("              - - กรุณาเข้าระบบ - -            ");
                            accessory c = new accessory ();
                            Choice ch = new Choice();
    do{        
          Scanner log = new Scanner(System.in);
                   System.out.println("");
                   System.out.print(" ชื่อผู้ใช้  --> ");
                   staff1 = log.nextLine();
                   System.out.print(" รหัสผู้ใช้ --> ");
                   staff2 = log.nextLine();
                  
    }while(!(staff1.equals(Username[0])&&staff2.equals(Password[0])||staff1.equals(Username[1])&&staff2.equals(Password[1])
            ||staff1.equals(Username[2])&&staff2.equals(Password[2])));           
          
          if(staff1.equals(Username[0])&&staff2.equals(Password[0])){     
                     System.out.print(" พนักงาน1 : " + Staff[0]);       
                                        ch.choice1();
} else if (staff1.equals(Username[1])&&staff2.equals(Password[1])){
                     System.out.print(" พนักงาน2 : " + Staff[1]);      
                                        ch.choice1();
}else if(staff1.equals(Username[2])&&staff2.equals(Password[2])){
                    System.out.println(" เจ้าของร้าน : " + Staff[2]);    
                                         c.choice();

                      
}         
}
 
   Login(){
        System.out.println("______________________________________________");
    }
    Login(int q){
        this();
    }
    
    public  String getCosumer(){
    return admin;
    }

  
    }


    


