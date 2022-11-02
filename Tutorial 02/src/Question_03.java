import java.awt.Rectangle;

public class Question_03 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(r1);
        r2.grow(10,20);
        System.out.println("Rectangle 1: "+r1);
        System.out.println("Rectangle 2: "+r2);

        //Question 03 Part II
        double n1 = 150;
        double n2 = n1;
        n2 = n2 * 20; // grow n2
        System.out.println(n1);
        System.out.println(n2);
    }
}
