import java.util.Scanner;
public class NewClassRoman {
    public static void main(String[] args) {
        //System.out.println("Hi");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int speed = (int) Math.round(a * 3.6);
        System.out.println(speed);
    }
}
