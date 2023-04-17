package by.itstep.javatraining.revision.task;

/*	Task 03. Student and Swimming Pool [студент и бассейн]
 *
 *	Студент плавал в бассейне размером N×M метров и устал. В этот момент он обнаружил,
 *	что находится на расстоянии X метров от одного из длинных бортиков (не обязательно от ближайшего)
 *	и Y метров от одного из коротких бортиков. Какое минимальное расстояние должен проплыть студент,
 *  чтобы выбраться из бассейна на бортик и не утонуть?
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить -1.
 *
 *	Формат входных данных [input]
 *	На вход даётся четыре целых числа в диапазоне типа int: N и M - соответствующие размеры бассейна,
 *  X и Y - расстояние до бортиков, где X и(или) Y могут быть также нулями.
 *
 *	Формат выходных данных [output]
 *	Возвратите число метров, которое нужно проплыть студенту до бортика, чтобы не утонуть,
 *  или -1, если данные введены некорректно.
 *
 *	[ input 1]: 23 52 8 43
 *	[output 1]: 8
 *
 *	[ input 2]: 14 7 6 11
 *	[output 2]: 1
 *
 *	[ input 3]: 23 52 0 43
 *	[output 3]: 0
 *
 *	[ input 4]: 23 52 -1 43
 *	[output 4]: -1
 *
 *	[ input 5]: 0 52 6 43
 *	[output 5]: -1
 */

public class Task03 {
    public static int task03(int n, int m, int x, int y) {
/*
        if (n<0 || m <0 || x < 0 || y < 0){
            return -1;
        }

        int bortVerh = Math.min(y, m - y);
        int bortNiz = Math.min(m - y, y);

        int leftBort = Math.min(x, n - x);
        int rightBort = Math.min(n - x, x);

        System.out.println("ok");

       return Math.min(Math.min(bortVerh,bortNiz), Math.min(leftBort,rightBort));*/

        // Проверка на корректность входных данных
        if (n <= 0 || m <= 0 || x < 0 || y < 0 || x > n || y > m) {
            return -1;
        }


        return 0;
    }


}


   /* public static void main(String[] args) {
        int n = 14;
        int m = 7;
        int x = 6;
        int y = 11;

        int bortVerh = Math.min(y, m - y);
        int bortNiz = Math.min(m - y, y);

        int leftBort = Math.min(x, n - x);
        int rightBort = Math.min(n - x, x);

        int minRost = Math.min(Math.min(bortVerh,bortNiz), Math.min(leftBort,rightBort));

        System.out.println(minRost);
    }*/


