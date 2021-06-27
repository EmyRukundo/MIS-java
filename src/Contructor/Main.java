package Contructor;

//Example of default constructor
class Student01{
    int id;
    String name;

    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){

        Student01 s1=new Student01();
        Student01 s2=new Student01();

        s1.display();
        s2.display();
    }
}
// Output
// =>> 0 null
//==> 0 null
