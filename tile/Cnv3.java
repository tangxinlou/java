class Father{
    private int money;

    public int getMoney(){
        return money;
    }

    public void setMoney(){
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

public class Cnv3{
    public static void main(String args[]){
        Father f = new Father();
        Son s = new Son();
        Daughter d = new Daughter();

        print(f);
        print(s);
        print(d);
    }

    public static void print(Father f){
        f.printInfo();
    }

    public static void print(Son s){
        s.printInfo();
    }

    public static void print(Daughter d){
        d.printInfo();
    }
}
