import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Age {
    private double decimalAge = 0;
    private String formattedAge = "0 years, 0 months, 0 days.";

    public Age(double decimalAge) {
        this.decimalAge = decimalAge;
        int totalDays = (int) (decimalAge * 365.25);
        LocalDate birthDate = LocalDate.now().minusDays(totalDays);
        this.formattedAge = formatAge(birthDate, LocalDate.now());
    }

    public Age(int year, int month, int day) {
        LocalDate actualDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        long daysBetween = ChronoUnit.DAYS.between(birthDate, actualDate);
        this.decimalAge = Math.round((daysBetween/ 365.25) * 100.0) / 100.0;
        this.formattedAge = formatAge(birthDate, actualDate);
    }

    public String formatAge(LocalDate birthDate, LocalDate actualDate) {
        Period period = Period.between(birthDate, actualDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        return years + " years, " + months + " months, " + days + " days.";
    }

    public double getDecimalAge() {
        return decimalAge;
    }

    public String getFormattedAge() {
        return formattedAge;
    }

    public String print() {
        return "Decimal age: " + getDecimalAge() + ", formatted age: " + getFormattedAge();
    }
}
