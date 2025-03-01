package uni;
import java.util.ArrayList;

public class Major {

    public static int majorID = 2001;
    public static ArrayList<Major> majorList = new ArrayList<>();

    public String name;
    public final int capacity ;
    public int numbersOfStudents =0 ;
    public int majorId;


    public Major(String name, int capacity) {
        this.name = name;
        this.majorId = majorID;
        majorID +=1;
        this.capacity = capacity;
    }


    public static Major findBYid(int ID) {
        for (Major major : majorList) {
            if (major.majorId == ID) {
                return major;
            }
        }
        return null;
    }


    public void addStudent(){
        if(this.numbersOfStudents == this.capacity){
            System.out.println("Limit has reached");
        }else{
            this.numbersOfStudents +=1 ;
        }
    }
}
