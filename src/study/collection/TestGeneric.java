package study.collection;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        hs.add(new Hero("雷神",new BigDecimal(1000)));
        ArrayList<APHero> aphs = new ArrayList<>();
        APHero xiaoxiao = new APHero();
        xiaoxiao.setName("xiaoxiao");
        aphs.add(xiaoxiao);

        ArrayList<ADHero> adhs = new ArrayList<>();
        ADHero fuWang = new ADHero();
        fuWang.setName("fuWang");
        adhs.add(fuWang);

//        iterate(hs);
//        iterateAP(aphs);
//        iterateAD(adhs);

        hs.addAll(aphs);
        hs.addAll(adhs);
        iterateGeneric(hs);

//      子类泛型不能转父类泛型
//        ArrayList<Hero> hs =new ArrayList<>();
//        ArrayList<ADHero> adhs =new ArrayList<>();
//
//        //假设能转换成功
//        hs = adhs;
//
//        //作为Hero泛型的hs,是可以向其中加入APHero的
//        //但是hs这个引用，实际上是指向的一个ADHero泛型的容器
//        //如果能加进去，就变成了ADHero泛型的容器里放进了APHero，这就矛盾了
//        hs.add(new APHero());

    }

    public static void iterateGeneric(ArrayList<? extends Hero> list)
    {
        for(Hero hero: list)
        {
            System.out.println(hero.getName());
        }
    }

    public static void iterate(ArrayList<Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }

    public static void iterateAP(ArrayList<APHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }

    public static void iterateAD(ArrayList<ADHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.getName());
        }
    }
}
