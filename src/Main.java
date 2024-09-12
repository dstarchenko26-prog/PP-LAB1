import java.util.Scanner;

public class Main {
    /**
     *shows the sum of the first N Fibonacci numbers
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Суму скількох перших чисел обчислити? ");
            int N = scan.nextInt();
            if (N == 0) {
                break;
            } else {
                Fibonacci[] array = new Fibonacci[1];
                array[0] = new Fibonacci();
                array = array[0].createArray(N);
                System.out.printf("Сума %d - перших чисел ряду Фібоначі становить %d\n", N, array[0].sum(array));
            }
        }
    }
}