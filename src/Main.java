import java.util.*;
public class Main {
    public static void main(String[] args) {
        // create ArrayList from a list of initial values; requires Arrays.asList
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 11));

        //COMPLETE ME!
        for (int i = 1; i < numList.size() - 2; i++) {
            if (numList.get(i - 1) % 2 == 0) {
                int combine = numList.get(i + 1) + numList.get(i + 2);
                numList.set(i, combine);
            }
        }

        System.out.println(numList);
    }
}