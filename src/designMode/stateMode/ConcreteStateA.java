package designMode.stateMode;

public class ConcreteStateA implements State
{
    @Override
    public void Handle(Context context)
    {
        System.out.println("ConcreteStateA");
        context.setState(new ConcreteStateB());
    }
}
