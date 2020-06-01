package lesson6;

public class homeWorkStudent {
    homeWorkStudent(int id, String surname, String course, float mathAveregegrade, float economicAveragegrade, float algebraAveragegrade) {
        this.id = id;
        this.surname = surname;
        this.course = course;
        this.mathAveregegrade= mathAveregegrade;
        this.economicAveragegrade = economicAveragegrade;
        this.algebraAveragegrade = algebraAveragegrade;
    }
    public homeWorkStudent(int id, String surname, String course){
        this(id, surname, course, 0, 0, 0);
    }
    public homeWorkStudent(){
    }

   public int id;
    public String surname;
    public String course;
    float mathAveregegrade;
    float economicAveragegrade;
    float algebraAveragegrade;

    public static float sreniArifmetika(homeWorkStudent st) {
        float sredeOcenka = (st.mathAveregegrade + st.economicAveragegrade + st.algebraAveragegrade) / 3;
        System.out.println("Среднийарифметическая оценка студента " + st.surname + ": " + sredeOcenka);
        return sredeOcenka;

    }


}
class homeWorkStudentTest {



    public static void main(String[] args) {
        homeWorkStudent st1 = new homeWorkStudent();
        st1.id = 1;
        st1.surname = "Дулатов";
        st1.course = "3-й курс";
        st1.mathAveregegrade = 2.2f;
        st1.economicAveragegrade = 2.1f;
        st1.algebraAveragegrade = 3.3f;
        homeWorkStudent st2 = new homeWorkStudent(2, "Жакыпов", "4-й курс");
        st2.mathAveregegrade = 4.1f;
        st2.economicAveragegrade = 2.1f;
        st2.algebraAveragegrade = 4.9f;
        homeWorkStudent st3 = new homeWorkStudent(3, "Тураров", "2-й курс", 3.3f, 1.4f, 5.2f);
        homeWorkStudent test = new homeWorkStudent();
        test.sreniArifmetika(st1);


        }
    }

