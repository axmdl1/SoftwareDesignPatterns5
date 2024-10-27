import state.*;
import strategy.MeleeStrategy;
import strategy.RangedStrategy;
import template.AttackAction;
import template.DefendAction;
import template.GameAction;
import template.HealAction;
import visitor.BoostVisitor;
import visitor.DamageVisitor;
import visitor.EffectVisitor;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        CharacterState characterState = new NormalState();

        gameCharacter.setState(characterState);

        for (int i = 0; i < 5; i++){
            gameCharacter.changeState();
            gameCharacter.attack();
            gameCharacter.defend();
        }

        System.out.println("=======================================================");

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

        System.out.println("------------------------------------------------------------");

        System.out.println("Melee Strategy: ");
        gameCharacter.setStrategy(new MeleeStrategy());
        gameCharacter.fight();

        System.out.println("Ranged Strategy: ");
        gameCharacter.setStrategy(new RangedStrategy());
        gameCharacter.fight();

        System.out.println("-------------------------------------------------------------");

        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();

        System.out.println("Attack: ");
        attack.executeAction();

        System.out.println("Defend: ");
        defend.executeAction();

        System.out.println("Heal: ");
        heal.executeAction();

        System.out.println("--------------------------------------------------------------");

        System.out.println("Apply boost: ");
        EffectVisitor boostVis = new BoostVisitor();
        gameCharacter.acceptVisitor(boostVis);

        System.out.println("Apply Damage: ");
        EffectVisitor damageVis = new DamageVisitor();
        gameCharacter.acceptVisitor(damageVis);
    }
}