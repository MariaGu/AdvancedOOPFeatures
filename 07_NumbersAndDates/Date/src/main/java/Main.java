import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 15;
        int month = 03;
        int year = 1991;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        String text = "";
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));

        for (int i = 0; !today.isBefore(birthday.plusYears(i)); i++){
            text += i + " - " + birthday.plusYears(i).format(formatter) + System.lineSeparator();
        }
        return text;
    }
}