import java.util.Scanner;

interface FindMaximumInteger{
    int result(int a, int b);
}

public class MaxInteger {
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter First Number");
        int firstInteger = sc.nextInt();
        System.out.println("Please Enter Second Number");
        int secondInteger = sc.nextInt();

        FindMaximumInteger fmi=(a,b)->  a > b ? a : b;

        System.out.println("Maximum Integer is:- " + fmi.result(firstInteger, secondInteger));
    }
}
