import java.util.Scanner;

public class Main {
    // Declare instance variables
    private Scanner scan;
    private String[] days;
    private int[] dayNumbers;

    // Constructor to initialize instance variables
    public Main() {
        scan = new Scanner(System.in);
        days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        dayNumbers = new int[]{0, 1, 2, 3, 4, 5, 6};
    }

    public static void main(String[] args) {
        Main program = new Main(); // Create an instance of Main class
        program.run();
    }

    // Instance method to run the logic
    public void run() {
        System.out.print("Enter a day number: ");
        int dayNum = Integer.parseInt(scan.nextLine());
        System.out.println(returnDayInWord(dayNum));
    }

    // Instance method to return the day in words
    public String returnDayInWord(int dayNum) {
        if (dayNum < 0 || dayNum >= dayNumbers.length) {
            return "Not a valid day";
        }
        return days[dayNum];
    }
}
