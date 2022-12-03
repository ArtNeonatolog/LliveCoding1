import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long[] fibonachi = new long[(int) n];
        fibonachi [0] = 0;
        fibonachi [1] = 1;
        for (int i = 2; i < fibonachi.length; ++i) {
            fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
            System.out.println(fibonachi[i]);
        }
    }
}
