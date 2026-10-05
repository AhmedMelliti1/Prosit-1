import java.util.Scanner;

public class ZooManagement {
    /*int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement z=new ZooManagement();
        System.out.println(z.zooName + " comporte "+z.nbrCages +" cages");
        Scanner s=new Scanner(System.in);
        System.out.println("Donenr le nombre de cage");
        do {
            z.nbrCages = s.nextInt();
        }while (z.nbrCages<0);
        System.out.println("Donner le nom du zoo");
        do {
            z.zooName= s.nextLine();
        }while (z.zooName=="");
        System.out.println(z.zooName + " comporte "+z.nbrCages+" cages");
        s.close();
    }*/
    /*Animal un_lion= new Animal();
        Zoo myZoo = new Zoo();
        un_lion.family="";
        un_lion.name= "lion";
        un_lion.age= 10;
        un_lion.isMammal= true;
        Animal[] a= {un_lion};
        myZoo.animals=a;
        myZoo.name="My zoo";
        myZoo.city="Paris";
        myZoo.nbrCages=10;*/
    public static void main(String[] args) {

        Animal un_lion = new Animal("","lion",10,true);
        Animal[] a= {un_lion};
        Zoo myZoo = new Zoo(a,"","",10);
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, true);
        Animal snake = new Animal("Reptile", "Kaa", 3, false);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}
