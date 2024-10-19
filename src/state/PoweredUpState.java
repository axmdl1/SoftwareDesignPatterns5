package state;

public class PoweredUpState implements CharacterState{
    @Override
    public void attack() {
        System.out.println("Powered Up Attack!");
    }

    @Override
    public void defend() {
        System.out.println("Powered Up Defend!");
    }
}
