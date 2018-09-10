public class Calculator {

    public static int add (int a, int b) throws IndexOutOfBoundsException
    {
        if (a >0 && b >0 && a + b <=  0) {
            throw new IndexOutOfBoundsException();
        }
        return (a+b);

    }

    public static  int sub (int a, int b) throws IndexOutOfBoundsException
    {
        if (a < 0 && b < 0 && (a + b) > 0) {
            throw new IndexOutOfBoundsException();
        }
        return (a - b);
    }
}
