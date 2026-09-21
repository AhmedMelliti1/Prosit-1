import java.util.Scanner;

public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {
        ZooManagement z=new ZooManagement();
        System.out.println(z.zooName + " comporte "+z.nbrCages +" cages");
        Scanner s=new Scanner(System.in);
        do {
            z.nbrCages = s.nextInt();
        }while (z.nbrCages<0);

        Scanner s1=new Scanner(System.in);
        do {
            z.zooName= s1.nextLine();
        }while (z.zooName=="");
        System.out.println(z.zooName + " comporte "+z.nbrCages+" cages");
        s.close();
        s1.close();
    }
}
