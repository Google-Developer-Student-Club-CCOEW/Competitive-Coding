/*
Question 58
___________


*/

import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[2 * n];
        int[] arr1 = new int[100];
        int num, reverse = 0;
        int n1 = n;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            reverse = 0;
            num = arr[i];

            while (num != 0) {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }

            arr[n1] = reverse;
            n1++;
        }
        System.out.println();

        for (int i = 0; i < n1; i++) {
            System.out.print(arr[i] + " ");
        }

        int index = 0;
        for (int i = 0; i < n1; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr1[index] = arr[i];
                index++;

            }
        }

        System.out.println();
        System.out.println("Distinct numbers in array " + (index));

    }
}
