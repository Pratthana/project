
package javaoop;


abstract class Abstract {
    
    abstract void greet1();
    abstract void greet2();

}

abstract class One extends Abstract {
    
    void greet1() {
        System.out.println(" Hello ");       
    }
}

abstract class Two  extends  One {
     void greet2() {
                  System.out.println(" Hi1 ");   
    
}

class Abstract1{
    
    public static void main ( String[] args) {
        Two d  = new Two() {};
        d.greet1();
        d.greet2();
    }
}
