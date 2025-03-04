package uni;
import uni.Major;
import java.util.ArrayList;

public class Student {
    public static int ID = 3001;
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public String studentID;
    public int personID;
    public final int entranceYear;
    public int majorID;

    public Student(int perosonID, int entranceYear, int majorID) {
        this.id = ID;
        ID +=1;
        this.entranceYear = entranceYear;
        this.personID = perosonID;
        this.majorID = majorID;
        studentList.add(this);
        addStudentToMajor(this.majorID);
    }


    public static Student findByID(int id) {
        for (Student student : studentList) {
            if (Integer.parseInt(student.studentID) == id) {
                return student;
            }
        }
        return null;
    }


    public void addStudentToMajor(int majId) {
        Major major = Major.findByID(majId);
        if (major != null) {
            major.addStudent();
        }
    }

    public void setStudentCode() {
        int numStudentsInMajor = 0;
        for (Student student : studentList) {
            if (student.majorID == this.majorID && student.entranceYear == this.entranceYear) {
                numStudentsInMajor++;
            }
        }
        this.studentID = String.format("%d%02d%03d", this.entranceYear, this.majorID, numStudentsInMajor);
    }
}
