package mexican_soccer_team;

public class Footballer extends Staff {

    private Integer numberOfPlayer;
    private String position;

    public Footballer() {
    }

    public Footballer(Integer id, String name, String lastname, Integer age, Integer numberOfPlayer, String position) {
        super(id, name, lastname, age);
        this.numberOfPlayer = numberOfPlayer;
        this.position = position;
    }

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
        System.out.println("Jugué chingón");
    }

    public void training() {
        System.out.println("Se mató Manuel");
    }

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
