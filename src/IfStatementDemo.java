//public class IfStatementDemo {
//        public static void main(String[] args){
//            int a = 10,b= 20;
//            if(a>b)
//               System.out.println("a<b");
//            if(b>a)
//                System.out.println("a<b");
//        }
//    }

//public class IfStatementDemo {
//    public static void main(String[] args) {
//        int age = 20;
//        if (age > 20) {
//            System.out.println("age is not teen, this is person ni mukuru");
//        }
//    }
//}

//public class IfStatementDemo {
//    public static void main(String[] args) {
//        int a = 20; int b =20;
//        if (a > b) {
//            System.out.println("a > b");
//        }else{
//            System.out.println("b > a");
//        }
//    }
//}

public class IfStatementDemo{
    public static void main (String[] args){
        int a=10; int b=20; int c=30; int status=-1;
        if(a>b && a> c){
            status=1;
        }
        else if(b > c){
            status =2;
        }
        switch (status){
            case 1: System.out.println("a is the greatest");
            break;
            case 2: System.out.println("b is the greatest");
            break;
            case 3: System.out.println("c is the greatest");
                break;
            default: System.out.println("Cannot be determined");
        }
    }
}