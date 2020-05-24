package study.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        getMaxFile("d:/LOLFolder/LOL/Heros");
    }

    public static void createFile()
    {
        // 绝对路径
        File f1 = new File("d:/LOLFolder/LOL/Heros");
        System.out.println(f1.getAbsolutePath());

        // 相对路径，相对idea 工作目录
        File f2 = new File("LOL.exe");
        System.out.println(f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1,"dota.exe");
        System.out.println(f3.getAbsolutePath());
    }

    public static void fileUsedMethod1()
    {
        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" + f);

        // 文件是否存在
        System.out.println("文件是否存在:" + f.exists());

        // 是否是文件夹
        System.out.println("是否是文件夹:" + f.isDirectory());

        // 是否是文件（非文件夹）
        System.out.println("是否是文件:" + f.isFile());

        // 文件长度
        System.out.println("" + f.length());

        // 文件最后修改时间
        Date date = new Date(f.lastModified());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("文件最后修改时间" + dateFormat.format(date));

        // 文件重命名
        File dota = new File("d:/LOLFolder/Dota.exe");
        System.out.println(f.renameTo(dota));
    }

    public static void fileUsedMethod2() throws IOException {
        File f = new File("d:/LOLFolder/LOL/Heros");

        // 以字符串数组的形式返回当前文件夹下所有的文件
        String[] strFile = f.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件
        File[] fs = f.listFiles();

        // 以字符串的形式，返回上级目录
        String parentPath = f.getParent();

        // 以文件的形式，返回上级目录
        File parentFile = f.getParentFile();

        f.getParentFile().mkdirs();

        // 创建文件
        f.createNewFile();

        // 删除文件
        System.out.println("delete file " + f.delete());

        // 父路径不存在，mkdir创建文件夹
        System.out.println("父路径不存在，mkdir创建文件夹 " + f.mkdir());

        // 父路径不存在，mkdirs创建文件夹
        System.out.println("父路径不存在，mkdirs创建文件夹 " + f.mkdirs());

        // 列出所有盘符
        File[] roots = File.listRoots();

    }

    public static void getMaxFile(String pathName)
    {
        File file = new File(pathName);
        File[] fs = file.listFiles();
        if (fs.length<=0)
        {
            System.out.println("文件夹中没有文件");
            return;
        }

        File maxFile = fs[0];
        for (File f: fs)
        {
            if (f.isFile() && f.length() > maxFile.length())
            {
                maxFile = f;
            }
        }

        if (maxFile.isFile())
        {
            System.out.println("最大文件名：" + maxFile.getName());
            return;
        }
    }

}















