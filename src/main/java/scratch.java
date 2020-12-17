import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите степень");
        int st = scr.nextInt();
        int value = 2;
        int i = 0;
        int res = 1;
        while (st != i) {
            i++;
           res = res * value;
        }
       System.out.println(res);
    }
}