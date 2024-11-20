public class Main {
    public static void main(String[] args) {
        Griffendor hermoine = new Griffendor("Гермиона Грейнджер", 70, 35, 7, 6, 6);
        Griffendor poter = new Griffendor("Гарри Поттер", 85, 45, 8, 9, 5);
        Hogwarts.describeStudent(hermoine);
        Hogwarts.comparisonStudentsMagicPower(hermoine, poter);
        Griffendor.comparisonGriffendorStudentPower(hermoine, poter);
        Pufendui cedric = new Pufendui("Седрик Диггори", 88, 55, 6, 7, 8);
        Hogwarts.comparisonStudentsMagicPower(cedric, poter);
    }
}
