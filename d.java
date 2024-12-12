import java.util.*;
interface out{
    void outin();
    interface in
    {
        void innm();
    }
}
class d implements out.in{
    public void innm()
    {
        System.out.println("Hello i'm inner method");
    }
    public static void main(String args[])
    {
        d obj=new d();
        obj.innm();

    }
    }

    
