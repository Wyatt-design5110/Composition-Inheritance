
/**
 *
 */
public class College_student extends Student{
    private String major, grade;

    public College_student(String n, int a, String s, boolean ali,String stu_id, double g, String m, String gr){
        super(n,a,s,ali,stu_id,g);
        this.major = m;
        this.grade = gr;
    }
    public College_student(College_student cs){
        super(cs.getName(), cs.getAge(), cs.getSSN(), cs.getAlive(), cs.getStudent_id(), cs.getGPA());
        this.major = cs.major;
        this.grade= cs.grade;
        if (cs == null || cs.major.equals("") ||  cs.grade.equals("")){
            System.out.println("Does not Exist!");
            System.exit(1);
        }
        this.major = cs.major;
        this.grade = cs.grade;
    }
    public String getMajor(){
        return this.major;
    }
    public void setGrade(String gr){
        this.grade = gr;
    }
    public String getGrade(){
        return this.grade;
    }
    public String toString(){
        String s = super.toString();
        s += "Major:" + this.major +"\n";
        s += "Grade:" + this.grade +"\n";
        return s;
    }
}