class Jarray
{
    public static void main (String Arg[])
    {

        // declare a jagged array
        int Arr[][] = new int[3][];
      
        // Create the arrays for each row
        Arr[0] = new int[4];
        Arr[1] = new int[2];
        Arr[2] = new int[5];

       // Initialize values of the array
        Arr[0][0] = 10;
        Arr[0][1] = 20;
        Arr[0][2] = 30;
        Arr[0][3] = 40;

        Arr[1][0] = 50;
        Arr[1][1] = 60;

        Arr[2][0] = 70;
        Arr[2][1] = 80;
        Arr[2][2] = 90;
        Arr[2][3] = 100;
        Arr[2][4] = 110;

        // Print the length of the array and each sub-array
       System.out.println(Arr.length);
       System.out.println(Arr[0].length);
       System.out.println(Arr[1].length);
       System.out.println(Arr[2].length);

    }
}
