
/**
 * Desc  - To print the duration in days, months and years with regards to current system date.
 * @author Janani S
 *
 */
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.*;
public class DateCalculation {

	public static void main(String[] args) throws ParseException {
		Scanner scan=new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String inputString1 = scan.next();
		LocalDate date1 = LocalDate.parse(inputString1, dtf);
		LocalDate date2 = LocalDate.now();
		System.out.println(dtf.format(date2));
		Period period=Period.between(date1, date2);
		long totalDays=period.getDays();
		int totalMonths = period.getMonths();
		int totalYears=period.getYears();
		System.out.println ("Total Days: " + totalDays);
		System.out.println ("Total Months: " + totalMonths);
		System.out.println ("Total Years: " + totalYears);
		scan.close();
	}

}
