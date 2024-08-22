// class Demo define overload method 
class Demo 
{
    public int Addition(int a, int b)
    {
        return a + b;
    }
    public int Addition(int a, int b, int c)
    {
        return a + b + c;
    }
    public double Addition(double a , double b)
    {
        return a + b;
    }
    public double Addition(double a, double b, double c)
    {
        return a + b + c;
    }
}                                                                                                                                                                           

class Overloading
{
    public static void main(String Arg[]),
    {
        Demo obj = new Demo();
        int A = 10, B = 20, C = 30, iRet = 0;
        double x = 10.8, y = 90.7, z = 70.9, dRet = 0.0;

        iRet = obj.Addition(A,B);
        System.out.println(iRet);
        
        iRet = obj.Addition(A,B,C);
        System.out.println(iRet);

        dRet = obj.Addition(x,y);
        System.out.println(dRet);

        dRet = obj.Addition(x,y,z);
        System.out.println(dRet);

    }
}
