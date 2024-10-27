package visitor;

import state.GameCharacter;

public class BoostVisitor implements EffectVisitor{
    @Override
    public void applyBoost(GameCharacter gameCharacter) {
        System.out.println("Applying Boost!");
    }

    @Override
    public void applyDamage(GameCharacter gameCharacter) {
        System.out.println("Boost Visitor not apply damage");
    }
}
