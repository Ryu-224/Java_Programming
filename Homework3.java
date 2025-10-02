import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요?: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        int max, min;
        max = arr[0];
        min = arr[0];

        for (int j = 1; j < num; j++) {
            if (max < arr[j]) {
                max = arr[j]; 
            }

            else if (min > arr[j]) {
                min = arr[j];
            }

        } 

        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
        sc.close();
    }
}