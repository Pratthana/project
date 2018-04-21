package javaoop;

class A {
    public int x;
    
    A(){
        x=5;
        System.out.println(" x in constuctor A() ="+x);
    }
    A(int y){
        this();
        x=y;
        System.out.println(" x in constuctor A(int y) ="+x);
    }
}
