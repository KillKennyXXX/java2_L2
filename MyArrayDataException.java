
public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String str, int x, int y) {
        super(String.format("Не удалось конвертировать текст %s из ячейки (%s,%s)", str, x, y));
    }
}
