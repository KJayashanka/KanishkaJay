import java.util.*;
public class DriverLicense extends Card {
    private int expirationYear;
    public DriverLicense(String n, int expire) {
        super(n);
        expirationYear = expire;
    }
    public DriverLicense(int expire) {
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
        return name + ", Expires: " + expirationYear;
    }
}

