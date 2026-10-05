package entities;

public class Zoo {

    static final int MAX_CAGES = 25;

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        // nom de zoo vide pas autorise
        if (name == null || name.isEmpty()) {
            System.out.println("le nom du zoo est vide, on met 'Zoo inconnu' par defaut");
            this.name = "Zoo inconnu";
        } else {
            this.name = name;
        }
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.nbrAnimals = 0;
    }

    // instruction 17 : addAnimal utilise isFull()
    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println("Le zoo est plein, on peut pas ajouter " + animal.getName());
            return false;
        }

        // on verifie que l'animal n'est pas deja dans le zoo
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.getName() + " est deja dans le zoo");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + " : " + nbrAnimals + "/" + MAX_CAGES);
        if (nbrAnimals == 0) {
            System.out.println("aucun animal pour l'instant");
            return;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(i + " - " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.getName() + " introuvable dans le zoo");
            return false;
        }

        // on decale tout pour pas laisser de trou dans le tableau
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public boolean isFull() {
        return nbrAnimals >= MAX_CAGES;
    }

    public Zoo getBiggestZoo(Zoo other) {
        if (this.nbrAnimals >= other.nbrAnimals) {
            return this;
        }
        return other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("nom invalide, modification ignoree");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    @Override
    public String toString() {
        return name + " (" + city + ") - " + nbrAnimals + " animaux";
    }
}
