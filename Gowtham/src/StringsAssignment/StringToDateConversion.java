package StringsAssignment;

import java.text.ParseException;             //3
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConversion {
    public static void main(String[] args) {
        String dateString = "2023-09-01";
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("String converted to Date: " + date);
        } catch (ParseException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
