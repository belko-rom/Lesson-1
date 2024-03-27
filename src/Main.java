public class Main {

    public static void main(String[] args) {
        //Task_1
        System.out.println("Task_1");
        int b = 44;
        int c = 56;
        System.out.println(4 * (b + c - 1) / 2);

        //Task_2
        System.out.println("Task_2");
        int n = 98;
        int sum2 = (n/10) + (n%10);
        System.out.println(sum2);

        //Task_3
        System.out.println("Task_3");
        int x = 367;
        int sum3 = (x/100) + (x/10%10) + (x%100%10);
        System.out.println(sum3);

        //Task_4
        System.out.println("Task_4");
        double z = 4.9;
        System.out.println((int)(z + 0.5));

        //Task_5
        System.out.println("Task_5");
        int q = 21;
        int w = 8;
        int v = q / w;
        int y = q % w;
        System.out.println(q + " / " + w + " = " + v + " и "+ y + " в остатке");

        //Task_6
        System.out.println("Task_6");
        int t = 33;
        int s = 8;
        t = t + s;
        s = t - s;
        t = t - s;
        System.out.println(t);
        System.out.println(s);

    }
}