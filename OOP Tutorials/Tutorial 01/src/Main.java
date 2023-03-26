public class Main<k> {
    public static void main(String[] args) {

        //Q1
        System.out.println("Welcome to Online Learning");
        System.out.println("");
        System.out.println("Please virus go away!");

        //OR

        System.out.println("Welcome to Online Learning\nPlease virus go away!");

        //OR

        System.out.println("""
                Welcome to Online Learning
                Please virus go away!""");

        //Q3
        int n = 100;
        System.out.print("List of even numbers from 1 to 100: \n");
        for (int i = 2; i < n; i = i + 2) {
            System.out.print(i + " ");
        }

        //Q4
        int x = 1;
        while (x < 100) {
            if (x % 2 == 0)
                System.out.println(x);
            x++;
        }

        //Q6
        int min = 2;
        int max = 48;
        Main array = new Main();

        for (int k = 1; k < 7; k++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

            System.out.println(random_int);
        }
    }
}



