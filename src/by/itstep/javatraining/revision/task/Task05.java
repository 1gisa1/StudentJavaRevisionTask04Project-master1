package by.itstep.javatraining.revision.task;

/*	Task 05. Rectangular World 3 [прямоугольный мир]
 *
 *	В прямоугольном мире есть свинья, которая раскормлена до размеров параллелепипеда с габаритами X, Y, Z.
 *	Определите, можно ли похитить данную свинью, разместив её в прямоугольном багажнике c размерами A, B, C фургона.
 *
 *	Предварительные условия:
 *	1)	размеры габаритов свиньи и багажника фургона - числа натуральные и могут вводится в любом порядке;
 *	2)	стенки багажника фургона имеют нулевую толщину;
 *	3)	свинья не может "выглядывать" из фургона, она должна помещаться в нём полностью - это же похищение!
 *	4)	чтобы попытаться вместить свинью в багажник, её можно поворачивать на 90 градусов во все стороны;
 *	5)	объёмы свиньи и багажника фургона не могут служить надёжным критерием для их сравнения!
 *  6) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить false.
 *
 *	Формат входных данных [input]
 *	На вход даётся шесть целых чисел X, Y, Z (габариты свиньи)
 *  и A, B, C (габариты багажника фургона) в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите результат в виде булевского типа данных.
 *
 *	[ input 1]: 4 6 5 6 5 6
 *	[output 1]: true
 *
 *	[ input 2]: 3 5 5 2 3 4
 *	[output 2]: false
 *
 *	[ input 3]: 0 5 5 2 3 4
 *	[output 3]: false
 *
 *	[ input 4]: 3 -5 5 2 3 4
 *	[output 4]: false
 */

import java.util.*;
import java.util.stream.Collectors;

public class Task05 {
    public static boolean task05(int x, int y, int z, int a, int b, int c) {

        boolean vlezla = false;
        int pig[] = {x, y, z};
        int truck[] = {a, b, c};


        Arrays.sort(pig);
        Arrays.sort(truck);


        if (x <= 0 || y <= 0 || z <= 0 || a <= 0 || b <= 0 || c <= 0) {
            vlezla = false;
        } else if (pig[0] <= truck[0] && pig[1] <= truck[1] && pig[2] <= truck[2]) {
            vlezla = true;
        } else {
            vlezla = false;
        }




        return vlezla;
    }


    public static void main(String[] args) {

        int x = 0;
        int y = 5;
        int z = 5;

        int a = 2;
        int b = 3;
        int c = 4;


        int pig[] = {x, y, z};
        int truck[] = {a, b, c};


        Arrays.sort(pig);
        Arrays.sort(truck);

/*        for (int i = 0; i < pig.length; i++) {
            System.out.print(pig[i]);
        }

        System.out.println();

        for (int i = 0; i < truck.length; i++) {
            System.out.print(truck[i]);
        }*/

        System.out.println();

        boolean vlezla = false;

        if (pig[0] <= truck[0] && pig[1] <= truck[1] && pig[2] <= truck[2]) {
            vlezla = true;
        } else {
            vlezla = false;
        }
        System.out.println(vlezla);
    }
}
