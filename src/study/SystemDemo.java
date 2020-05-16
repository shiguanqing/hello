package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

public class SystemDemo
{
    public static void main(String[] args)
    {
//        Properties pros = System.getProperties();
//        System.out.println(System.getProperty("user.dir"));
////        System.out.println(System.getProperty("java.class.path"));
//        System.out.println(System.getenv());;
//
//        System.getenv().forEach((k, v) -> {
//            System.out.println(k + ":" + v);
//        });

        Map<String,String> person = new HashMap<>();
        person.put("1","tom");
        person.put("2","jersy");

        for(Map.Entry<String,String> entry:person.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
