package uni;
import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public static ArrayList<Integer> studentIdS = new ArrayList<>();


    public PresentedCourse(int courseID, int professorID, int maxCapacity) {
        this.id = presentCourseList.size() + 1;
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = maxCapacity;
        studentIdS = new ArrayList<>(maxCapacity);
        presentCourseList.add(this);

    }


    public void addStudent(int studentID) {
        if (studentIdS.size() < capacity) {
            studentIdS.add(studentID); // اضافه کردن دانشجو به لیست
        } else {
            System.out.println("Course is full.");
        }
    }


    public static PresentedCourse findByID(int id) {
        for (PresentedCourse presentedCourse : presentCourseList) {
            if (presentedCourse.id == id) {
                return presentedCourse;
            }
        }
        return null;
    }
}
