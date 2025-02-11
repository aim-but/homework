public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание №3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание №4");
        var friend = 19;
        friend = (friend + 2) / 7;
        System.out.println(friend);

        System.out.println("Задание №5");
        var frog = 3.5;
        frog = (frog * 10) / frog;
        frog += 4;
        System.out.println(frog);

        System.out.println("Задание №6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Суммарный вес боксёров = " + totalWeight + " кг");
        var weightDifference = boxer1Weight - boxer2Weight;
        System.out.println("Разница в весе боксёров = " + weightDifference + " кг");
        var weightDifference1 = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксёров = " + weightDifference1 + " кг");

        System.out.println("Задание %7");
        var weightDifference2 = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе боксёров = " + weightDifference2 + " кг");

        System.out.println("Задание %8");
        var totalTime = 640;
        var emploeeTime = 8;
        var totalEmploees = totalTime / emploeeTime;
        System.out.println("Всего работников в компании " + totalEmploees + " человек");
        totalEmploees = totalEmploees + 94;
        System.out.println("Теперь работников в компании " + totalEmploees + " человек");
        totalTime = totalEmploees * emploeeTime;
        System.out.println("Если в компании работает " + totalEmploees + " человека, то всего " + totalTime + "часа работы может быть поделено между сортрудниками ");
    }
}