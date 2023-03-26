package Question_05;

public class CardHierarchyTest {
    public static void main(String[] args) {
        DriverLicense d1 = new DriverLicense("John Smith", 2008);
        DriverLicense d2 = new DriverLicense("Bill Jones", 2004);
        Passport p1 = new Passport("John Smith", "London", 2012);
        Passport p2 = new Passport("Bill Jones", "Glasgow", 2020);
        CreditCard c1 = new CreditCard("John Smith", 5555, 444444444);
// credit card without a name on it!
        CreditCard c2 = new CreditCard(7575, 1515151761);

        System.out.println(d1.format());
        System.out.println(d2.format());
        System.out.println(p1.format());
        System.out.println(p2.format());
        System.out.println(c1.format());
        System.out.println(c2.format());
    }
}
