package JavaPractice;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        isprime(num);       
    }

    public static void isprime(int a){
        if(a == 0 || a== 1) {System.out.println("false"); return;}
        int c = 2;
        while(c*c<=a){
            if(a%c == 0){
                System.out.println("false"); return;
            }
            c++;
        }
        System.out.println("True");

    }
}
