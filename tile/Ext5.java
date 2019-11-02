class Father{
    private int money;

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void printInfo(){
        System.out.println("this is father");
    }

    public void printInfo2(){
        System.out.println("this is father");
    }
}

class Son extends Father{
    public void printInfo(){
        System.out.println("this is son");
    }
    public void printInfo2(){
        System.out.println("this is father");
    }        
    

}

public class Ext5{
    public static void main(String args[]){
        Son son = new Son();
        son.setMoney(100);
        son.printInfo();
    }
}
