class Student {
    String name;
    int grp;
    int year;

    void Student() {
        System.out.println(name + " is in group " + grp + " in " +year+ " year");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Object Created
        s.name = "Tanishq";
        s.grp = 7;
        s.year = 2;
        s.Student();
    }
}
