package strategy;

public class MeleeStrategy implements FightingStrategy{
    @Override
    public void fight() {
        System.out.println("Combating with Melee Strategy!");
    }
}
