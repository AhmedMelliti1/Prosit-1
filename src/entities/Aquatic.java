package entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family,String name,int age,Boolean isMammal,String habitat) {
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+ "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if(null==o) return false;
        if (!(o instanceof Aquatic aquatic)) return false;
        return getName().equals(aquatic.getName())
                && getAge() == aquatic.getAge()
                && getHabitat().equals(aquatic.getHabitat());
    }
}
