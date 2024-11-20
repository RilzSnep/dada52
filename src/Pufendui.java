public class Pufendui extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Pufendui(String fullName, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(fullName, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public static void comparisonPufenduiStudentPower(Pufendui firstStudent, Pufendui secondStudent){
        int totalFirst = firstStudent.hardworking + firstStudent.loyal + firstStudent.honest;
        int totalSecond = secondStudent.hardworking + secondStudent.loyal + secondStudent.honest;
        if (totalSecond > totalFirst){
            System.out.println(secondStudent.getFullName() + " лучший Пуфендуец, чем " + firstStudent.getFullName());
        } else if (totalSecond < totalFirst){
            System.out.println(firstStudent.getFullName() + " лучший Пуфендуец, чем " + secondStudent.getFullName());
        } else {
            System.out.println("Силы Пуфендуйцев равны");
        }
    }
    public static void describeStudent(Hogwarts Student) {
        Pufendui students = (Pufendui) Student;
        System.out.println("У студента " + students.getFullName() + " " + students.getMagicPower()
                + " магической силы и " + students.getTransgress() + " расстояние трансгресии и " + " трудолюбивы, верны, честны " +
                students.getHardworking() + ", " + students.getLoyal() + ", " + students.getHonest());
    }
}