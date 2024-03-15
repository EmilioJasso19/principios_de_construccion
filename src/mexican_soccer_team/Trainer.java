package mexican_soccer_team;

public class Trainer extends Staff{

    // Attributes
    private Integer federationID;

    // Constructors
    public Trainer() {
    }

    public Trainer(Integer id, String name, String lastname, Integer age, Integer federationID) {
        super(id, name, lastname, age);
        this.federationID = federationID;
    }

    // Methods
    public Integer getFederationID() {
        return federationID;
    }

    public void setFederationID(Integer federationID) {
        this.federationID = federationID;
    }
    public void leadMatch() {
        for (int i = 0; i <= 9; i++) {
            try {
                Thread.sleep(1000);
                if (i == 0) System.out.println("Starts the match");
                else if (i == 4) System.out.println("Part-time");
                else if (i < 9) System.out.println("Bla, bla, bla...");
                else System.out.println("End of the match");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void leadTraining() {
        for (int i = 0; i <= 4; i++) {
            try {
                Thread.sleep(2 * 1000);
                if (i == 2) System.out.println("take a break");
                else if (i < 4) System.out.println("Bla, bla, bla...");
                else System.out.println("End of the session, focus on the match");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Override Methods
    @Override
    public void focus() {
        String[] activities = {"Tactical review", "Analysis", "Visualisation", "Meditation",
        "Communication with the team", "Physical and mental review", "Logistical review"};
            for (String activity : activities) {
                try {
                    int randomTimeInMilliseconds = (int) ((Math.random() * 5) + 1);
                    System.out.println(activity);
                    Thread.sleep(randomTimeInMilliseconds * 1000L);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
    }

    @Override
    public void travel() {
        double durationTravel = (Math.random() * 18) + 1;
        System.out.printf("Sleeping during %.2f hours\n", durationTravel);
    }

    @Override
    public String toString() {
        return getName() + " " + getLastname() + ":\n" +
                "\tid: " + getId() + "\n" +
                "\tage: " + getAge() + "\n" +
                "\tfederation: " + getFederationID();
    }
}
