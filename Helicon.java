import java.util.Scanner;

public class Helicon {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        long max = Long.MIN_VALUE;

        for (int k = 1; k <= N / 2; k++) {
            for (int start = 0; start < k; start++) {
                long sum = 0;
                for (int i = start; i < N; i += k) {
                    sum += A[i];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
