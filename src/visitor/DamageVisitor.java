package visitor;

import state.GameCharacter;

public class DamageVisitor implements EffectVisitor{
    @Override
    public void applyBoost(GameCharacter gameCharacter) {
        System.out.println("Damage not apply boosts!");
    }

    @Override
    public void applyDamage(GameCharacter gameCharacter) {
        System.out.println("Reducing health or defence!");
    }
}
