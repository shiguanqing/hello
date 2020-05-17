package study.exception;

public class Hero {
    public String name;

    protected float hp;

    public void attackHero(Hero h) throws EnemyHeroIsDeadException {
        if (h.hp == 0)
        {
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了，不需要施放技能。");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hero{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hp=").append(hp);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Hero gaiLun = new Hero();
        gaiLun.name= "gaiLun";
        gaiLun.hp=1000;

        Hero tiMao = new Hero();
        tiMao.name= "tiMao";
        tiMao.hp=0;

        try {
            gaiLun.attackHero(tiMao);
        } catch (EnemyHeroIsDeadException e) {
            System.out.println("具体原因 " + e);
        }
    }
}
