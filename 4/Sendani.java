import java.util.ArrayList;
import java.util.Scanner;

public class Sendani {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number: ");
        int i = scanner.nextInt();
        System.out.println(fib2(i));
    }

    public static int fib(int i) {
        if (i < 3){
            return 1;
        }
        else {
            return fib(i-1) + fib(i-2);
        }
    }

    public static int fib2(int i) {
        int j = 1;
        int k = 1;
        int temp = 1;
        while (i - 2 > 0){
            temp = k + j;
            j = k;
            k = temp;
            i--;
        }
        return temp;
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
    public static void temp() {
        ArrayList a = new ArrayList();
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 20000; j++) {
                a.add(i + j);
            }
        }
    }
}
