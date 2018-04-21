package javaoop;

public class datamain {
                                       data p = new data();
       
    public static void main(String [] args){
        String ID = " 000123456 ";
        String Customer = " Mr Somsak  Rukchart ";
        String Datetime = " 19/04/2018   11:25 ";
        
        System.out.println(" Tops  Super  Market ");
        data p = new data();
        System.out.println(" Order ID : "+ID + "           Customer : "+Customer +"              Datetime : "+Datetime);
        System.out.println("--------------------------------------------------------------------------------------------------");
        
        System.out.println(" #.               || name                                                || Total Price                                       ");
        
        System.out.println("--------------------------------------------------------------------------------------------------");
        p.print();
        System.out.println("--------------------------------------------------------------------------------------------------");
        p.Total();
        System.out.println("--------------------------------------------------------------------------------------------------");
        p.Total1();
        System.out.println("--------------------------------------------------------------------------------------------------");
    } 
   
}
