public class Test {

   public static void main(String[] args ){

       Calculate request = new Calculate(3, 2, "Add");
       Chain chain1 = new ADD();
       Chain chain2 = new Mult();

       chain1.CalucateNextChain(request);
       chain2.CalucateNextChain(request);


   }





}
