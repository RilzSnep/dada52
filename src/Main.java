public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2);
        System.out.println(friend);
        friend = (friend / 7);
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = (frog * 10);
        System.out.println(frog);
        frog = (frog / 3.5);
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var massaFirst = 78.2;
        var massaSecond = 82.7;
        var total = massaSecond + massaFirst;
        System.out.println(total);
        var toto = massaSecond - massaFirst;
        System.out.println(toto);
        System.out.println(massaSecond % massaFirst);
        var hours = 640;
        var sotrudnic = hours / 8;
        System.out.println("Всего работников в компании — " + sotrudnic + " человек");
        var sotrudnics = hours / (sotrudnic + 94);
        System.out.println("Если в компании работает " + (sotrudnic + 94) + " человек, то всего " + sotrudnics + " часов работы может быть поделено между сотрудниками");


    }
}
