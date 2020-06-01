package lesson5;

public class homeWorkOverload {
    void same(){

    }
    int same(int a){
        return a;
    }
    int same(int a, int b){
        return (a + b);
    }
    int same(int a, int b, int c){
        return same (a,b + c);
    }
    int same(int a, int b, int c, int d){
        return same(a,b,c+d);
    }
    int same(int a, int b, int c, int d, int e){
        return same(a, b, c, d + e);
    }
}
class homeWorkOverloadTest{
    public static void main(String[] args) {
        homeWorkOverload test = new homeWorkOverload();
        System.out.println(test.same(23));
        System.out.println(test.same(54, 56));
        int a = test.same(21, 66, 44);
        System.out.println(a);
    }
}