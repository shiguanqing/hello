package study.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StreamTest
{
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\a.txt");
        try(FileReader fr = new FileReader(file))
        {
            char[] data = new char[6];
            while (-1 != fr.read(data))
            {
                String content = data.toString();
                if (!content.equals("abc"))
                {
                    System.out.println(content);
                }
            }
        }
    }

    public static void inputByte() {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\c.txt");
        FileInputStream fileInputStream = null;
        try
        {
            fileInputStream = new FileInputStream(file);
            byte[] all = new byte[2];

            while (-1 != fileInputStream.read(all))
            {
                for (byte b: all)
                {
                    System.out.println(b);
                }
            }
        }
        catch (IOException e)
        {

        }
        finally {
            if (fileInputStream != null)
            {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void outputByte() {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\f.txt");

        try(FileOutputStream fos = new FileOutputStream(file))
        {
            String a = "诚朴雄伟, 励学敦行";
            byte[] bytes = a.getBytes();
            fos.write(bytes);
        }
        catch (IOException e)
        {

        }
    }

    public static void inputChar() {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\c.txt");
        FileReader reader = null;
        try
        {
            reader = new FileReader(file);
            char[] all = new char[2];

            while (-1 != reader.read(all))
            {
                for (char b: all)
                {
                    System.out.println(b);
                }
            }
        }
        catch (IOException e)
        {

        }
        finally {
            if (reader != null)
            {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void outputChar() {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\b.txt");

        try(FileWriter fos = new FileWriter(file))
        {
            String a = "诚朴雄伟, 励学敦行";
            char[] chars = a.toCharArray();
            fos.write(chars);
        }
        catch (IOException e)
        {

        }
    }

    private static void showCode(String str) throws UnsupportedEncodingException {
        String[] encodes = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };
        for (String encode : encodes) {
            showCode(str, encode);
        }

    }

    private static void showCode(String str, String encode) throws UnsupportedEncodingException {
        try {
            System.out.printf("字符: \"%s\" 的在编码方式%s下的十六进制值是%n", str, encode);
            byte[] bs = str.getBytes(encode);

            for (byte    b : bs) {
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");

            }
            System.out.println();
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
        }
    }

    /**
     *  使用缓存流读取数据
     *  目的：减少IO操作次数，提高读取性能
     * @throws FileNotFoundException
     */
    private static void bufferStreamReader() throws IOException {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\a.txt");
        try(
                FileReader fr = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fr);
                )
        {
            while (true)
            {
                // 一次读一行
                String line = bufferedReader.readLine();
                if (line == null)
                {
                    break;
                }

                System.out.println(line);
            }
        }
    }

    private static void printWriterStream() throws IOException {
        File file = new File("D:\\LOLFolder\\LOL\\Heros\\a.txt");
        try(
                FileWriter fw = new FileWriter(file);
                PrintWriter pw = new PrintWriter(fw);
                )
        {
            pw.println("冰女");
//            pw.flush();  //立即将数据写入到硬盘
            pw.println("龙骑");
//            pw.flush();
        }



    }
}
