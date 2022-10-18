import java.util.Scanner;

public class Test extends Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = in.next();
        calc(str);
    }
}
