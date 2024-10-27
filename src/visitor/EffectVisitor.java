package visitor;

import state.GameCharacter;

public interface EffectVisitor {
    void applyBoost(GameCharacter gameCharacter);
    void applyDamage(GameCharacter gameCharacter);
}
