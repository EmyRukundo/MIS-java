
public class Overloading {
    public static  void main(String[]args){
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;

        int result1 = minFunction(a,b);
        double result2 = minFunction(c,d);
        System.out.println("min value= "+ result1);
        System.out.println("min value= "+ result2);
    }

    // Integer
    public static int minFunction(int n1, int n2){
        int min;
        if(n1 > n2)
            min = n2;
        else
            min = n1;
                    return min;
    }

    // double
    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
};
