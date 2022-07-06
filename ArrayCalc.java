import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayCalc {
    public static void main(String[] args) {
        String[][] arrIn = new String[4][4];
        for (int i = 0; i < arrIn[0].length; i++) {
            for (int j = 0; j < arrIn.length; j++) {
                arrIn[i][j] = "" + (int) (Math.random() * 10);
                // System.out.println(arrIn[i][j]);
            }
        }
        System.out.println("In " + Arrays.deepToString(arrIn));
        ArrayCalc(arrIn);
    }

    private static void ArrayCalc(String[][] arrIn) {


        try {
            if (arrIn[0].length > 4 || arrIn.length > 4) {
                throw new MyArraySizeException(arrIn, 4, 4);
            } else {
                Integer[][] arrOut = new Integer[arrIn[0].length][arrIn.length];
                for (int i = 0; i < arrIn[0].length; i++) {
                    for (int j = 0; j < arrIn.length; j++) {
                        try {
                            arrOut[i][j] = Integer.parseInt(arrIn[i][j]);
                        } catch (NumberFormatException e) {
                            arrOut[i][j] = 0;

                            throw new MyArrayDataException(arrIn[i][j], i, j);

                        } finally {
                            //  System.out.println(arrIn[i][j]);
                        }
                    }
                }
                System.out.println("Out " + Arrays.deepToString(arrOut));
            }
        } catch (MyArraySizeException e) {

            e.printStackTrace();
        }
    }
}