import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-04-21.
 */
public class Master {

    public String firstName;
    public String lastName;
    public int age;
    public int id;

    public  Map<Integer, List<Chef>> hisChief = new HashMap<>();

    public Master(String firstName, String lastName, int age,
                  int id, Map<Integer, List<Chef>> hisChief) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.hisChief = hisChief;
    }
}

