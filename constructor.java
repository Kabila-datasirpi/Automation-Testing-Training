public class constructor {

    int marks;
    String name;

    //parameterized constructor//
 constructor(int a, String b){
     marks=a;
     name=b;

 }

    public static void main(String[] args){
     //object creation//
        constructor obj1= new constructor(10,"kabila");
        constructor obj2=new constructor(20,"abinaya");
        System.out.println("first object marks="+obj1.marks);
        System.out.println("first object name="+obj1.name);
        System.out.println("second object name="+obj2.marks);
        System.out.println("second object name="+obj2.name);

    }
}
