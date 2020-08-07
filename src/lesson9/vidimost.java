package lesson9;
public class  vidimost {

  int a = 1;
 static int b = 2;

   void abc(int a){
       this.a = a;
     System.out.println(a);
     System.out.println(b);
       System.out.println(this.a);
       System.out.println(this.b);
 }

    public static void main(String[] args) {

    vidimost aa = new vidimost();
    vidimost ab = new vidimost();
    aa.abc(23);
        System.out.println(ab.a);
        System.out.println(aa.a);



    }
}
