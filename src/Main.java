//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ////Задача 1
        System.out.println("Задача № 1");
        int Int = 100;
        byte Byte = 7;
        short Short = 20;
        long Long = 10000000L;
        float Float = 30.1f;
        double Double = 2.2;
        System.out.println("Знвчение переменной Int c типом int = " + Int);
        System.out.println("Знвчение переменной Byte c типом byte = " + Byte);
        System.out.println("Знвчение переменной Short c типом short = " + Short);
        System.out.println("Знвчение переменной Long c типом long = " + Long);
        System.out.println("Знвчение переменной Float c типом float = " + Float);
        System.out.println("Знвчение переменной Double c типом double = " + Double);

        //////Задача 2
        System.out.println();
        System.out.println("Задача № 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("double = " + a);
        System.out.println("long = " + b);
        System.out.println("float = " + c);
        System.out.println("int = " + d);
        System.out.println("short = " + e);
        System.out.println("int = " + f);
        System.out.println("bite = " + g);

        ////////Задача 3
        System.out.println();
        System.out.println("Задача № 3");
        int studentsInClass1 = 23;
        int studentsInClass2 = 27;
        int studentsInClass3 = 30;
        int totalSheetsOfPaper = 480;

        int sheetsOfPaperPerStudent = totalSheetsOfPaper / (studentsInClass1 + studentsInClass2 + studentsInClass3);
        System.out.println("На каждого ученика рассчитано - " + sheetsOfPaperPerStudent + " листов бумаги.");

        ///////Задача 4
        System.out.println();
        System.out.println("Задача № 4");

        int bottlesInTwoMinutes = 16;
        int bottlesInOneMinutes = bottlesInTwoMinutes / 2;
        int minutesPerDay = 24 * 60;
        int minutesInThreeDays = minutesPerDay * 3;
        int minutesPerMonth = minutesPerDay * 30;

        int bottlesInTwentyMinutes = bottlesInOneMinutes * 20;
        int bottlesInThreeDays = minutesInThreeDays * bottlesInOneMinutes;
        int bottlesPerMonth = minutesPerMonth * bottlesInOneMinutes;
        ///int bottlesPerMonth = bottlesInThreeDays * 10; ///зная сколько производим за три дня, можем выяснить производство за месяц.(В том случае если в месяце 30 дней)


        System.out.println("За 20 минут машина произвела - " + bottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За 3 дня машина произвела - " + bottlesInThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела - " + bottlesPerMonth + " штук бутылок");


        ///////Задача 5
        System.out.println();
        System.out.println("Задача № 5");

        int totalCansOfPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;

        int totalClasses = totalCansOfPaint / (whitePaintPerClass + brownPaintPerClass);
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;

        System.out.println("В школе, где - " + totalClasses + " классов, нужно - " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        ///////Задача 6
        System.out.println();
        System.out.println("Задача № 6");

        int weightOfBananas = 5 * 80;
        int milkWeight = (200 * 105) / 100;
        int iceCreamWeight = 2 * 100;
        int weightOfRawEggs = 4 * 70;

        int breakfastWeightInGrams = weightOfBananas + milkWeight + iceCreamWeight + weightOfRawEggs;
        double breakfastWeightInKilograms = breakfastWeightInGrams / 1000.0;


        System.out.println("Вес завтрвка в граммах = " + breakfastWeightInGrams + " гр.");
        System.out.println("Вес завтрака в килограммах = " + breakfastWeightInKilograms + " кг.");

        ///////Задача 7
        System.out.println();
        System.out.println("Задача № 7");

        int weightLoss = 7;
        int weightLossPerDay1 = 250;
        int weightLossPerDay2 = 500;

        int justDaysToLoseWeight1 = (weightLoss * 1000) / weightLossPerDay1;
        int justDaysToLoseWeight2 = (weightLoss * 1000) / weightLossPerDay2;
        int averageNumberOfDays = (justDaysToLoseWeight1 + justDaysToLoseWeight2) / 2;

        System.out.println("Если спортсмен в день будет терять по 250 гр., то ему понадобится - " + justDaysToLoseWeight1 + " дней для достижения результата.");
        System.out.println("Если спортсмен в день будет терять по 500 гр., то ему понадобится - " + justDaysToLoseWeight2 + " дней для достижения результата.");
        System.out.println("Для достижения цели в среднем понадобится - " + averageNumberOfDays + " день");

        ///////Задача 8
        System.out.println();
        System.out.println("Задача № 8");

        int mashaIncome = 67760;
        int denisIncome = 83690;
        int kristinaIncome = 76230;

        int mashaNewIncome = (int) (mashaIncome * 1.1);  /// более упрощеный вариант
        //int mashaNewIncome = (mashaIncome * 10) / 100 + mashaIncome; //Вариант из школьной программы 5 класса
        int denisNewIncome = (int) (denisIncome * 1.1); /// более упрощеный вариант
        //int denisNewIncome = (denisIncome * 10) / 100 + denisIncome; //Вариант из школьной программы 5 класса
        int kristinaNewIncome = (int) (kristinaIncome * 1.1); /// более упрощеный вариант
        //int kristinaNewIncome = (kristinaIncome * 10) / 100 + kristinaIncome; //Вариант из школьной программы 5 класса

        int mashaAnnualIncome = mashaIncome * 12;
        int denisAnnualIncome = denisIncome * 12;
        int kristinaAnnualIncome = kristinaIncome * 12;

        int mashaNewAnnualIncome = mashaNewIncome * 12;
        int denisNewAnnualIncome = denisNewIncome * 12;
        int kristinaNewAnnualIncome = kristinaNewIncome * 12;

        System.out.println("Маша теперь получает - " + mashaNewIncome + " рублей. Годовой доход вырос на - " + (mashaNewAnnualIncome - mashaAnnualIncome) + " рублей");
        System.out.println("Денис теперь получает - " + denisNewIncome + " рублей. Годовой доход вырос на - " + (denisNewAnnualIncome - denisAnnualIncome) + " рублей");
        System.out.println("Кристина теперь получает - " + kristinaNewIncome + " рублей. Годовой доход вырос на - " + (kristinaNewAnnualIncome - kristinaAnnualIncome) + " рублей");

    }
}
