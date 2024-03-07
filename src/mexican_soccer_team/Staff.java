package mexican_soccer_team;

public abstract class Staff {

    // Attributes
    private Integer id;
    private String name;
    private String lastname;
    private Integer age;

    // Constructors
    public Staff() {
    }

    public Staff(Integer id, String name, String lastname, Integer age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    // Methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void focus() {
        System.out.println("* MEDITA * ");
    }

    public void travel() {
        System.out.println("Ya se jue");
    }

    @Override
    public String toString() {
        return getName() + "\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
