package state;

public class GameCharacter {
    private CharacterState currentState;

    public GameCharacter() {
        currentState = new NormalState();
    }

    public void setState(CharacterState state) {
        this.currentState = state;
    }

    public void attack(){
        currentState.attack();
    }

    public void defend(){
        currentState.defend();
    }
}
