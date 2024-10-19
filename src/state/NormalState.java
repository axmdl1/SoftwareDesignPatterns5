package state;

public class NormalState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Normal attack!");
    }

    @Override
    public void defend() {
        System.out.println("Normal defence!");
    }
}
