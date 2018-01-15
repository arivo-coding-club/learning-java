import java.io.Console;
import java.util.Scanner;

/**
 * Created by newt.on on 2018. 1. 14..
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("%s", "이름을 입력해 주세요");
        System.out.println("콘솔로부터 입력받은 : " + name);

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요: ");
        String input = sc.nextLine();
        System.out.println("입력: " + input);
    }
}
