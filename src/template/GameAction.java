package template;

public abstract class GameAction {
    public void executeAction(){
        System.out.println("Get ready!");
        action();
        System.out.println("Action was made!");
    }

    protected abstract void action();
}
