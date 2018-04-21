package javaoop;

//public class P {
    class P {
        P(){
            System.out.println("P()");
        }
        P(int a){
            System.out.println("P(int a)");
        }
    }
class Q extends P {
    Q(){
        System.out.println("Q()");
    }
}
//}
