
    
       import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n (number of elements) and k (divisor)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int count = 0;

        // Nested loop to find pairs (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the pair is divisible by k
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }

        // Print the total number of pairs
        System.out.println(count);

        sc.close();
    }
}
    

