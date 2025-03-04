package Base;
import java.util.ArrayList;

public class PersonClass {
    public static int personId = 1001;
    public static ArrayList<PersonClass> personList = new ArrayList<>();


    public int personID;
    public int nationalId;
    public String name;

    public PersonClass(String name, int nationalId){
        this.personID = personId;
        personId++;
        this.name = name;
        personList.add(this);
        this.nationalId = nationalId;
    }
    public static PersonClass findBYid(int ID){
        for(PersonClass person: personList){
            if(person.personID == ID){
                System.out.println("YES");
                return person;
            }
        }
        System.out.println("Student does not exist!");
        return null;
    }

}
