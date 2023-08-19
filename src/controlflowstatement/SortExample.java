package controlflowstatement;
import java.util.Arrays;
public class SortExample {

        public static void main(String[] args) {
            int [] array = new int [] {1,77,56,8,32,56,19,22};
            Arrays.sort(array);
            System.out.println("Elements of array sorted in ascending order: ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
        }
    }
