public class MultiDimoArrayDemo {
    public static void main(String[] args) {
        String[][] names = {{"Mr.", "Mrs.", "Ms."}, {"Smith", "Jones"}};
        System.out.println(names[0][0] + names[1][0]);//Mr. Smith

        System.out.println(names[0][2] + names[1][1]); //   MS.Jones
    }
}
//NEW METHOD ==>> object using keyword "new" , constructor, interface