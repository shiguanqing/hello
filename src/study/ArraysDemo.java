package study;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysDemo
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];

        //将数组元素都设为9
        Arrays.fill(arr,9);
        System.out.println("fill:" + Arrays.toString(arr));

        Random random = new SecureRandom();
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=random.nextInt(101);
        }
        //重新赋值后的数组
        System.out.println("重新赋值：" + Arrays.toString(arr));
        arr[5]=50;
        Arrays.sort(arr);
        //排序后的数组
        System.out.println("sort排序后：" + Arrays.toString(arr));

        int i = Arrays.binarySearch(arr,50);
        System.out.println("值为50的元素索引："+i);

        int[] newArray = Arrays.copyOf(arr,arr.length);
        System.out.println("copyArray：" + Arrays.asList(newArray));
        List<int[]> newArr = Arrays.asList(newArray);
        System.out.println(Arrays.equals(arr,newArray));
    }


}
