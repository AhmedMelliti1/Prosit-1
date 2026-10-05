public class Zoo {

    // Instruction 14 : constante pour le nombre maximum de cages
    private static final int MAX_CAGES = 25;

    private Animal[] animals;
    String name;
    String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.nbrAnimals = 0;
    }

    // Instruction 10 : ajouter un animal (unicité + capacité max – instruction 12)
    public boolean addAnimal(Animal animal) {
        // Capacité maximale atteinte
        if (nbrAnimals >= MAX_CAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter " + animal.name);
            return false;
        }
        // Unicité : l'animal ne doit pas déjà être présent
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.name + " est déjà présent dans le zoo.");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    // Instruction 11a : afficher tous les animaux
    public void displayAnimals() {
        System.out.println("=== Animaux du zoo " + name + " (" + nbrAnimals + "/" + MAX_CAGES + ") ===");
        if (nbrAnimals == 0) {
            System.out.println("Le zoo est vide.");
            return;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("  [" + i + "] " + animals[i]);
        }
    }

    // Instruction 11b : rechercher un animal par nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    // Instruction 13 : supprimer un animal et réorganiser le tableau
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.name + " n'a pas été trouvé dans le zoo.");
            return false;
        }
        // Décalage des éléments pour combler le trou
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    // Instruction 15a : vérifier si le zoo est plein
    public boolean isFull() {
        return nbrAnimals >= MAX_CAGES;
    }

    // Instruction 15b : retourner le zoo le plus peuplé entre this et autre
    public Zoo getBiggestZoo(Zoo other) {
        return (this.nbrAnimals >= other.nbrAnimals) ? this : other;
    }

    // Accesseur utile pour les comparaisons
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    @Override
    public String toString() {
        return "Zoo " + name + " (" + city + ") – " + nbrAnimals + " animaux";
    }
}
