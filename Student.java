
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person{
    private String student_id;
    private double gpa;

    public Student (String n, int a, String s, boolean ali,String stu_id, double g){
        super(n,a,s,ali);
        this.student_id = stu_id;
        this.gpa = g;

    }
    public Student (Student p){
        this.student_id = p.student_id;
        this.gpa = p.gpa;
    }
    public String getStudent_id(){
        return this.student_id;
    }
    public void setGPA(double g){
        this.gpa = g;
    }
    public double getGPA(){
        return this.gpa;
    }
    public String toString(){
        String s =super.toString();
        s += "Student_id:" + this.student_id +"\n";
        s += "GPA:" + this.gpa +"\n";
        return s;
    }
}