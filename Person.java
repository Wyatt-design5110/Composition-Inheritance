
/**
 * Wyatt Gaines
 * Mason Kubiak
 */
public class Person{
    private String name;
    private int age;
    private String SSN;
    private boolean alive;

    public Person (String n, int a, String s, boolean ali){
        this.name = n;
        this.age = a;
        this.SSN = s;
        this.alive = ali;
    }
    public Person (Person p){
        if (p == null || p.name.equals("") || p.age <= 0 || p.SSN.equals("")){
            System.out.println("Does not Exist!");
            System.exit(1);
        }
        this.name = p.name;
        this.age = p.age;
        this.SSN = p.SSN;
        this.alive = p.alive;
    }
    public Person(){
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return this.age;
    }
    public void setSSN (String s){
        this.SSN = s;
    }
    public String getSSN(){
        return this.SSN;
    }
    public void setAlive(boolean ali){
        this.alive = ali;
    }
    public boolean getAlive(){
        return this.alive;
    }
    public String toString(){
        String s = "";
        s += "Name:" + this.name + "\n";
        s += "Age:" + this.age + "\n";
        s += "SSN:" + this.SSN + "\n";
        s += "Alive:" + this.alive + "\n";
        return s;
    }
}