                                                            ///* ABSTACT CLASS */
 // Abstact class= we can not create Object  And if one function in class is abstact then class will also become abstact automatically.
 //* In abstact class you have to create child class then acess by creating object */
 //? abstact function is present in parents class then we have to @overide the function in child class.
 // Abstact function can not have body eg" void f1();
 //* If  Abstact function in any class then you have to make class abstract or overide */

 abstract class Demo1 { 
    int x, y; 
    void f1() {
        x=6;
        y=9;
    }
    abstract void f2 (); 
    Demo1 () {     
        System.out.println("Parents constructor executed");
    }
}
    class Demo2 extends Demo1 { 
        int z; 
        void f3() {
            z=8;
        }
        void f2 () { //* override of abstact class */
        }
        Demo2 () {  
            System.out.println("Child constructor executed");
        }
    }
class Abs {
    public static void main(String [] args) {
    Demo2 d2=new Demo2(); 
    }
}