import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner console = new Scanner(System.in);

                System.out.println("Задача 1");
                System.out.println("------------------------------");
                int total = 2459000;
                int contribution = 15000;
                int start = 0;
                int month = 0;
                while (start <= total) {
                    start = start + contribution;
                    month++;
                }
                System.out.println("Сумма накоплений равна: " + start + " за " + month + " месяцев");
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


                System.out.println("Задача 4");
                System.out.println("------------------------------");
                float percent = 0.07F;
                float startCapital = 15000F;
                float capital = 12000000;
                float totalCapital = 0F;
                int monthSavings = 0;
                while (startCapital <= 12000000) {
                    startCapital = startCapital + startCapital * percent;
                    int total1 = (int)startCapital;
                    System.out.println(total1);


                }
                System.out.println("------------------------------");

                System.out.println("Задача 5");
                System.out.println("------------------------------");

                while (startCapital <= 12000000) {
                    startCapital = startCapital + startCapital * percent;
                    int total1 = (int)startCapital;
                    System.out.println(total1);
                    System.out.println(monthSavings);
                    if (monthSavings % 6 == 0) {
                        System.out.println(monthSavings);
                    }

                }
                System.out.println("------------------------------");

                System.out.println("Задача 6");
                System.out.println("------------------------------");
                int  savingYear = 9;
                int startSavings = 15000;
                float savingPercent = 0.07F;
                float ratio = 0.5F;
                float totalSavings = 0;
                while (ratio < 9) {
                    totalSavings += startSavings + (startSavings * savingPercent);
                    ratio = (float) (ratio + 0.5);
                    System.out.println(ratio + " " + totalSavings);
                }
                System.out.println("------------------------------");

                System.out.println("Задача 7");
                System.out.println("------------------------------");
                int year = 79;
                int comet = 0;
                int age1 = 200;
                int age2 = 100;
                while (comet < 200) {
                    comet += year;
                    System.out.println(comet);
                }
                System.out.println("------------------------------");

                System.out.println("Задача 7");
                System.out.println("------------------------------");
                System.out.print("Введите дату первой пятницы от 1 до 7: ");
                for (int day = console.nextInt(); day <= 31; day++) {
                    System.out.println("Сегодня пятница, " + day + " число");
                    day = day + 6;
                }
                System.out.println("------------------------------" + "\n");

                System.out.println("Задача 8");
                System.out.println("------------------------------");

                int flightTime = 79;
                int ageFirst = 200;
                int ageSecond = 100;
                int cometAge = 0;
                System.out.println("Время пролета кометы над землей за первые 200 лет и за последние 100 равно соответсвенно ");
                while (cometAge < 200) {
                    cometAge += flightTime;
                    System.out.println(cometAge);
                }

                System.out.println("------------------------------");
            }
        }













