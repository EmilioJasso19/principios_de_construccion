package mexican_soccer_team;

public class Footballer extends Staff {

    // Attributes
    private Integer numberOfPlayer;
    private String position;

    // Constructors
    public Footballer() {
    }

    public Footballer(Integer id, String name, String lastname, Integer age, Integer numberOfPlayer, String position) {
        super(id, name, lastname, age);
        this.numberOfPlayer = numberOfPlayer;
        this.position = position;
    }

    // Methods
    public Integer getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(Integer numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void playMatch() {
        final int MINIMUM_TIME_PLAYED = 15;
        final int MATCH_DURATION = 90;
        int timePlayed = (int) ((Math.random() * MATCH_DURATION) + MINIMUM_TIME_PLAYED);
        System.out.println(getName() +
                ", with the dorsal " +
                getNumberOfPlayer() +
                ", played " + timePlayed
                + " minutes ");
    }

    public void training() {
        for (int i = 0; i <= 4; i++) {
            try {
                Thread.sleep(2 * 1000);
                if (i < 4) System.out.println("Training...");
                else System.out.println("End of the session");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // Override Methods
    @Override
    public void focus() {
        super.focus();
    }

    @Override
    public void travel() {
        super.travel();
    }

    @Override
    public String toString() {
        return getName() + " " + getLastname() + ":\n" +
                "\tid: " + getId() + "\n" +
                "\tage: " + getAge() + "\n" +
                "\tposition: " + getPosition() + "\n" +
                "\tnumber: " + getNumberOfPlayer();
    }
}
