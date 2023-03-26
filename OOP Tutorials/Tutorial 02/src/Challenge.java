import java.util.Random;

public class Challenge {
    public static void main(String []args){
        int main_count=0;
        Random ran = new Random();
        for (int c=0;c<365;c++) {


            Person[] array = new Person[366];

            int count = 0;
            int month;
            int day;

            int[] days_for_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            count = 0;
            outer_loop:
            while (count < array.length) {
                month = ran.nextInt(1, 12);
                day = ran.nextInt(1, days_for_month[month]);

                if (!(count == 0)) {
                    for (int s = 0; s < count; s++) {
                        if (!(array[s].month == month && array[s].day == day)) {
                            array[count] = new Person(month, day);

                        } else {
                            break outer_loop;
                        }
                    }
                } else {
                    array[count] = new Person(month, day);
                }
                count++;
            }
            main_count=main_count+(count+1);
//            System.out.println("Found!!\n" + (count + 1) + " peoples in this room.");
        }
        System.out.println("Average "+ (main_count/365) + " peoples in this room.");
    }
}





