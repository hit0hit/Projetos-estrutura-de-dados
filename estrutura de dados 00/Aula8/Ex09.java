package Aula08;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o termo para o Fibonacci: ");
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++) {
            System.out.print(fibo(j) + ", ");
        }
        sc.close();

    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
