class Father{
    private int  money;

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }

    public void printInfo(){
        System.out.println("this is father");
    }

}

class Son extends Father{
    public void printInfo(){
        System.out.println("this is son");
    }

    public void playGame(){
        System.out.println("playGame ...");
    }
}

class Daughter extends Father{
    public void printInfo(){
        System.out.println("this is daughter");
    }
}

public class Cnv{
    public static void main(String args[]){
        Son son = new Son();
        Daughter daughter = new Daughter();
        
        Father f = son;
        
        f.printInfo();
        
        f = daughter;
        f.printInfo(); 
    }
}
