public class Main {
    public static void main(String[] args) {
        int intNum = 300000000;
        byte byteNum = 120;
        short shortNum = 30000;
        long longNum = 300000000;
        float floatNum = 1.1f;
        double doubleNum = 1.1231343423323;

        System.out.println("Значение переменной intNum с типом int равно " + intNum);
        System.out.println("Значение переменной byteNum с типом byte равно " + byteNum);
        System.out.println("Значение переменной shortNum с типом short равно " + shortNum);
        System.out.println("Значение переменной longNum с типом long равно " + longNum);
        System.out.println("Значение переменной floatNum с типом float равно " + floatNum);
        System.out.println("Значение переменной doubleNum с типом doubl равно " + doubleNum);
        float numOne = 27.12f;
        long numTwo = 987675549;
        double numThree = 2.786;
        short numFour = 569;
        short numFife = -159;
        short numSix = 27897;
        byte numSeven = 67;

        int studentOne = 27;
        int studentTwo = 23;
        int studentThree = 30;
        int paper = 480;
        int total = paper / (studentOne + studentTwo + studentThree);
        System.out.println("На каждого ученика рассчитано " + total + " листов бумаги");

        int bottlesPer2Minutes = 16;
        int minutesInDay = 24 * 60; // 24 часа * 60 минут
        int daysInMonth = 30;
        // Производительность за 20 минут
        int bottlesIn20Minutes = bottlesPer2Minutes * (20 / 2);
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
        // Производительность за сутки
        int bottlesInDay = bottlesPer2Minutes * (minutesInDay / 2);
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок.");
        // Производительность за 3 дня
        int bottlesIn3Days = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        // Производительность за 1 месяц
        int bottlesInMonth = bottlesInDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок.");

        int allColors = 120;
        int whiteColorOnOneClass = 2;
        int brounColorOnOneClass = 4;
        int Classes = allColors / (whiteColorOnOneClass + brounColorOnOneClass);
        System.out.println("В школе, где "+ (Classes) +" классов, нужно "+(Classes * whiteColorOnOneClass)+" банок белой краски и "+(Classes * brounColorOnOneClass)+" банок коричневой краски");


        int countBananas = 5;
        int countMilk = 200;
        int countIceCream = 2;
        int countEgg = 4;
        int totalMass = countBananas * 80 + countMilk / 100 * 105 + countIceCream * 100 + countEgg * 70;
        System.out.println(totalMass / 1000);


        int weightToLose = 7 * 1000;
        int daysToLose250 = weightToLose / 250;
        int daysToLose500 = weightToLose / 500;
        int averageDaysToLose = (daysToLose250 + daysToLose500) / 2;
        System.out.println("Время похудения:");
        System.out.println("По 250 грамм в день: " + daysToLose250 + " дней.");
        System.out.println("По 500 грамм в день: " + daysToLose500 + " дней.");
        System.out.println("Среднее время похудения: " + averageDaysToLose + " дней.");


        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);
        int mashaIncomeDiff = (mashaNewSalary - mashaSalary) * 12;
        int denisIncomeDiff = (denisNewSalary - denisSalary) * 12;
        int kristinaIncomeDiff = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("\nПовышение зарплаты:");
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaIncomeDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncomeDiff + " рублей.");
    }
}
