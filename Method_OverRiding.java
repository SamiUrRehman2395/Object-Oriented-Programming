public class Method_OverRiding {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        b.meth2();
        //if i do this meth2 of class A will be printed by calling it from object B

    }
}

class A{

    public void meth2(){
        System.out.println("Method 2 of A");
    }
}

//class B extends A{
//
//    public void meth3(){
//        System.out.println("Method 3 of B");
//    }
//
//}


//Output : Method 2 of A
//But if we want to print Method 2 of B
//we have to make meth2 inside B as well
//now if we call  meth2 , it will print meth2 of B , not of A
//Like this

class B extends A{
    @Override
    public void meth2(){
        System.out.println("Method 2 of B");
    }

    public void meth3(){
        System.out.println("Method 3 of B");
    }

}