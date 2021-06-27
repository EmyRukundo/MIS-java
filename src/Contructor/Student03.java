package Contructor;

public class Student03 {
        int id;
        String name;
        int age;
        //creating two arg constructor
        Student03(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        Student03(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        void display(){System.out.println(id+" "+name+" "+age);}

        public static void main(String args[]){
            Student03 s1 = new Student03(87,"Benjamin", 24);
            Student03 s2 = new Student03(88,"Frank",25);
            s1.display();
            s2.display();
        }
}
