public class Hogwarts {
    private String fullName;
    private int magicPower;
    private int transgress;

    public Hogwarts(String fullName, int magicPower, int transgress) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }
    public static void comparisonStudentsMagicPower(Hogwarts firstStudent, Hogwarts secobdStudent){
        if (firstStudent.magicPower + firstStudent.transgress > secobdStudent.magicPower + secobdStudent.transgress){
            System.out.println(firstStudent.fullName + " сильнее " + secobdStudent.fullName + " в магической силе");
        } else if (firstStudent.magicPower + firstStudent.transgress < secobdStudent.magicPower + secobdStudent.transgress){
            System.out.println(secobdStudent.fullName + " сильнее " + firstStudent.fullName + " в магической силе");
        } else {
            System.out.println("Магические силы студентов равны");
        }
    }
    public static void describeStudent(Hogwarts Student) {
        if (Student instanceof Griffendor) {
            Griffendor student = (Griffendor) Student;
            Griffendor.describeStudent(student);
        } else if (Student instanceof Pufendui) {
            Pufendui students = (Pufendui) Student;
            Pufendui.describeStudent(students);
        } else if (Student instanceof Cogtevran) {
            Cogtevran students = (Cogtevran) Student;
            Cogtevran.describeStudent(students);
        } else if (Student instanceof Slizerin) {
            Slizerin students = (Slizerin) Student;
            Slizerin.describeStudent(students);
        }
    }


}