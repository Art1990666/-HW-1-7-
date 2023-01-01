import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();
        transient5();
        transient6();
        transient7();
    }

    public static void transient1 () {
        System.out.println("HomeWork-1!");
        int age = 19;
        if (age >= 18) {
            System.out.println( "Если возраст человека равен " + age + " то он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println( "Если возраст человека равен " + age +
                    " то он не достиг совершеннолетия, нужно немного подождать ");
        }
    }

    public static void transient2 () {
            System.out.println("HomeWork-2!");
            int temp = 6;
            if (temp <= 5) {
                System.out.println( " На улице " + temp + " градусов, нужно надеть шапку ");
            }
            if (temp > 5) {
                System.out.println(" На улице " + temp + " градусов, можно идти без шапки ");
            }
        }
    public static void transient3 () {
            System.out.println("HomeWork-3!");
        int speed = 61;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("  Если скорость " + speed + " то можно ездить спокойно");
        }
    }
    public static void transient4 () {
            System.out.println("HomeWork-4!");
        int age = 2;
        if (age >= 2 && age < 6) {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в детский садик ");
        }
        int ageH = 7;
        if (ageH >= 7 && ageH < 18) {
            System.out.println(" Если возраст человека равен " + ageH +
                    " , то ему нужно ходить в школу ");
        }
        int ageK = 18;
        if (ageK >= 18 && ageK < 24) {
            System.out.println(" Если возраст человека равен " + ageK +
                    " , то его место в университете ");
        }
        int ageL = 24;
        if (ageL >= 24) {
            System.out.printf(" Если возраст человека равен " + ageL +
                    " , то ему пора ходить на работу ");
        }
    }
    public static void transient5 () {
            System.out.println("HomeWork-5!");
        int age = 4;
        if (age <= 5) {
            System.out.printf(" Если возраст ребенка равен " + age +
                    " , то ему нельзя кататься на аттракционе без сопровождения взрослого ");
        }
        int ageF = 6;
        if (ageF >=5 && ageF < 14) {
            System.out.printf(" Если возраст ребенка равен " + ageF + " " +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого ");
        }
        int ageG = 14;
        if (ageG >= 14) {
            System.out.printf(" Если возраст ребенка равен " + ageG +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void transient6 () {
            System.out.println("HomeWork-6!");
            int pep = 42;
            if (pep <= 102) {
                System.out.printf(" Если в вагоне поезда помещается 102 человека, 60 из которых сидячие, " +
                        "то стоячих вагонов остается " + pep + " места ");
            } else {
            System.out.printf(" В вагоне поезда есть " + pep + " сидячих места и 60 стоячих");
            }
    }
    public static void transient7 () {
        System.out.println("HomeWork-7!");
        int one = 1;
        int two = 2;
        int tree = 3;
        if (two >= 1) {
            System.out.printf(" Если 2 больше чем " + one + ", то цифра " + tree + " будет больше, чем 1 или 2 ");
            } else {
            System.out.printf(" Цифра " + tree + " больше, чем 2 или 1 ");
        }
        }
    }
