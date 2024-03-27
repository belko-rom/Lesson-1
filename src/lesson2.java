import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        //Homework_2
        //Task_1
        System.out.println("Task_1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число " + number + " Чётное");
        } else System.out.println("Число " + number + " Нечётное");

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


        //Task_3
        System.out.println("Task_3");
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println(square);
        }


        //Task_4
        System.out.println("Task_4");
        int a = 7;
        int x = 1;
        while (x <= 14) {
            int subsequence = a * x;
            x++;
            System.out.print(subsequence + " ");
        }

        //Task_5
        System.out.println();
        System.out.println("Task_5");
        int num = scanner.nextInt();
        int sum = 0;
        if (num > 0) {
            for (int j = 1; j < num; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }

        //Task_6
        System.out.println("Task_6");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Task_7
        System.out.println("Task_7");
        int f1 = 1;
        int f2 = 1;
        int sum2 = 0;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= 11; i++) {
            sum2 = f1 + f2;
            f1 = f2;
            f2 = sum2;
            System.out.print(sum2 + " ");
        }

        //Task_8
        System.out.println("Task_8");
        double z = 4.9;
        System.out.println((int)(z + 0.5));

    }
}
