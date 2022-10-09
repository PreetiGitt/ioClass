package Practice;
class A{
     static public int a=10;
    /*A(int a){
        this.a=a;

    }*/
}
public class P1 {
    public static void main(String[] args) {
        /*A a1=new A();
        a1.a=5;
        change(a1);
        System.out.println(a1.a); // 10
        int x=5;
        change(x);
        System.out.println(x);*/
       /* A a1=new A();
        a1.a=5;
        change(a1);
        System.out.println("A obj:"+a1.a);// 5*/


        A a1=new A();

/*
        System.out.println(a1.a);
        A a2=new A();
        a2.a=10;

        System.out.println(a2.a);
        */
        int[] arr= new int[5];
        arr[5]=10/0;

    }
  /*  static  void change(A obj){
        obj.a=10;
    }
    static  void change(int x){
        x=20;

    }*/
    /*static  void change(A obj){
        obj=new A();
        obj.a=10;
    }*/
}
