package designMode.stateMode;

public class ConcreteStateB implements State
{
    @Override
    public void Handle(Context context)
    {
        System.out.println("ConcreteStateB");
        context.setState(new ConcreteStateA());
    }
}
