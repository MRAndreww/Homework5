public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 45;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int degree = 3;
        if (degree >= 5) {
            System.out.println("На улице " + degree + " градусов, можно идти без шапки");
        }


        if (degree <= 5) {
            System.out.println("На улице " + degree + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 40;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно продолжить движение");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >=7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age +", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age +", то он может кататься только в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age +", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 104;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячии и стоячие места");
        }
                if (passengers >= 60 && passengers < 102) {
                  System.out.println("В вагоне есть только стоячие места");}
               else {
                  System.out.println("В вагоне нет мет");
                }
                                }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 75;
        int two = 75;
        int three = 58;
        if (one>=two && one>=three) {
            System.out.println("Число " + one + " большее из трёх чисел!"); }
        else if (two>=one && two>=three) {
            System.out.println("Число " + two + " большее из трёх чисел!"); }
        else {
            System.out.println("Число " + three + " большее из трёх чисел!"); }
        }

        }



