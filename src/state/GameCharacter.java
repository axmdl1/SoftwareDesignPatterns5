package state;

import strategy.FightingStrategy;

public class GameCharacter {
    private CharacterState currentState;
    private FightingStrategy currentStrategy;
    CharacterState characterState;

    public GameCharacter() {
        currentState = new NormalState();
    }

    public void setState(CharacterState state) {
        this.currentState = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.currentStrategy = strategy;
    }

    public void changeState(){
        if (characterState instanceof DefeatedState){
            setState(new NormalState());
        } else if (characterState instanceof NormalState){
           setState(new PoweredUpState());
        } else if (characterState instanceof PoweredUpState) {
            setState(new NormalState());
        }
    }

    public void attack(){
        currentState.attack();
    }

    public void defend(){
        currentState.defend();
    }

    public void fight(){
        currentStrategy.fight();
    }
}
