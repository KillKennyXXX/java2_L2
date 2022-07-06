public class MyArraySizeException extends Exception{
    public MyArraySizeException(String[][] arrIn , int x,int y) {
        super( String.format("Размерность массива превышает %s*%s : %s*%s" , x, y ,arrIn.length ,arrIn[0].length));
    }
}
