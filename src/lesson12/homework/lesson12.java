package lesson12.homework;

import lesson11.Student;

import javax.imageio.stream.ImageInputStream;

public class lesson12 {

}
class StudentTest{
    public static void method1(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade){
            System.out.println("Студенты равны");  }
        else {
            System.out.println("Студенты не равны");
        }
    }
    public static void method2(Student s1, Student s2){
        if (s1.name.equals(s2.name)){
            if(s1.course == s2.course){
                if(s1.grade == s2.grade){
                    System.out.println("у двух студентов имя, курс и средний бал одинаковые");}
                else{

                    System.out.println("У двух студентов имя и курс одинаковый, но средний балл разные"); }}
                else {
                    System.out.println("У двух студентов имя одиноковые, но курс и среднйи балл разные");} }
                    else
            System.out.println("Студенты вообще разные");

    }

    public static void main(String[] args) {
    Student s1 = new Student("Aibar", 2, 1.9);
    Student s2 = new Student("Aibar", 2, 2.9);
    method2(s1, s2);

    }
}


