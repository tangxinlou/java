class Person{
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void printInfo(){
        System.out.println("age :"+ age);

    }

    public   Person() {
        System.out.println("Person()");
    }

    public   Person(int age){
        System.out.println("Person (int age)");
        this.age = age;
    }
}

class Student extends Person{
    private String school;

    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool(){
        return school;
    }

    public Student(String school){
        super(5);
        System.out.println("Student(String school)");
        this.school = school;
    }

    public void printInfo(){
        System.out.println("school = "+school+"; age = "+getAge());
    }
}


public class Ext4{
    public static void main(String args[]){
        Student stu = new Student("ustc");
        System.out.println(stu.getAge());
        System.out.println(stu.getSchool());
        stu.printInfo();

    }
}
