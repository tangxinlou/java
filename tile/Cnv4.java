class Father{
    private int money;

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money  = money;
    }

    public void printInfo(){
        System.out.println("this is father");
    }
}

class Son extends Father {
    public void printInfo(){
        System.out.println("this is son");
    }

    public void playGame(){
        System.out.println("playGame ..");
    }
}


class Daughter extends Father {
    public void printInfo(){
        System.out.println("this is Daughter ");
    }
}

public class Cnv4{
    public static void main(String args[]){
        Father f = new Father();
        Son  s = new Son();
        Daughter d = new  Daughter();
        print(f);
        print(s);
        print(d);
    }

    public static void print(Father f){
        f.printInfo();
    }
}
