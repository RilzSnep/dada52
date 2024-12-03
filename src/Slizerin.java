public class Slizerin extends Hogwarts {
    private int cunning;          // Attribute for student cunning
    private int determination;    // Attribute for student determination
    private int ambition;         // Attribute for student ambition
    private int resourcefulness;  // Attribute for student resourcefulness
    private int lustForPower;     // Attribute for student lust for power

    // Constructor for Slytherin students
    public Slizerin(String fullName, int magicPower, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magicPower, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    // Getter Cunning
    public int getCunning() {
        return this.cunning;
    }
    // Getter Determination
    public int getDetermination() {
        return determination;
    }
    // Getter Ambition
    public int getAmbition() {
        return ambition;
    }
    // Getter Resourcefulness
    public int getResourcefulness() {
        return resourcefulness;
    }
    // Getter LustForPower
    public int getLustForPower() {
        return lustForPower;
    }


    public static void comparisonSlizerinStudentPower(Slizerin firstStudent, Slizerin secondStudent) {
        int totalFirst = firstStudent.cunning + firstStudent.determination + firstStudent.ambition + firstStudent.resourcefulness + firstStudent.lustForPower;
        int totalSecond = secondStudent.cunning + secondStudent.determination + secondStudent.ambition + secondStudent.resourcefulness + secondStudent.lustForPower;
        if (totalSecond > totalFirst) {
            System.out.println(secondStudent.getFullName() + " is a better Slytherin than " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst) {
            System.out.println(firstStudent.getFullName() + " is a better Slytherin than " + secondStudent.getFullName());
        } else {
            System.out.println("Both Slytherin students are equally strong.");
        }
    }


    public static void describeStudent(Slizerin Student) {
        System.out.println("The student " + Student.getFullName() + " has " + Student.getMagicPower()
                + " magical power, " + Student.getTransgress() + " transgression distance, and traits of cunning, determination, ambition, resourcefulness, and lust for power: "
                + Student.getCunning() + ", " + Student.getDetermination() + ", " + Student.getAmbition() + ", " + Student.getResourcefulness() + ", " + Student.getLustForPower());
    }
}
