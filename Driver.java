public class Driver{
    public static void main(String []args){
        College_student[] s1 = new College_student[4];
        s1[0] = new College_student("James Garfield", 23,"123467890", true,"1234567",3.85,"English","A");
        s1[1] = new College_student("Jessie Lemons", 22,"0987654321", true,"7654321",3.76,"Physics","C");
        s1[2] = new College_student("Emma Watson", 25,"2143658709", true,"2143657",4.0,"English","A");
        s1[3] = new College_student("Dylan Hughs", 21,"231465789", true,"0987654",3.35,"Liberal Arts","B");

        College_student[] s3 = new College_student[2];
        s3[0] = new College_student("James Garfield", 23,"123467890", true,"1234567",3.85,"English","A");
        s3[1] = new College_student("Andrew Jackson", 21,"584257842", true,"5834954",3.75,"Math","C");

        College_student[] s4 = new College_student[1];
        s4[0] = new College_student("Emma Watson", 25,"2143658709", true,"2143657",4.0,"English","A");

        Professor[] t1 = new Professor[3];
        t1[0] = new Professor("Wyatt Gaines", 28,"0192837465",true,"9021654",850000,5, "High", "Liberal Arts");
        t1[1] = new Professor("Angelo Zimmerman", 45,"9021876543",true,"098732",650000,18, "High", "English");
        t1[2] = new Professor("Martha Washington", 25,"2187654390",true,"9870456",726000,7, "Medium", "Physics");

        Professor t4 = new Professor("Mason Kubiak", 69,"47358935",true,"4326464",450000,9, "Advanced", "English");

        Course[] c2 = new Course[2];
        c2[0] = new Course("Bridget Mindler", "Poetry", s3);
        c2[1] = new Course("John Doe", "English Literature", s4);

        Department d1 = new Department(t4,t1,c2);
        // print
        System.out.println(d1);

        College_student[] s2 = new College_student[4];
        s2[0] = new College_student("Jessie Garfield", 23,"0987654321", true,"5467890",3.74,"Biology","A");
        s2[1] = new College_student("James Newton", 19,"1234567890", true,"4561238",2.05,"Chemistry","C");
        s2[2] = new College_student("Dylan Lemons", 18,"0943128765", true,"1326450",3.30,"Computer Science","A");
        s2[3] = new College_student("Emma Hughs", 24,"7809652143", true,"6783542",3.01,"English","B");

        Professor[] t2 = new Professor[3];
        t2[0] = new Professor("Martin Dasani", 26,"9876452310",true,"7182436",120000,9, "Medium", "Biology");
        t2[1] = new Professor("Angelia Luther", 32,"1029387456",true,"1098763",430000,12, "High", "Computer Science");
        t2[2] = new Professor("George O'Malley", 43,"6547382910",true,"7681453",436000,6, "Low", "Chemistry");

        Professor t3  = new Professor("Charles Cullen", 34,"0987164532",true,"124390",560000,7, "Medium", "English");

        Course[] c1 = new Course[2];
        c1[0] = new Course("Joe Mamma", "Intro to Physics", s1);
        c1[1] = new Course("Jane Doe", "Biology", s2);

        Department d2 = new Department(t3,t2,c1);
        // print
        System.out.println(d2);

    }
}
