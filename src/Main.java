import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("------------------------------");
        int totalSvings = 2459000;
        float percent = 0.12F;
        int capital = 15000;
        capital += capital * percent;
        int totalCapital = 0;
        int month = 0;
        while (totalCapital < totalSvings - capital) {
            totalCapital += capital;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalCapital + " рублей" );
        }
        System.out.println("------------------------------");

        System.out.println("Задача 2");
        System.out.println("------------------------------");
        int a = 1;
        while (a <= 10) {

            System.out.print(a);
            a++;
        }
        System.out.println(" ");
        for (int b = 10; b >= 1; b--) {
            System.out.print(b);
        }
        System.out.println("\n" + "------------------------------");

        System.out.println("Задача 3");
        System.out.println("------------------------------");
        int population = 12000000;
        int growth = 17;
        int death = 8;
        int totalPopulation = 0;
        int years = 1;
        while (years <= 10) {
            totalPopulation = totalPopulation + ((population / 1000) * (growth - death));
            int populationTotal = totalPopulation + population;
            System.out.println(populationTotal);

            years++;
        }
        System.out.println("------------------------------");

        System.out.println("Задача 4");
        System.out.println("------------------------------");
        float percent2 = 0.07F;
        float capital2 = 15000;
        int totalCapital = 12000000;
        int startCapital = 0;
        int month1 = 0;
        while (startCapital < totalCapital) {
            startCapital += capital2 + capital2 * percent2;
            month1++;
            System.out.println("За " + month1 + " месяц Василий накопил " + startCapital);
        }

        System.out.println("Задача 5");
        System.out.println("------------------------------");
        startCapital = 0;
        month1 = 0;
        while (startCapital < totalCapital) {
            startCapital += capital2 + capital2 * percent2;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("За " + month1 + " месяц Василий накопил " + startCapital);
            }
        }
        System.out.println("------------------------------");


        System.out.println("Задача 6");
        System.out.println("------------------------------");
        float year = 0;
        float rate = 0.5F;
        float percents = 0.07F;
        float totalCapital2 = 0;
        while (year <= 9) {
            totalCapital2 += capital + capital * percents;
            System.out.println(totalCapital2 + " " + year);
            year += rate;
        }

        System.out.println("------------------------------");

        System.out.println("Задача 7");
        System.out.println("------------------------------");
        int day = console.nextInt();
        int month2 = 31;
        int week = 7;
        while (day <= month2 - week) {
            System.out.println("Сегодня пятница " + day + " число");
            day += week;
        }
        if (month2 - day < week) {
            System.out.println("Сегодня пятница " + day + " число");
        }

        System.out.println("Задача 8");
        System.out.println("------------------------------");
        int flightTime = 79;
        int ageFirst = 200;
        int cometAge = 0;
        System.out.println("Время пролета кометы над землей за первые 200 лет ");
        while (cometAge < ageFirst) {
            cometAge += flightTime;
            System.out.println(cometAge);
            if (cometAge > ageFirst && cometAge < 300 - cometAge) {
                cometAge += flightTime;
                System.out.println(cometAge);
            }
        }
        System.out.println("------------------------------");
    }

}













