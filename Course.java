
/**
 *
 */
public class Course{
    private String instructorName;
    private String course_name;
    private College_student[] students;

    public Course(String in, String cn, College_student [] l){
        this.instructorName = in;
        this.course_name = cn;
        this.students = new College_student[l.length];

        for(int i = 0;  i < l.length; i++){
            this.students[i] = new College_student (l[i]);
        }
    }
    public Course (Course p){
        if (p == null || p.instructorName.equals("") || p.course_name.equals("")){
            System.out.println("Does not Exist!");
            System.exit(1);
        }
        this.instructorName = p.instructorName;
        this.course_name = p.course_name;
        students = p.students;

    }
    public void setInstructorName (String in){
        this.instructorName = in;
    }
    public String getInstructorName (){
        return this.instructorName;
    }
    public void setCourse_name (String cn){
        this.course_name = cn;
    }
    public String getCourse_name (){
        return this.course_name;
    }
    public void setStudent (College_student[] l){
        this.students= new College_student[l.length];

        for(int i = 0; i < l.length; i++){
            this.students[i] = new College_student(l[i]);
        }
    }
    public College_student[] getStudentList(){
        College_student[] temp = new College_student[this.students.length];

        for(int i = 0; i< temp.length; i++){
            temp[i] = new College_student(this.students[i]);
        }
        return temp;
    }
    public String toString(){
        String s = "";
        s += "Course Info:\n\nInstructorName: " + this.instructorName + "\nCourseName: " + this.course_name + "\n\nList of Students:\n\n";

        for(int i = 0; i < this.students.length; i++){
            s += "College Student #" + (i+1) + "Info:\n\n" + this.students[i].toString() + "\n";
        }
        return s;
    }
}