import java.util.Scanner;

public class SimpleCalculator {

    
    public static void main(String[] args) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number");
        int x = scanner.nextInt();
        System.out.println("Input number");
        int y = scanner.nextInt();
        
        scanner.nextLine(); //Solves the error in getting input

        System.out.println("Choose operation(add/sub/mul/div)");
        String op = scanner.nextLine();

        switch (op) {
            case "add":
                result = x + y;
                break;
            case "sub":
                result = x - y;
                break;
            default:
                break;
        }
        //Eroor here need to change
        System.out.println("Result is: " + result);

    }
}
