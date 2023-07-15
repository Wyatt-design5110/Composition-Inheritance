
/**
 * Write a description of class Department here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Department{
    private Professor chair;
    private Professor[] faculty;
    private Course[] courses;

    public Department(Professor c, Professor[] f, Course[] cs){
        this.faculty = new Professor[f.length];
        for(int i = 0; i < f.length; i++){
            this.faculty[i] = new Professor(f[i]);

        }
        this.courses = new Course[cs.length];
        for(int j = 0; j < cs.length; j++){
            this.courses[j] = new Course(cs[j]);
        }
    }
    public void setChair(Professor c){
        this.chair = new Professor(this.chair);
    }
    public Professor getChair(){
        return new Professor(this.chair);
    }
    public void setFaculty (Professor[] f){
        this.faculty= new Professor[f.length];

        for(int l = 0; l < f.length; l++){
            this.faculty[l] = new Professor(f[l]);
        }
    }
    public Professor[] getFaculty(){
        Professor[] temp = new Professor[this.faculty.length];

        for(int k = 0; k< temp.length; k++){
            temp[k] = new Professor(this.faculty[k]);
        }
        return temp;
    }
    public void setCourses (Course[] c){
        this.courses= new Course[c.length];

        for(int m = 0; m < c.length; m++){
            this.courses[m] = new Course(c[m]);
        }
    }
    public Course[] getCourses(){
        Course[] temp = new Course[this.courses.length];

        for(int r = 0; r< temp.length; r++){
            temp[r] = new Course(this.courses[r]);
        }
        return temp;
    }
    public String toString(){
        String s ="";
        s += "Department Info:\n\nChair: " +  this.chair;
        for(int i = 0; i < this.faculty.length; i++){
            s += "Professor #" + (i+1) + "Info:\n\n" + this.faculty[i].toString() + "\n";
        }
        for(int j = 0; j < this.courses.length; j++){
            s += "Course #" + (j+1) + "Info:\n\n" + this.courses[j].toString() + "\n";
        }
        return s;
    }
}