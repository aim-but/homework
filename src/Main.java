public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte dog = 127;
        System.out.println("Значение переменной dog с типом byte равно " + dog);
        short cat = 32767;
        System.out.println("Значение переменной cat с типом short равно " + cat);
        int flower = 21474883;
        System.out.println("Значение перемнной flower с типом int равно  " + flower);
        long tree = 9223372965L;
        System.out.println("Значение переменной tree с типом long равно " + tree);

        System.out.println("Задание 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println("Задание 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        int overClass = teacher1 + teacher2 + teacher3;
        int expensed = paper/overClass;
        System.out.println("На каждого ученика расчитано " + expensed + " листов бумаги");

        System.out.println("Задание 4");
        byte speedMash = 16;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int speedMin = speedMash/2;
        int end1 = time1 * speedMin;
        System.out.println("За " + time1 + " машина произвела " + end1 + " штук бутылок");
        int end2 = time2 * speedMin;
        System.out.println("За " + time2 + " машина произвела " + end2 + " штук бутылок");
        int end3 = time3 * speedMin;
        System.out.println("За " + time3 + " машина произвела " + end3 + " штук бутылок");
        int end4 = time4 * speedMin;
        System.out.println("За " + time4 + " машина произвела " + end4 + " штук бутылок");

        System.out.println("Задание 5");
        int white = 2;
        int brown = 4;
        int total = 120;
        int totalClasses = total/(white + brown);
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где" + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("Задание 6");
        int banana = 80 * 5;
        int milk = 200/100 * 105;
        int iceCream = 100 * 2;
        int egg = 70 * 5;
        int gWeight = banana + milk + iceCream + egg;
        double kgWeight = gWeight/1000.0;
        System.out.println("Вес такого спорт завтрака в кг - " + kgWeight);

        System.out.println("Задание 7");
        int targetKG = 7;
        int minGramPerDay = 250;
        int maxGramPerDay = 500;
        int targetGram = targetKG * 1000;
        int ifMin = targetGram/minGramPerDay;
        int ifMax = targetGram/maxGramPerDay;
        int daysAverage = (ifMin + ifMax)/2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + ifMin + " дней");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + ifMax + " дней");
        System.out.println("если в среднем - " + daysAverage + " день");

        System.out.println("Задание 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashUp = Masha/100 * 10;
        int DenisUp = Denis/100 * 10;
        int KristinaUp = Kristina/100 * 10;
        int MashaNew = Masha + MashUp;
        int DenisNew = Denis + DenisUp;
        int KristinaNew = Kristina + KristinaUp;
        int MashaYearUp = MashUp * 12;
        int DenisYearUp = DenisUp * 12;
        int KristinaYearUp = KristinaUp * 12;
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaYearUp + " рублей");
        System.out.println("Денис теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisYearUp + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaYearUp + " рублей");
    }
}