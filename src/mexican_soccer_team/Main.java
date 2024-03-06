package mexican_soccer_team;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Footballer footballer1 = new Footballer(1, "Lionel", "Messi Sánchez", 22, 10, "Delantero");

        Trainer trainer1 = new Trainer(1, "Josep", "Guardiola", 55, 1);

        Masseur masseur1 = new Masseur(1, "Enrique", "Gonzalez", 31, "Fisioterapeuta", 12);

        System.out.println(footballer1.toString());
        System.out.println(trainer1.toString());
        System.out.println(masseur1.toString());

        masseur1.massage();

        trainer1.leadTraining();
        trainer1.leadMatch();

        footballer1.focus();
        footballer1.playMatch();
    }
}
