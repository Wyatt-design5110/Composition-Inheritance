
/**
 *
 */
public class Professor extends Teacher{
    private String speciality, research_area, rank;
    private boolean tenured;

    public Professor(String n, int a, String s, boolean ali, String i, int sa, int num, String ra, String r){
        super(n, a, s, ali, i, sa, num);
        this.speciality = s;
        this.research_area = r;
        this.rank = ra;
        this.tenured = tenured;
    }
    public Professor (Professor p){
        super(p.getName(), p.getAge(), p.getSSN(), p.getAlive(), p.getId(), p.getSalary(), p.getNum_yr_prof());
        if (p == null || p.speciality.equals("") ||  p.research_area.equals("") || p.rank.equals("")){
            System.out.println("Does not Exist!");
            System.exit(1);
        }
        this.speciality = p.speciality;
        this.research_area = p.research_area;
        this.rank = p.rank;
        this.tenured = p.tenured;
    }
    public Professor(){
    }
    public void setSpeciality(String s){
        this.speciality = s;
    }
    public String getSpeciality(){
        return this.speciality;
    }
    public void setResearchArea(String r){
        this.research_area = r;
    }
    public String getResearchArea(){
        return this.research_area;
    }
    public void setRank(String ra){
        this.rank = ra;
    }
    public String getRank(){
        return this.rank;
    }
    public void setTenured(boolean t){
        this.tenured = t;
    }
    public boolean getTenured(){
        return this.tenured;
    }
    public String toString(){
        String s =super.toString();
        s += "Professor Info\n\nSpecialty:" + this.speciality +"\n";
        s += "Research Area: " + this.research_area +"\nRank: " + this.rank + "\nTenured? " + this.tenured;
        return s;
    }
}
