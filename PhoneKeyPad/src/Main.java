import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = input.nextLine().toLowerCase();

        // Define variables
        char[] inStrArr = inStr.toCharArray();
        StringBuilder phoneNum = new StringBuilder();

        for (Character ch : inStrArr) {
            switch (ch){
                case 'a': case 'b': case 'c':   // same as: if (inChar == 'a' || inChar == 'b' || inChar == 'c')
                    phoneNum.append(2);
                    break;
                case 'd': case 'e': case 'f':
                    phoneNum.append(3);
                    break;
                case 'g': case 'h': case 'i':
                    phoneNum.append(4);
                    break;
                case 'j': case 'k': case 'l':
                    phoneNum.append(5);
                    break;
                case 'm': case 'n': case 'o':
                    phoneNum.append(6);
                    break;
                case 'p': case 'q': case 'r': case 's':
                    phoneNum.append(7);
                    break;
                case 't': case 'u': case 'v':
                    phoneNum.append(8);
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    phoneNum.append(9);
                    break;
                default:
                    phoneNum.append(ch);
                    break;
            }
        }

        System.out.println("The phone number is " + phoneNum);


    }
}