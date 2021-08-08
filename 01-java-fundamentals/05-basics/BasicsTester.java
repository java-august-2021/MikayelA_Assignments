import java.util.ArrayList;
import java.util.Arrays;

public class BasicsTester {
     public static void main(String[] args) {
          Basics generator = new Basics();
          int[] arr = {1,3,5,7,9,13};
          int[] arr1 = {0, -99, 5, -6, 44};
          int[] arr2 = {1, 5, 10, -2};
          int[] arr3 = {1, 5, 10, -2};
          generator.print255(); 
          generator.printOdd();
          System.out.println(generator.printSum());
          generator.iterateArr(arr);
          generator.findMax(arr1);
          generator.oddArray();
          generator.printAvg(arr);
          generator.grThanY(arr);
          generator.sqrNums(arr2);
          generator.elNegNums(arr3);
          int[] miMaAv = generator.maxMinAvg(arr3);
          System.out.println(Arrays.toString(miMaAv));
          generator.shiftValues(arr3);
     }
}
