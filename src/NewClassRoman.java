import java.util.Scanner;
public class NewClassRoman {
    public static void main(String[] args) {
        System.out.println("Task_1");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int speed = (int) Math.round(a * 3.6);
        System.out.println(speed);

        //Task_2
        System.out.println("Task_2");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else if (t <= -20) {
            System.out.println("Cold");
        }
    }
}
