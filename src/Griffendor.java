public class Griffendor extends Hogwarts {
    private int nobility; // Attribute for student nobility
    private int honor;    // Attribute for student honor
    private int courage;  // Attribute for student courage

    // Constructor for Gryffindor students
    public Griffendor(String fullName, int magicPower, int transgress, int nobility, int honor, int courage) {
        super(fullName, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    // Getter Nobility
    public int getNobility() {
        return nobility;
    }
    // Getter Honor
    public int getHonor() {
        return honor;
    }
    // Getter Courage
    public int getCourage() {
        return courage;
    }


    public static void comparisonGriffendorStudentPower(Griffendor firstStudent, Griffendor secondStudent) {
        int totalFirst = firstStudent.nobility + firstStudent.honor + firstStudent.courage;
        int totalSecond = secondStudent.nobility + secondStudent.honor + secondStudent.courage;
        if (totalSecond > totalFirst) {
            System.out.println(secondStudent.getFullName() + " is a better Gryffindor than " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst) {
            System.out.println(firstStudent.getFullName() + " is a better Gryffindor than " + secondStudent.getFullName());
        } else {
            System.out.println("Both Gryffindor students are equally strong.");
        }
    }


    public static void describeStudent(Griffendor Student) {
        System.out.println("The student " + Student.getFullName() + " has " + Student.getMagicPower()
                + " magical power, " + Student.getTransgress() + " transgression distance, and traits of nobility, honor, and courage: "
                + Student.getNobility() + ", " + Student.getHonor() + ", " + Student.getCourage());
    }
}
