class State
{
    public void handle(CoffeeMachine context) {}
}

class ReadyState extends State
{
    public void handle(CoffeeMachine context)
    {
        System.out.println("[State]: ready");
        context.setState(new BrewingState());
    }
}

class BrewingState extends State
{
    public void handle(CoffeeMachine context)
    {
        System.out.println("[State]: brewing");
    }
}

public class CoffeeMachine
{
    State currentState;
    public CoffeeMachine() { currentState = new ReadyState(); }
    void setState(State s) { currentState = s; }
    void pressButton() { currentState.handle(this); }
}
