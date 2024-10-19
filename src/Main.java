import state.DefeatedState;
import state.GameCharacter;
import state.PoweredUpState;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        System.out.println("Normal State:");
        gameCharacter.attack();
        gameCharacter.defend();

        System.out.println("Powered Up State:");
        gameCharacter.setState(new PoweredUpState());
        gameCharacter.attack();
        gameCharacter.defend();

        System.out.println("Defeated State:");
        gameCharacter.setState(new DefeatedState());
        gameCharacter.attack();
        gameCharacter.defend();
    }
}