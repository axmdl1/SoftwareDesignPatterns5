package state;

public class DefeatedState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Cannot attack! Wasted");
    }

    @Override
    public void defend() {
        System.out.println("Cannot defend! Wasted");
    }
}
