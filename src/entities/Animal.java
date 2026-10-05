package entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        // age negatif pas autorise
        if (age < 0) {
            System.out.println("age invalide pour " + name + ", on met 0 par defaut");
            this.age = 0;
        } else {
            this.age = age;
        }
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age invalide, modification ignoree");
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return name + " | famille: " + family + " | age: " + age + " ans | mammifere: " + isMammal;
    }
}
