import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    
    public void print255() {
        for (int i=1; i<=255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd() {
        for (int i=1; i<=255; i+=2) {
            System.out.println(i);
        }
    }

    public int printSum() {
        int sum = 0;
        for (int i=0; i<=255; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public void iterateArr(int[] x) {
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void findMax(int[] y) {
        int max = 0;
        for (int i=0; i<y.length; i++) {
            if (max < y[i]) {
                max = y[i];
            }
        }
        System.out.println(max);
    }

    public void oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=1; i<=255; i+=2)  {
            y.add(i);
        }
        System.out.println(y);
    }

    public void printAvg(int[] z) {
        int sum = 0;
        int avg = 0;
        for (int i=0; i<z.length; i++) {
            sum = sum + z[i];
    }
    avg = sum / z.length;
    System.out.println(avg);
    }

    public void grThanY(int[] q) {
        int y = 3;
        int gr = 0;
        for (int i = 0; i<q.length; i++) {
            if (q[i] > y) {
                gr = gr + 1;
            }
        }
        System.out.println(gr);        
    }

    public void sqrNums(int[] x) {
        for (int i = 0; i<x.length; i++) {
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
    }

    public void elNegNums(int[] x) {
        for (int i = 0; i<x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    public int[] maxMinAvg(int[] x) {
        int[] newArr = new int[3];

        int max = x[0];
        for (int i=0; i<x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        newArr[0] = max;

        int min = x[0];
        for (int i=0; i<x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        newArr[1] = min;

        int sum = 0;
        int avg = 0;
        for (int i = 0; i<x.length; i++) {
                sum = sum + x[i];
            }
            avg = sum / x.length;
            newArr[2] = avg;

            return newArr;
    }

    public void shiftValues(int[] x) {
        for (int i = 0; i<x.length; i++) {
            if (i == x.length-1) {
                x[i] = 0;
                break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
    }
        
    }