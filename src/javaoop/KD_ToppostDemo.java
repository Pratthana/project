package javaoop;

import java.util.Scanner;
class KD_ToppostDemo {
    public static void main(String[] args){
        System.out.println("______________________________________________");
        System.out.println("");
        System.out.println("================  K D_Newpost  ===============");
        int x=0;
        Choice ch = new Choice();

        Login l = new Login();    //เข้าlogin
        l.login(); 
        String admin = l.getCosumer();
        accessory c = new accessory ();
        if(admin.equals("NewPost")){
            c.choice();
        }else{
            ch.choice1();
        }

}
}