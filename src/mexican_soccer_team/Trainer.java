package mexican_soccer_team;

public class Trainer extends Staff{

    private Integer federationID;

    public Trainer() {
    }

    public Trainer(Integer id, String name, String lastname, Integer age, Integer federationID) {
        super(id, name, lastname, age);
        this.federationID = federationID;
    }

    public Integer getFederationID() {
        return federationID;
    }

    public void setFederationID(Integer federationID) {
        this.federationID = federationID;
    }

    @Override
    public void focus() {
        super.focus();
    }

    @Override
    public void travel() {
        super.travel();
    }

    public void leadMatch() {
        System.out.println("No saben jugar!!!!");
    }

    public void leadTraining() {
        System.out.println("Dembelé ya se cayó en la rodilla de otro?????");
    }

    @Override
    public String toString() {
        return getName() + " " + getLastname() + ":\n" +
                "\tid : " + getId() + "\n" +
                "\tage : " + getAge() + "\n" +
                "\tfederation : " + getFederationID();
    }
}
