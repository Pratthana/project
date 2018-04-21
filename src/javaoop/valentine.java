package javaoop;

class valentine extends card{
    private final String to;
    public void greating(){
        System.out.println("#####Valentine Card#####");
        
    }
    public void print(){
        this.greating();
        System.out.println("TO >>> "+to);
        System.out.println("From >>> "+from);
    }
    valentine(String to,String from){
        this.to = to;
        this.from = from;
    }
}
