package mexican_soccer_team;

public class Masseur extends  Staff{

    // Attributes
    private String profession;
    private Integer yearsOfExperience;

    // Constructors
    public Masseur() {
    }

    public Masseur(Integer id, String name, String lastname, Integer age, String profession, Integer yearsOfExperience) {
        super(id, name, lastname, age);
        this.profession = profession;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Methods
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void massage() {
        for (int i = 0; i <= 3; i++) {

            if (i < 3) System.out.println("Massaging...");
            else System.out.println("Happy end :)");
            try {
                Thread.sleep(2 * 1000);
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
                "\tprofession: " + getProfession() + "\n" +
                "\tyears of experience: " + getYearsOfExperience();
    }

}
