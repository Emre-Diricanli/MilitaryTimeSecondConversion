import java.util.Scanner;
public class Lab8A {

    public static int recursive_multiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return recursive_multiply(num1, num2-1) + num1;
        }
    }

    public static int recursive_div(int num1, int num2){
        if (num2 == 0) {
            return -1;
        } else if(num1 == num2) {
            return 1;
        }else if(num1 < num2){
            return 0;
        }else{
            return recursive_div(num1-num2, num2)+1;
        }
    }

    public static int recursive_mod(int num1, int num2){
        if (num2 == 0) {
            return -1;
        }else if(num1 < num2){
            return num1;
        }else{
            return recursive_mod(num1-num2, num2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Choose form the following: ");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers ");
            System.out.println("2. Div 2 numbers ");
            System.out.println("3. Mod 2 numbers ");
            int menu = input.nextInt();
            int num1;
            int num2;

            switch (menu){
                case 1:
                    System.out.println("Enter first number ");
                    num1 = input.nextInt();
                    System.out.println("Enter second number ");
                    num2 = input.nextInt();
                    System.out.println("Answer: " + recursive_multiply(num1, num2)+ "\n");
                    break;
                case 2:
                    System.out.println("Enter first number ");
                    num1 = input.nextInt();
                    System.out.println("Enter second number ");
                    num2 = input.nextInt();
                    System.out.println("Answer: " + recursive_div(num1, num2) + "\n");
                    break;
                case 3:
                    System.out.println("Enter first number ");
                    num1 = input.nextInt();
                    System.out.println("Enter second number ");
                    num2 = input.nextInt();
                    System.out.println("Answer: " + recursive_mod(num1, num2)+ "\n");
                    break;
                case 0:
                    System.exit(0);
            }
        }while(true);
    }
}