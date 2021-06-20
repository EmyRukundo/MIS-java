public class ArrayDemo {
    public static void main(String[] args){
        int[] anArray;
        //integers
                anArray = new int[10];
        // allocates memory of 6 integers
         anArray[0]=100;
        //initialize first element
          anArray[1] = 200;
       // initialize second element
           anArray[2] = 300;

        //etc. anArray[3] = 400; anArray[4]=500;
        anArray[5]=600;
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 3: " + anArray[5]);
    }

}
