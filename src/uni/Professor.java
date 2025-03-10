package uni;

import java.util.ArrayList;

public class Professor {
    public static int ID = 3001;
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID){
        this.personID = personID;
        this.majorID = majorID;
        this.id = ID;
        ID += 1;
        professorList.add(this);
    }

    public static Professor findByID(int id) {
        for (Professor professor : professorList) {
            if (professor.id == id) {
                return professor;
            }
        }
        return null;
    }
}
