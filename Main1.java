import java.util.*;
abstract interface math{
    void print();
}
class d implements math{
    public  void print()
    {
        System.out.println("hello");
    }
}
    public class Main1{
        public static void main(String args[])
        {
            d obj=new d();
            obj.print();
        }
    }

        
    
    

