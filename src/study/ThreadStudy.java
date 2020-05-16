package study;

public class ThreadStudy
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread());
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        for (int i=0;i<8;i++)
        {
            link(builder);
        }
        link(builder);
        System.out.println(builder.toString());
        int a=3;
        int b=2;
        sum(a,b);
        System.out.println(a+b);
    }

    public static void link(StringBuilder builder)
    {
        builder.append(" world");
    }

    public static int sum(int a ,int b)
    {
        int sum = a+b;
        print(sum);
        return sum;
    }

    public static void print(Object o)
    {
        System.out.println(o);
    }
}
