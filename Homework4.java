import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) { return m; }
        else if(m > n) {
            m = m % n;
            return gcd(n, m);
        }
        else {
            n = n % m;
            return gcd(m, n);
        }
    }
    
    int gcd2(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 h4 = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.err.printf("두 수의 최대 공약수는 %d입니다.\n", h4.gcd(a, b));
        System.err.printf("두 수의 최대 공약수는 %d입니다.", h4.gcd2(a, b));

        sc.close();
    }
}
