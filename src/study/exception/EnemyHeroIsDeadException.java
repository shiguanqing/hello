package study.exception;

public class EnemyHeroIsDeadException extends Exception
{
    public EnemyHeroIsDeadException() {
    }

    public EnemyHeroIsDeadException(String message) {
        super(message);
    }
}
