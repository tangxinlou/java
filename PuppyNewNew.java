public class PuppyNewNew{
    int puppyAge;
    public PuppyNewNew(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄是：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        /* 创建对象*/
        PuppyNewNew myPuppy = new PuppyNewNew("tommy");
        /*通过调用方法来设定Age*/
        myPuppy.setAge(2);
        /*通过调用另一个方法获取age*/
        myPuppy.getAge();
        /*你也可以像下面这样访问成员*/
        System.out.println("变量值 ：" + myPuppy.puppyAge);
    }
}
