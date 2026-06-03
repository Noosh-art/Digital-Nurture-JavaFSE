    import java.util.Scanner;

    public class Calculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Choose operation: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.println("Result = " + (a / b));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            sc.close();
        }
    }

