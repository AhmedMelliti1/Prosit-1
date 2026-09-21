import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
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
    }
}
