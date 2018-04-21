
package javaoop;

import java.util.Scanner;

class accessory extends KD_Post implements Accessoryy{
    
    public static int a,b,m,store,countAll;
    public static String YN,p;
    public static String YN1;
    public static int price_a,price_accessory,count_accessory; 
    Bill bb = new Bill();
    Login ll = new Login();
    public String accessory[]={"ซองธรรมดา", "ซองขนาดA4","ซองน้ำตาล","ซองขยาย" ,"ซองกันกระเเทก","กล่อง ก.",
                                                "กล่อง ข." ,"กล่อง ค.","กล่อง ง.","กล่อง จ.","แสตมป์ ดวง 1 บาท","แสตมป์ ดวง 3 บาท",
                                                "แสตมป์ ดวง 5 บาท"};
    public int pacc[]={1,7,10,15,20,12,17,22,27,32,1,3,5};
    public int storage[]={5,5,5,5,5,5,5,5,5,5,5,5,5};
    public void choice1() {}
    public void choice() {
        Scanner ad = new Scanner(System.in);
            int k=0;
               System.out.println("");
               for (int i = 0; i < storage.length; i++) {
                    System.out.println( "("+(i+1)+")"+ "  " +accessory[i]+ "\t\t" +storage[i] );
}
     do{
                System.out.println("");
                System.out.print(" จำนวนชิ้นสินค้าที่ต้องการเพิ่มในสต๊อก ?? --> ");
                                       m= ad.nextInt();
              for( int i = 0 ; i< storage.length ; i++ ){
                    storage[i]=storage[i]+ m;
                } 
              System.out.println("");
              for ( int i = 0; i< storage.length ; i++ ) {
                    System.out.println( (i+1)+ "  " + accessory[i] + "\t\t" + storage[i]);
              }
do{
                    System.out.println("");
                    Scanner adm = new Scanner(System.in);
                    System.out.print(" ต้องการเพิ่มจำนวนสินค้าอีกมั้ย  ( Y / N ) ??  --> ");
                                    p = adm.nextLine();
                                       
} while(!(p.equals("y")||p.equals("Y")| p.equals("n")||p.equals("N")));
           if(p.equals("y") || p.equals("Y")) {
                    this.choice();
           }else if (p.equals("n") || p.equals("N")){ 
                    ll.login(); 
           }else{
           }
     }while(k!=0);    
    }
    
    
    public void Accessory(){
do {
            System.out.println("");
            for( int i = 0 ; i< accessory.length ; i++){
                System.out.println( "("+(i+1)+")"+" "+accessory[i]+"\t\t"+pacc[i]+".- ");}
                Scanner mn = new Scanner(System.in);
                System.out.print(" โปรดเลือกสินค้า --> ");
                b = mn.nextInt();
                System.out.println("");
                if (b == 1) {
                    System.out.print(" \t> ซองธรรมดา   1.- < ");
                    price_accessory = 1; 
                    store=storage[0];
                } else if (b == 2) {
                    System.out.print(" \t> ซองขนาดA4   7.- < "); 
                    price_accessory = 7; 
                    store=storage[1];
                } else if (b == 3) {
                    System.out.print(" \t> ซองน้ำตาล   10.- < ");
                    price_accessory = 10; 
                    store=storage[2];
                } else if (b == 4) {
                    System.out.print(" \t> ซองขยาย    15.- < ");
                    price_accessory = 15; 
                    store=storage[3];
                } else if (b == 5) {
                    System.out.print(" \t> ซองกันกระเเทก   20.- < ");
                    price_accessory = 20; 
                    store=storage[4];
                } else if (b == 6) {
                    System.out.print(" \t> กล่อง ก.  12.- < ");
                    price_accessory = 12; 
                    store=storage[5];
                } else if (b == 7) {
                    System.out.print(" \t> กล่อง ข.   17.- < ");
                    price_accessory = 17; 
                    store=storage[6];
                } else if (b == 8){
                    System.out.print(" \t> กล่อง ค.   22.- < ");
                    price_accessory = 22; 
                    store=storage[7];
                } else if (b == 9) {
                    System.out.print(" \t> กล่อง ง.   27.- < " );
                    price_accessory = 27; 
                    store=storage[8];
                } else if (b == 10) {
                    System.out.print(" \t> กล่อง จ.   32.- < ");
                    price_accessory = 32; 
                    store=storage[9];
                } else if (b == 11) {
                    System.out.print(" \t> แสตมป์ ดวง 1 บาท   1.- < ");
                    price_accessory = 1; 
                     store=storage[10];
                } else if (b == 12) {
                    System.out.print(" \t> แสตมป์ ดวง 3 บาท   3.- < ");
                    price_accessory = 3; 
                    store=storage[11];
                } else if (b == 13) {
                    System.out.print(" \t> แสตมป์ ดวง 5 บาท   5.- < ");
                    price_accessory = 5; 
                    store = storage[12];
                } else {
                    System.out.println("");
                    System.out.println(" #### ขออภัย !! คุณไม่ได้ไปต่อ....  โปรดเลือกใหม่อีกครั้ง ####");;
                }
}while (b!=1 && b!=2 && b!=3 && b!=4 && b!=5 && b!=6 && b!=7 
        && b!=8 && b!=9 && b!=10 && b!=11 && b!=12 && b!=13);
            System.out.println();
            super.count();
            count_accessory = Count;
           if(store == 0){
                    System.out.println("");
                    System.out.println(" #### ขออภัยค่ะ  สินค้าหมด !!! #### ");
                    Accessory();       
           }
            if(( store-count_accessory) < 0 ){
                  System.out.println("");
                  System.out.println(" #### ขออภัย !! สินค้ามีไม่พอสำหรับคุณ #### "); 
                    Accessory();
                
            }else{    
                    store = store - count_accessory;
                    storage[b-1] = store;
                    this.price();
            }
do{
           System.out.println("");
           Scanner sc1 = new Scanner(System.in);
           System.out.print(" ต้องการสินค้าเพิ่ม ( Y / N ) ??  --> ");
                      YN = sc1.nextLine();                 
} while(!(YN.equals("y")||YN.equals("Y")| YN.equals("n")||YN.equals("N")));
        if(YN.equals("y") || YN.equals("Y")) {
            Accessory();
        } else if (YN.equals("n") || YN.equals("N")){ 
               do{
           System.out.println("");
           Scanner sc2 = new Scanner(System.in);
           System.out.print(" ต้องการชำระเงิน ( Y / N ) ??  --> ");
                      YN1 = sc2.nextLine();
} while(!(YN1.equals("y")||YN1.equals("Y")| YN1.equals("n")||YN1.equals("N")));
        if(YN1.equals("y") || YN1.equals("Y")) {
            bb.bill();
           
        } else if (YN1.equals("n") || YN1.equals("N")){ 
              choice1();
        }   
        
        } 
    }
    
public void price(){
    System.out.println("______________________________________________");
    System.out.println("");
    price_a = price_accessory*count_accessory;
    System.out.println(" ราคาสินค้า "+ price_a + " บาท ");
    sum = sum+price_a;
    this.price_1();
}
public double price_1(){
    total_a = sum;
    System.out.println(" ราคารวมสินค้า " +total_a+ " บาท ");
    System.out.println("______________________________________________");
    return total_a;

}


}
