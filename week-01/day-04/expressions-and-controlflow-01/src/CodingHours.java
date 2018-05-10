public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int dailyCodingHours = 6;
        int semesterPeriod = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int workDays = 5;
        int codingHours = (workDays * dailyCodingHours * semesterPeriod);
        System.out.println(codingHours);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double weeklyWorkHours = 52.;
        double codingPercentage = (workDays * dailyCodingHours)/(weeklyWorkHours) * 100;
        int percentage = (int) codingPercentage;
        System.out.println(percentage);
    }
}