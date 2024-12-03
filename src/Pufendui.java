public class Pufendui extends Hogwarts {
    private int hardworking;  // Attribute for student hard work
    private int loyal; // Attribute for student loyalty
    private int honest;// Attribute for student honesty

    // Constructor for Pufendui students
    public Pufendui(String fullName, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(fullName, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    // Getter Hardworking
    public int getHardworking() {
        return hardworking;
    }
    // Getter Loyal
    public int getLoyal() {
        return loyal;
    }
    // Getter Honest
    public int getHonest() {
        return honest;
    }

    public static void comparisonPufenduiStudentPower(Pufendui firstStudent, Pufendui secondStudent) {
        int totalFirst = firstStudent.hardworking + firstStudent.loyal + firstStudent.honest;
        int totalSecond = secondStudent.hardworking + secondStudent.loyal + secondStudent.honest;
        if (totalSecond > totalFirst) {
            System.out.println(secondStudent.getFullName() + " is a better Hufflepuff than " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst) {
            System.out.println(firstStudent.getFullName() + " is a better Hufflepuff than " + secondStudent.getFullName());
        } else {
            System.out.println("Both Hufflepuff students are equally strong.");
        }
    }

    public static void describeStudent(Pufendui Student) {
        System.out.println("The student " + Student.getFullName() + " has " + Student.getMagicPower()
                + " magical power, " + Student.getTransgress() + " transgression distance, and traits of hardworking, loyalty, and honesty: "
                + Student.getHardworking() + ", " + Student.getLoyal() + ", " + Student.getHonest());
    }
}
