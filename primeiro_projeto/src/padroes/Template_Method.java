package padroes;

abstract class GameAI {
    public void takeTurn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    public abstract void collectResources();
    public abstract void buildStructures();
    public abstract void buildUnits();

    public void attack() {
        System.out.println("Atacando inimigos...");
    }

    public void sendScouts(String position) {
        System.out.println("Enviando scouts para " + position);
    }

    public void sendWarriors(String position) {
        System.out.println("Enviando guerreiros para " + position);
    }
}

class OrcsAI extends GameAI {
    @Override
    public void collectResources() {
        System.out.println("Orcs coletando recursos...");
    }

    @Override
    public void buildStructures() {
        System.out.println("Orcs construindo estruturas...");
    }

    @Override
    public void buildUnits() {
        System.out.println("Orcs construindo unidades...");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Orcs atacando com força bruta!");
    }
}

class MonstersAI extends GameAI {
    @Override
    public void collectResources() {
        System.out.println("Monstros não coletam recursos.");
    }

    @Override
    public void buildStructures() {
        System.out.println("Monstros construindo estruturas...");
    }

    @Override
    public void buildUnits() {
        System.out.println("Monstros construindo unidades...");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Monstros atacando furtivamente!");
    }
}

public class Template_Method {
    public static void main(String[] args) {
        GameAI orcsAI = new OrcsAI();
        GameAI monstersAI = new MonstersAI();

        System.out.println("Turno dos Orcs:");
        orcsAI.takeTurn();

        System.out.println("\nTurno dos Monstros:");
        monstersAI.takeTurn();
    }
}
