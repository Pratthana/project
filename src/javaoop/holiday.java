package javaoop;

class holiday extends card{
    public void greating(){
        System.out.println("#####Holiday Card#####");
        
    }
    public void print(){
        this.greating();
        System.out.println("TO >>> "+to);
        System.out.println("From >>> "+from);
    }
    holiday(String to,String from){
        this.to =to;
        this.from = from;
    }
}