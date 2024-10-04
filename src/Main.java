public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2009;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year = 2000;
        if (year > 1584 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 95;
        int days = 0;
        boolean deliveryAvailable = true;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days = 3;
        } else {
            deliveryAvailable = false;
        }

        if (deliveryAvailable) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }

    }
}
