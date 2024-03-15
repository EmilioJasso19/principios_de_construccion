package mexican_soccer_team;

public class Main {

    public static void main(String[] args) {

        // Creating instances of classes
        Footballer footballer = new Footballer(1, "Lionel", "Messi Sanchez", 35, 10, "Forward");
        Trainer trainer = new Trainer(2, "Pep", "Guardiola", 50, 12345);
        Masseur masseur = new Masseur(3, "Angel", "Gonzalez", 40, "Masajista", 15);

        // Testing methods from the Footballer class
        footballer.training();
        footballer.playMatch();
        System.out.println(footballer);

        // Testing methods from the Trainer class
        trainer.leadTraining();
        trainer.leadMatch();
        trainer.travel();
        System.out.println(trainer);

        // Testing methods from the Masseur class
        masseur.massage();
        masseur.focus();
        masseur.travel();
        System.out.println(masseur);

    }
}
