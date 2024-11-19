import java.util.Scanner;

public class Main {
    private Scanner scan;
    private String[] days;
    private int[] dayNumbers;

    // Default constructor
    public Main() {
        this.scan = new Scanner(System.in);
        this.days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        this.dayNumbers = new int[]{0, 1, 2, 3, 4, 5, 6};
    }

    // Parameterized constructor for all fields
    public Main(Scanner scan, String[] days, int[] dayNumbers) {
        this.scan = scan;
        this.days = days;
        this.dayNumbers = dayNumbers;
    }

    // Constructor that initializes only the days array
    public Main(String[] days) {
        this.scan = new Scanner(System.in); // Default Scanner
        this.days = days; // Use the provided days array
        this.dayNumbers = new int[]{0, 1, 2, 3, 4, 5, 6}; // Default dayNumbers
    }

    public static void main(String[] args) {
        // Example 1: Using the default constructor
        Main program1 = new Main();
        program1.run();

        // Example 2: Using the parameterized constructor for all fields
        Scanner customScanner = new Scanner(System.in);
        String[] customDays = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
        int[] customDayNumbers = {0, 1, 2, 3, 4, 5, 6};
        Main program2 = new Main(customScanner, customDays, customDayNumbers);
        program2.run();

        // Example 3: Using the constructor that initializes only the days array
        String[] alternateDays = {"Day1", "Day2", "Day3", "Day4", "Day5", "Day6", "Day7"};
        Main program3 = new Main(alternateDays);
        program3.run();
    }

    public void run() {
        System.out.print("Enter a day number: ");
        int dayNum = Integer.parseInt(scan.nextLine());
        System.out.println(returnDayInWord(dayNum));
    }

    public String returnDayInWord(int dayNum) {
        if (dayNum < 0 || dayNum >= dayNumbers.length) {
            return "Not a valid day";
        }
        return days[dayNum];
    }
}
