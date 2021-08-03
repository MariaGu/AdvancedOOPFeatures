import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {

    LocalDate birthday = LocalDate.of(1996, 1, 21);
    System.out.print(getPeriodFromBirthday(birthday));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {

    int years = Period.between(birthday, LocalDate.now()).getYears();
    int months = Period.between(birthday, LocalDate.now()).getMonths();
    int days = Period.between(birthday, LocalDate.now()).getDays();

    return years + " years, " + months + " months, " + days + " days";
  }

}