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
        int bottlesInOneMinutes = 16/2;
        int minutesPerDay = 24 * 60;
        int minutesInThreeDays = minutesPerDay * 3;
        int minutesPerMonth = minutesPerDay * 30;

        int bottlesInTwentyMinutes = bottlesInOneMinutes * 20;
        int bottlesInThreeDays = minutesInThreeDays * bottlesInOneMinutes;
        int bottlesPerMonth = minutesPerMonth * bottlesInOneMinutes;
        ///int bottlesPerMonth = bottlesInThreeDays * 10; ///зная сколько производи за три дня, можем выяснить производство за месяц.(В том случае если в месяце 30 дней)


        System.out.println("За 20 минут машина произвела - " + bottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За 3 дня машина произвела - " + bottlesInThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела - " + bottlesPerMonth + " штук бутылок");


        ///////Задача 4
        System.out.println();
        System.out.println("Задача № 5");


    }
}
