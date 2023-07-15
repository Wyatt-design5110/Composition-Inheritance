
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person{
    private String id;
    private int salary;
    private int num_yr_prof;

    public Teacher(String n, int a, String s, boolean ali, String i, int sa, int num){
        super(n,a,s,ali);
        this.id = i;
        this.salary = sa;
        this.num_yr_prof = num;
    }
    public Teacher (Teacher p){
        super(p.getName(), p.getAge(), p.getSSN(), p.getAlive());
        if (p == null || p.id.equals("") ||  p.salary <= 0 || p.num_yr_prof <= 0 ){
            System.out.println("Does not Exist!");
            System.exit(1);
        }
        this.id = p.id;
        this.salary = p.salary;
        this.num_yr_prof = p.num_yr_prof;
    }
    public Teacher(){
    }
    public void setId(String i){
        this.id = i;
    }
    public String getId(){
        return this.id;
    }
    public void setSalary(int sa){
        this.salary = sa;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setNum_yr_prof(int num){
        this.num_yr_prof = num;
    }
    public int getNum_yr_prof(){
        return this.num_yr_prof;
    }
    public String toString(){
        String s = super.toString();
        s += "Id:" + this.id +"\n";
        s += "Salary:" + this.salary +"\n";
        s += "Num_yr_prof:" + this.num_yr_prof +"\n";
        return s;
    }
}