class Person{
    String name;
    String getName(){
        return "guangdong" +name;
    }
};


public class Oop {
    public static void main(String args[]) {
        Person pl = new Person();
        pl.name =  "zhangsan";

        Person p2 = new Person();
        p2.name = "lisi";

        System.out.println(pl.getName());
        System.out.println(p2.getName());
    }
}
