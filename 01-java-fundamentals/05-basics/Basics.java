import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        // print255();
        // printOdd();
        // System.out.println(printSum());
        int[] arr = {1,3,5,7,9,13};
        int[] arr1 = {0, -99, 5, -6, 44};
        // iterateArr(arr);
        // findMax(arr1);
        // oddArray();
        // printAvg(arr);
        // grThanY(arr);
        System.out.println(sqrNums(arr));


    }

    public static void print255() {
        for (int i=1; i<=255; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd() {
        for (int i=1; i<=255; i+=2) {
            System.out.println(i);
        }
    }

    public static int printSum() {
        int sum = 0;
        for (int i=0; i<=255; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void iterateArr(int[] x) {
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void findMax(int[] y) {
        int max = 0;
        for (int i=0; i<y.length; i++) {
            if (max < y[i]) {
                max = y[i];
            }
        }
        System.out.println(max);
    }

    public static void oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=1; i<=255; i+=2)  {
            y.add(i);
        }
        System.out.println(y);
    }

    public static void printAvg(int[] z) {
        int sum = 0;
        int avg = 0;
        for (int i=0; i<z.length; i++) {
            sum = sum + z[i];
    }
    avg = sum / z.length;
    System.out.println(avg);
    }

    public static void grThanY(int[] q) {
        int y = 3;
        int gr = 0;
        for (int i = 0; i<q.length; i++) {
            if (q[i] > y) {
                gr = gr + 1;
            }
        }
        System.out.println(gr);        
    }

    public static sqrNums(int[] u)

        
}