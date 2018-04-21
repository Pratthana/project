package javaoop;

public class data {
    int sum = 20;
    int sum1 = 15;
    int sum2 = 50;
    int sum3 = 20;
    int sum4 = 30;
    int sum5 =10;
    double total=0;
    double total1=0;
    double vat=0;
    double ser=0;
    public void print(){
    sum = sum*1; 
    sum1 = sum1*2;
    sum2 = sum2*1;
    sum3 = sum3*1;
    sum4 = sum4*3;
    sum5 = sum5*3;
              System.out.println(" 1.  Cornae  Corn  Chip       20*1 \t \t \t \t\t \t  " +sum
                      + "\n 2.  Cornpuff  Corn  Chip     15*2 \t \t \t \t\t \t  " +sum1
                      + "\n 3.  Dozo  Rice  Cracker      50*1  \t \t \t \t\t \t  " +sum2
                      + "\n 4.  Hanami  Prawn  Cracker   20*1 \t \t \t \t\t \t  " +sum3
                      + "\n 5.  Lay  Classic  Meduim     30*3  \t \t \t \t\t \t  " +sum4
                      + "\n 6. Candy    10*3                      \t\t\t\t\t\t" +sum5);       
}
public void Total(){
    total = sum+sum1+sum2+sum3+sum4+sum5;
    System.out.println(" Item  Summary :                                                               " +total);
    vat = total*7/100;
    System.out.println(" Vat (7%) :                                                                     " +vat);
    ser = total*10/100;
    System.out.println(" Service  Charge  (10%) :                                                       " +ser);
}   

public void Total1(){
    total1 = total+vat+ser;
    System.out.println(" Total  Price :                                                                " +total1);
}
}