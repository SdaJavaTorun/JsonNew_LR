import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employe {

    public String firstName;
    public String lastName;
    public int age;
    public int id;

    public Employe(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public static void main(String[] args) {


        List<Employe> workerList = new ArrayList<>();

        Employe worker0 = new Employe("Andrzej", "Solecki", 23, 2);
        workerList.add(worker0);

        Employe worker1 = new Employe("Ewa", "Rybicka", 34, 5);
        workerList.add(worker1);

        Employe worker2 = new Employe("Paweł", "Piekarski", 234, 45);
        workerList.add(worker2);

        Employe worker3 = new Employe("Janusz", "Biznesu", 23, 56);
        workerList.add(worker3);

        Gson gson = new Gson();

        gson.toJson(workerList);

        for (Employe e : workerList) {
            System.out.println(e.getLastName() + " " + e.firstName);
        }


        System.out.println(gson.toJson(workerList));

        Map<Integer, List<Employe>> map = new HashMap<Integer, List<Employe>>();


        map.put(1, workerList);
        map.put(2, workerList);
        map.put(3, workerList);

        Chef chef0 = new Chef("Lukasz", "Ogan", 23, 5, map);

        System.out.println("\n SZEF\n");

        System.out.println(gson.toJson(chef0));

        List<Chef> chefList = new ArrayList<>();

        chefList.add(chef0);

        Map<Integer, List<Chef>> hisChief = new HashMap<Integer, List<Chef>>();

        hisChief.put(1, chefList);

        Master master = new Master( "Janek", "Wisniewski", 254, 0,  hisChief);
        System.out.println("\nMASTER\n");


        System.out.println(gson.toJson(master));

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
