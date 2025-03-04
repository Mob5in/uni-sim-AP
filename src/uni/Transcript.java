package uni;
import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID){
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade){
        PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
        if(presentedCourse != null && PresentedCourse.studentIdS.contains(studentID)){
            transcript.put(presentedCourseID, grade);
        }else{
            System.out.println("student don't have this course");
        }
    }

    public void printTranscript(){
        Student student = Student.findByID(studentID);
        if(student != null){
            System.out.println("name: " + student.personID + " student code: " + student.studentID);
            for(int presentedCourseID : transcript.keySet()){
                PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
                if(presentedCourse != null){
                    Course course = Course.findByID(presentedCourse.courseID);
                    if(course != null){
                        System.out.println("course: " + course.tittle + "grade:  " + transcript.get(presentedCourseID));
                    }
                }
            }
        }
    }

    public double getGPA(){
        double totalGrades = 0;
        int totalUnits = 0;
        for(int presentedCourseID : transcript.keySet()){
            PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
            if(presentedCourse != null){
                Course course = Course.findByID(presentedCourse.courseID);
                if (course != null){
                    totalGrades += transcript.get(presentedCourseID) * course.units;
                    totalUnits += course.units;
                }
            }
        }
        return totalUnits != 0 ? totalGrades / totalUnits : 0;
    }
}
