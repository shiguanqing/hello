package study.collection;

import java.math.BigDecimal;

public class Hero
{
    private String name;

    private BigDecimal hp;

    public Hero() {
    }

    public Hero(String name, BigDecimal hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHp() {
        return hp;
    }

    public void setHp(BigDecimal hp) {
        this.hp = hp;
    }
}
