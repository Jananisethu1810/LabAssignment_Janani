/**
 * Desc  - To print the duration in days, months and years with regards to current system date.
 * @author Janani S
 *
 */
import java.time.*;

class DateCalculation {

	public static void findDuration(LocalDate inputDate, LocalDate currDate) {
		Period diff = Period.between(inputDate, currDate); // To calculate the difference between two dates in years, months, and days.
		System.out.println("No.of days: " + diff.getDays());
		System.out.println("No.of months: " + diff.getMonths());
		System.out.println("No.of Years: " + diff.getYears());
	}

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2018, 01, 10); // Start date
		LocalDate date2 = LocalDate.now(); // End date
		findDuration(date1, date2); // Function Call
	}
}
