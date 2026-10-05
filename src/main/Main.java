package main;

import entities.Animal;
import entities.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Safari Park", "Paris");

        Animal lion = new Animal("Felins", "Simba", 5, true);
        Animal tiger = new Animal("Felins", "Shere Khan", 4, true);
        Animal elephant = new Animal("Elephantides", "Dumbo", 10, true);
        Animal eagle = new Animal("Rapaces", "Sammy", 3, false);
        Animal snake = new Animal("Serpents", "Kaa", 7, false);

        // test encapsulation : age negatif
        System.out.println("-- test age negatif --");
        Animal invalid = new Animal("Test", "Bug", -5, false);
        System.out.println(invalid);

        // test encapsulation : nom de zoo vide
        System.out.println("\n-- test nom zoo vide --");
        Zoo zooSansNom = new Zoo("", "Bordeaux");
        System.out.println(zooSansNom);

        // ajout des animaux
        System.out.println("\n-- ajout des animaux --");
        System.out.println(zoo1.addAnimal(lion));
        System.out.println(zoo1.addAnimal(tiger));
        System.out.println(zoo1.addAnimal(elephant));
        System.out.println(zoo1.addAnimal(eagle));
        System.out.println(zoo1.addAnimal(snake));

        // test ajout en double
        System.out.println("\n-- test doublon --");
        Animal lionCopie = new Animal("Felins", "Simba", 5, true);
        System.out.println(zoo1.addAnimal(lionCopie));

        // affichage
        System.out.println();
        zoo1.displayAnimals();

        // recherche
        System.out.println("\n-- recherche --");
        System.out.println("indice de Simba : " + zoo1.searchAnimal(lion));
        System.out.println("indice de lionCopie : " + zoo1.searchAnimal(lionCopie));
        Animal inconnu = new Animal("?", "Rex", 1, false);
        System.out.println("indice de Rex : " + zoo1.searchAnimal(inconnu));

        // suppression
        System.out.println("\n-- suppression --");
        System.out.println(zoo1.removeAnimal(elephant));
        System.out.println(zoo1.removeAnimal(inconnu));
        zoo1.displayAnimals();

        // test capacite max
        System.out.println("\n-- test capacite max --");
        Zoo zoo2 = new Zoo("Jungle World", "Lyon");
        for (int i = 1; i <= 26; i++) {
            Animal a = new Animal("famille" + i, "animal" + i, i, true);
            boolean res = zoo2.addAnimal(a);
            if (!res) {
                System.out.println("echec ajout numero " + i + ", zoo plein : " + zoo2.isFull());
            }
        }

        // isFull
        System.out.println("\n-- isFull --");
        System.out.println("zoo1 plein ? " + zoo1.isFull());
        System.out.println("zoo2 plein ? " + zoo2.isFull());

        // comparaison
        System.out.println("\n-- comparaison --");
        System.out.println("le plus grand entre zoo1 et zoo2 : " + zoo1.getBiggestZoo(zoo2));

        Zoo zoo3 = new Zoo("Aqua Zoo", "Marseille");
        zoo3.addAnimal(new Animal("Poissons", "Nemo", 2, false));
        System.out.println("le plus grand entre zoo1 et zoo3 : " + zoo1.getBiggestZoo(zoo3));
    }
}
