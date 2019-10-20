public class PuppyNew{
    public PuppyNew(String name){
        //这个构造器只有一个参数 name
        System.out.println("小狗的名字是：" + name);
    }

    public static void main(String[] args){
        //下面这个将创建一个Puppy对象
        PuppyNew myPuppy = new PuppyNew("tommy");
    }
}
