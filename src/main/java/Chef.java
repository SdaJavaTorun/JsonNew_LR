import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-04-21.
 */
public class Chef {

    public String firstName;
    public String lastName;
    public int age;
    public int id;

   // public List<Employe> hisWorkers = new ArrayList<>();

    public Map<Integer, List<Employe>> hisWorkers = new HashMap<>();

    public Chef(String firstName, String lastName, int age, int id,
                Map<Integer, List<Employe>> hisWorkers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.hisWorkers = hisWorkers;
    }
}
