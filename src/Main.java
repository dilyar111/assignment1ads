//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class Main{

    private static final Scanner scan = new Scanner(System.in);

    public static void task1(){
        int n = scan.nextInt(), min = Integer.MAX_VALUE;
        for(int i = 0; i < n;i++){
            int a = scan.nextInt();
            if (min > a) min = a;
        }
        System.out.println(min);
    }

    public static int task2(){
        int n = scan.nextInt(), sum =0;
        for (int i=0; i<n; i++){
            int a = scan.nextInt(); sum+= a;
            return  sum / n;
        }
        System.out.println(task2());
        return n;
    }


    public static boolean task3(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println(n + (task3(n) ? " prime" : " composite"));
    }

    public static int factorial(int n){
        if(n<=1) return 1;
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    public static int fibonacciValue(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else
            return fibonacciValue(n-1) + fibonacciValue(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonacciValue(n));
    }

    public static int power(int a, int n, int i){
        int a = scan.nextInt();
        int n = scan.nextInt();
        if( n == 0) {
            return 1;
        }else if(n<0) {
            return 1 / (a * power(a, -n, -1));
        }else{
                return a * power(a, n-1, -1);
                }
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(power(a , n, -1));
        }
    }


    public static void task7(String[] arr, int first, int end) {
        if (first >= end) {
            return;
        }
        int temp = Integer.parseInt(arr[first]);
        arr[first] = arr[end];
        arr[end] = String.valueOf(temp);

        task7(arr, first + 1, end - 1);
    }
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("len:");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        task7(arr, 0, arr.length - 1);
        System.out.println("Reversed:");
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
    public static boolean task8(String s, int i) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return task8(s, 0);
    }
    private static boolean task8(String s, int index){
        if (index == s.length()) {
            return true;
        }
        char ch = s.charAt(index);

        if (Character.isDigit(ch)) {
            return task8(s, index + 1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (task8(s, 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static long task9(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return task9(n - 1, k - 1) + task9(n - 1, k - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        long binomial = task9(n, k);
        System.out.println(binomial);
    }


    public static int task10(int a, int b) {
        if (b == 0) {
            return a;
        }
        return task10(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gcd = task10(a, b);
        System.out.println(gcd);
    }


    public static void main(String[] args){
        System.out.println("Enter task number:");
        int taskNumber = scan.nextInt();
        switch (taskNumber){
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                factorial();
                break;
            case 5:
                fibonacciValue();
                break;
            case 6:
                power();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;


        }
    }

}