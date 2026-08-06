
public class Practice2 {

    public static void main(String[] args) {
        int javaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int numberOfDays = 5;

        int weeklyJavaHours = javaHoursPerDay * numberOfDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * numberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;

        System.out.println("Weekly Java Hours: " + weeklyJavaHours);
        System.out.println("Weekly Aptitude Hours: " + weeklyAptitudeHours);
        System.out.println("Total Preparation Hours: " + totalPreparationHours);
    }
}
