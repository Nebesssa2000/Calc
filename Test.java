import java.util.Scanner;

public class Test extends Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.next();
        calc(str);
    }

//    public static String calc(String str){
//
//        int result = 0;
//        String[] numbers;
//
//        if (str.indexOf('+') > 0) {
//            numbers = str.split("[+]");
//            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
//        } else if (str.indexOf('-') > 0) {
//            numbers = str.split("[-]");
//            result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
//        } else if (str.indexOf('/') > 0) {
//            numbers = str.split("[/]");
//            result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
//        } else if (str.indexOf('*') > 0) {
//            numbers = str.split("[*]");
//            result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
//        } else {
//
//        }
//
//        System.out.println(result);
//
//    return String.valueOf(result);
//    }
}