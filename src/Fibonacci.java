class Fibonacci {
    int index;
    int value;

    /**
     * default class constructor
     *
     */
    Fibonacci() {
        index = 1;
        value = 1;
    }

    /**
     * class constructor
     * @param i numeral of the number
     * @param array array of numbers
     */
    Fibonacci (int i, Fibonacci[] array) {
        index = i;
        if (index > 2) {
            value = array[i - 3].value + array[i - 2].value;
        }
        else {
            value = 1;
        }
    }

    /**
     * creates an array of Fibonacci numbers
     * @param N count of the numbers
     * @return array of Fibonacci numbers
     */
    Fibonacci[] createArray(int N) {
        Fibonacci[] array = new Fibonacci[N];
        for (int i = 0; i < N; i++){
            array[i] = new Fibonacci(i + 1, array);
        }
        return array;
    }

    /**
     * searches for the sum of N numbers in a row
     * @param array array of Fibonacci numbers
     * @return the sum of a series of numbers
     */
    long sum(Fibonacci[] array) {
        long res = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            res += array[i].value;
            System.out.printf("Число №%d - %d, сума наразі - %d\n", array[i].index, array[i].value, res);
        }
        return res;
    }

}