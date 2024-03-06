package mexican_soccer_team;

public class Masseur extends  Staff{

    private String profession;
    private Integer yearsOfExperience;

    public Masseur() {
    }

    public Masseur(Integer id, String name, String lastname, Integer age, String profession, Integer yearsOfExperience) {
        super(id, name, lastname, age);
        this.profession = profession;
        this.yearsOfExperience = yearsOfExperience;
    }

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

    public void massage() {
        System.out.println("* MASAJEANDO *");
        try {
            Thread.sleep(2 * 1000);
            System.out.println("Final feliz :)");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
