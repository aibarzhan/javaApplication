package lesson4;

public class Student {
    int ticket;
    String name;
    String surname;
    int yearsofstudy;
    float math;
    float economic;
    float foreignlanguage;

}

class StudentTest{
    double srednyaArifmetika(Student eto){
        double srednyaOcenka = (eto.economic + eto.math + eto.foreignlanguage) / 3;
        System.out.println("Средняя оценка студента " + eto.name + " " + eto.surname + ": " + srednyaOcenka);
        return srednyaOcenka;

    }


    public static void main(String[] args) {
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();


        Student1.ticket = 1;
        Student1.name = "Kate";
        Student1.surname = "Johnson";
        Student1.yearsofstudy = 2008;
        Student1.math = 4.4f;
        Student1.economic = 3.1f;
        Student1.foreignlanguage = 5.21f;

        Student2.name = "Artur";
        Student2.surname = "Prisley";
        Student2.yearsofstudy = 2003;
        Student2.math = 5.9f;
        Student2.economic = 2.4f;
        Student2.foreignlanguage = 6.2f;


        Student3.name = "Konan";
        Student3.surname = "Doil";
        Student3.yearsofstudy = 2012;
        Student3.math = 9.3f;
        Student3.economic = 7.5f;
        Student3.foreignlanguage = 7.3f;

        StudentTest sTest = new StudentTest();
        sTest.srednyaArifmetika(Student1);
        sTest.srednyaArifmetika(Student2);
        sTest.srednyaArifmetika(Student3);

    }

}