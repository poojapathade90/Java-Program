class Base
{
    public int A ;      // characteristic
    public int B ;
    public Base()       // Behaviour / functon / methods
    {
        System.out.println("Inside Base Constructor");
        this.A = 11;
        this.B = 21;
    }
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}
// class Derived : public Base
class Derived extends Base 
{
    public int X ;       // characteristic
    public int Y ;
    public Derived()
    {
        System.out.println("Inside Derived Constroctor");
        this.X = 51;
        this.Y = 101;

    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}
class Single 
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        bobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);
    }
}
// Base bobj2 = new Derived(); ------upcasting 
// Derived dobj2 = new Base(); ------downcasting 
// Base bobj = new Base();   --------No casting 
