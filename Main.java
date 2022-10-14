import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static String calc(String str){

        int result = 0;
        String[] numbers;

        if (str.indexOf('+') > 0) {
            numbers = str.split("[+]");
            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else if (str.indexOf('-') > 0) {
            numbers = str.split("[-]");
            result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        } else if (str.indexOf('/') > 0) {
            numbers = str.split("[/]");
            result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
        } else if (str.indexOf('*') > 0) {
            numbers = str.split("[*]");
            result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
        } else {

        }

        System.out.println(result);

        return String.valueOf(result);
    }
}














//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите выражение: ");
//        String data = scanner.nextLine();
//        separator(data);
//    }
//
//    public static String[] separator(String message) {
//        String[] operation = {"+", "-", "*", "/"};
//        String[] separatorIndex = {"\\+", "-", "/", "\\*"};
//        int actionIndex = -1;
//        for (int i = 0; i < separatorIndex.length; i++) {
//            if (message.contains(operation[i])) {
//                actionIndex = i;
//                break;
//            }
//            System.out.println(i);
//
//        }
//        return new String[]{String.valueOf(actionIndex)};
//
//    }
//}