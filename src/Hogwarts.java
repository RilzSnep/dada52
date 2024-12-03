public class Hogwarts {
    private String fullName;
    private int magicPower; // Attribute for student's magical power
    private int transgress; // Attribute for student's transgression distance

    // Constructor for Hogwarts student
    public Hogwarts(String fullName, int magicPower, int transgress) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    // Getter for name
    public String getFullName() {
        return fullName;
    }
    //Getter for magic power
    public int getMagicPower() {
        return magicPower;
    }
    //Getter for magic Transgress
    public int getTransgress() {
        return transgress;
    }


    public static void comparisonStudentsMagicPower(Hogwarts firstStudent, Hogwarts secobdStudent) { // Note: small typo in 'secondStudent'
        if (firstStudent.magicPower + firstStudent.transgress > secobdStudent.magicPower + secobdStudent.transgress) {
            System.out.println(firstStudent.fullName + " is stronger than " + secobdStudent.fullName + " in magical power.");
        } else if (firstStudent.magicPower + firstStudent.transgress < secobdStudent.magicPower + secobdStudent.transgress) {
            System.out.println(secobdStudent.fullName + " is stronger than " + firstStudent.fullName + " in magical power.");
        } else {
            System.out.println("Both students have equal magical power.");
        }
    }


    public static void describeStudent(Hogwarts Student) {
        if (Student instanceof Griffendor) {
            Griffendor.describeStudent((Griffendor) Student);
        } else if (Student instanceof Pufendui) {
            Pufendui.describeStudent((Pufendui) Student);
        } else if (Student instanceof Cogtevran) {
            Cogtevran.describeStudent((Cogtevran) Student);
        } else if (Student instanceof Slizerin) {
            Slizerin.describeStudent((Slizerin) Student);
        }
    }
}
