class FreshJuice {
    
    enum FreshJuiceSize{ SMALL, MEDUIM , LARGE}
    FreshJuiceSize size;
}


public class FreshJuiceTest {
    
   // public static void main(String [] args) {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDUIM ;
    }
}



