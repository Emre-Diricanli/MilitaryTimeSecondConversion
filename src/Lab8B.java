import java.util.Scanner;
public class Lab8B {

    public static String repeatNTimes(String s, int i){
        if (i <= 0) {
            return "";
        }else{
            return s + repeatNTimes(s, i-1);
        }
    }

    public static boolean isReverse(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        } else if (s1.length() == 0) {
            return true;
        } else if (s1.charAt(0) != s2.charAt(s2.length()-1)) {
            return false;
        }else {
            return isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));
        System.out.println("Enter the first string");
        String s1 = input.nextLine();
        System.out.println("Enter the second string");
        String s2 = input.nextLine();

        if (isReverse(s1, s2)){
            System.out.println(s1 + " is the reverse of " + s2);
        }else{
            System.out.println(s1 + " is not the reverse of " + s2);
        }

    }
}