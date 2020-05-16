package designMode.stateMode;

public class Context
{
    private State state;

    public Context(State state)
    {
        System.out.println(state.getClass().getName());
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void request()
    {
        state.Handle(this);
    }
}
