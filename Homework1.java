import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n1 = sc.nextInt();
        sum += n1;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        int n2 = sc.nextInt();
        sum += n2;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        int n3 = sc.nextInt();
        sum += n3;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        int n4 = sc.nextInt();
        sum += n4;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);

        System.out.print("정수를 입력하세요: ");
        int n5 = sc.nextInt();
        sum += n5;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.", sum);

        sc.close();
    }
}
