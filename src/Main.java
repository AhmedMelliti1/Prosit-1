public class Main {
    public static void main(String[] args) {

        // --- Instruction 10 : ajout d'animaux ---
        Zoo zoo1 = new Zoo("Safari Park", "Paris");

        Animal lion     = new Animal("Félins",         "Simba",      5,  true);
        Animal tiger    = new Animal("Félins",         "Shere Khan", 4,  true);
        Animal elephant = new Animal("Éléphantidés",   "Dumbo",      10, true);
        Animal eagle    = new Animal("Rapaces",        "Sammy",      3,  false);
        Animal snake    = new Animal("Serpents",       "Kaa",        7,  false);

        System.out.println("=== Ajout des animaux ===");
        System.out.println("Ajout de Simba      : " + zoo1.addAnimal(lion));
        System.out.println("Ajout de Shere Khan : " + zoo1.addAnimal(tiger));
        System.out.println("Ajout de Dumbo      : " + zoo1.addAnimal(elephant));
        System.out.println("Ajout de Sammy      : " + zoo1.addAnimal(eagle));
        System.out.println("Ajout de Kaa        : " + zoo1.addAnimal(snake));

        // Instruction 12 : tentative d'ajout en double
        System.out.println("\n=== Test unicité ===");
        Animal lionCopie = new Animal("Félins", "Simba", 5, true);
        System.out.println("Ajout d'un 2e Simba : " + zoo1.addAnimal(lionCopie));

        // Instruction 11a : affichage
        System.out.println();
        zoo1.displayAnimals();

        // Instruction 11b : recherche
        System.out.println("\n=== Recherche ===");
        int idx = zoo1.searchAnimal(lion);
        System.out.println("Indice de Simba          : " + idx);
        System.out.println("Indice de lionCopie      : " + zoo1.searchAnimal(lionCopie));  // même nom → même indice
        Animal inconnu = new Animal("?", "Rex", 1, false);
        System.out.println("Indice de Rex (inconnu)  : " + zoo1.searchAnimal(inconnu));

        // Instruction 13 : suppression
        System.out.println("\n=== Suppression ===");
        System.out.println("Suppression de Dumbo    : " + zoo1.removeAnimal(elephant));
        System.out.println("Suppression de Rex      : " + zoo1.removeAnimal(inconnu));
        zoo1.displayAnimals();

        // Instruction 14 : test de la capacité maximale (25 animaux)
        System.out.println("\n=== Test capacité maximale (25 cages) ===");
        Zoo zoo2 = new Zoo("Jungle World", "Lyon");
        for (int i = 1; i <= 26; i++) {
            Animal a = new Animal("Famille" + i, "Animal" + i, i, true);
            boolean added = zoo2.addAnimal(a);
            if (!added) {
                System.out.println("Échec à l'ajout n°" + i + " – zoo plein : " + zoo2.isFull());
            }
        }

        // Instruction 15a : vérification si plein
        System.out.println("\n=== Test isFull ===");
        System.out.println("zoo1 est plein : " + zoo1.isFull());
        System.out.println("zoo2 est plein : " + zoo2.isFull());

        // Instruction 15b : comparaison de deux zoos
        System.out.println("\n=== Comparaison de zoos ===");
        Zoo plusGrand = zoo1.getBiggestZoo(zoo2);
        System.out.println("Le zoo le plus peuplé est : " + plusGrand);

        Zoo zoo3 = new Zoo("Aqua Zoo", "Marseille");
        zoo3.addAnimal(new Animal("Poissons", "Nemo", 2, false));
        Zoo plusGrand2 = zoo1.getBiggestZoo(zoo3);
        System.out.println("Entre zoo1 et zoo3, le plus peuplé : " + plusGrand2);
    }
}
