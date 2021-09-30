package Chapter7Exercises;

import java.util.Arrays;

public class Statements {
    /**>>> create an integerArray of length 10;
     * >>> create an integerArrayBonus of length 15;
     * >>> create an integerArrayBestScores of length 5;
     * >>> the first array should be set to 0
     * >>> add 1 to the elements in the secondArray
     * >>> Display the values in the third array in a column format.
     * */
    public static void main(String[] args) {
        int [] integerArray = new int[10];
        int [] integerArrayBonus = new int[15];
        int [] integerArrayBestScores = {2,3,4,5,6};
        System.out.println(Arrays.toString(integerArray));
        System.out.println();

        for (int count = 0; count < integerArrayBonus.length; count++) {
            integerArrayBonus[count] = integerArrayBonus[count]+ 1;
            System.out.println(integerArrayBonus[count]);
        }

        System.out.println("Values in the BestScore Array");
        for(int item: integerArrayBestScores){
            System.out.println(item);
        }
    }
}
