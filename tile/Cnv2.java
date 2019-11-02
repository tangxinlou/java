class Father{
    private int money;

    public void setMoney(int money){
        this.money = money;
    }
     
    public int getMoney(){
        return money;
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
        System.out.println("playGame ..");
    }
}

class Daughter extends Father{
    public void printInfo(){
        System.out.println("this is daughter");
    }
}

public class Cnv2{
    public static void main(String args[]){
        Father f = new Son();
        Son son = (Son)f;
    }
}
