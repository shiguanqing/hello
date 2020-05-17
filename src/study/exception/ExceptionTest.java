package study.exception;

public class ExceptionTest
{
    public static void main(String[] args) {
        try {
            runTimeExceptionCatch();
        } catch (Throwable throwable) {
            System.out.println("Catch Throwable " + throwable);
            throwable.printStackTrace();
        }
    }

    public static int fixNum()
    {
        try
        {
            return 1;
        }
        catch (Exception e)
        {
            return 2;
        }
        finally {
            return 3;
        }
    }

    public static int runTimeExceptionCatch() throws Throwable {
        try
        {
            return 5/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Catch ArithmeticException ");
            throw new Throwable(e);
        }

    }
}
