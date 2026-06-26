// ? Interface= In this we can not create object as same as abstacct class and also member varible are default-- Public ,Static,Final(value asign turrant)
//? And function default Public or Abstact
// * NOTE= if we create child interface then use "extends"
// * NOTE 2= if we create child class thenn use "implements"
// important= In Interface varible can ineherit as well as overide
//  important2= static function can not be inherit its only be overide

interface i1 {
    int x=6;
    void f1();
    static void f2() {
        System.out.println(x);
    }
}
interface i2 extends i1 {
    int x=9;
static void f2() {
        System.out.println(x);
    }
void f3();
}
class C1 implements i2 {
    static void f2() {
        System.out.println(x);
    }
    public void f1() {

    }
    public void f3 () {

    }
}
public class InterF {
    public static void main(String[] args) {
C1 c1=new C1();
i2.f2();
    }
}
