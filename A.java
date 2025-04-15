abstract class B{
    public abstract void C();
}
public class A{
    public static void main(String[] args) {
        D m=new D();
        m.C();
    }
}
class D extends B{
    public void C(){
        System.out.println("Hello world");
    }
}

