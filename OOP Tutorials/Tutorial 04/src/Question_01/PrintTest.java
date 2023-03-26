package Question_01;

public class PrintTest {
    public static void main(String[] args) {
        String grades1[] = {"A", "B", "B", "A", "C"};
        Student s1 = new Student("John", grades1);
        s1.print();
        String grades2[] = new String[5];
        grades2[0] = "C";
        grades2[1] = "A";
        grades2[2] = "B";
        grades2[3] = "D";
        grades2[4] = "F";
        Student s2 = new Student("Helen", grades2);
        s2.print();
        Letter l1 = new Letter("My letter");
        l1.print();
    }
}
