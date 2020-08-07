package lesson11;

public class Student {
   public String name;
   public int course;
   public double grade;

    public Student (String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
                s1 = s2;
                s2 = s3;
    }

    public static void changeName(Student s1){
        s1.name = "Magzhan";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Aibar", 3, 4.2);
        Student st2 = new Student("Petr", 2, 7.5);
        changeName(st1);
        System.out.println(st1.name );
    }
}
