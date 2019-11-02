public class Div11{
    public static void main(String args[]){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int r = 0;

        System.out.println("Begin of div");
        try{
            r = div(m, n);
        }
        catch(ArithmeticException e){
            System.out.println("main: "+e);
        }
        catch(NumberFormatException e){
            System.out.println("main: "+e);
        }
        catch(RuntimeException e){
            System.out.println("main: "+e);
        }
        catch(Exception e){
            System.out.println("main: "+e);
        }

        System.out.println("End of div");

        System.out.println(m+"/"+n+"="+r);
    }

//    public static int div(int m, int n) throws ArithmeticException{
    public static int div(int m, int n) throws Exception{
        int r = 0;
        try{
            r = m / n;
        }
        catch (ArithmeticException e){
            System.out.println("div:"+e);
            try{
            throw new Exception("my error");
            }
            catch (Exception e2){
                System.out.println("div:"+e2);
            }
        }
        finally{
            System.out.println("finally of div");
        }
        return r;
    }
}
