package uni;

import java.util.ArrayList;

public class Course {
    public static int ID = 5001;
    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String tittle;
    public int units;

    public Course(String tittle, int units){
        this.id = ID;
        ID += 1;
        this.tittle = tittle;
        this.units = units;
        courseList.add(this);
    }

    public static Course findByID(int id) {
        for (Course course : courseList) {
            if (course.id == id) {
                return course;
            }
        }
        return null;
    }
}
