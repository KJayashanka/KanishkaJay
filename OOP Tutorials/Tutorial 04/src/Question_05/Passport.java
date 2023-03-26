package Question_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;
    public Passport(String n, String birth, int expire) {
        super(n);
        birthLocation = birth;
        expirationYear = expire;
    }
    public Passport(String birth, int expire) {
        super();
        birthLocation = birth;
        expirationYear = expire;
    }
    public boolean isExpired() {
// find out the current year
        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        if (expirationYear < current_year)
            return true;
        else
            return false;
    }
    public String format() {
        String name = super.format();
        return name + ", Birth location: " + birthLocation + ", Expires: " +
                expirationYear;
    }
}

