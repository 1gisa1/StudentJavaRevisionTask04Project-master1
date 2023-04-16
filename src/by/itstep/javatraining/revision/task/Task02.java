package by.itstep.javatraining.revision.task;

/*	Task 02. Digital Watch [электронные часы]
 *
 *	Электронные часы показывают время в формате h:mm:ss (от 0:00:00 до 23:59:59),
 *	т.е. сначала записывается количество часов, потом обязательно двузначное количество минут,
 *	затем обязательно двузначное количество секунд.
 *	Количество минут и секунд при необходимости дополняются до двузначного числа нулями.
 *	С начала суток прошло N секунд. Выведите, что покажут электронные часы.
 *
 *  Примечание
 *  1) Необходимо учесть, что с начало суток может пройти несколько дней.
 *  2) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить "error".
 *  3) Можно попробовать решить данную задачу без использования условных конструкций.
 *
 *	Формат входных данных [input]
 *	На вход даётся целочисленное число в диапазоне типа int.
 *
 *	Формат выходных данных
 *	Возвратите ответ на задачу в виде строки.
 *
 *	[ input 1]: 0
 *	[output 1]: 0:00:00
 *
 *	[ input 2]: 3602
 *	[output 2]: 1:00:02
 *
 *	[ input 3]: 86399
 *	[output 3]: 23:59:59
 *
 *	[ input 4]: 129700
 *	[output 4]: 12:01:40
 *
 *	[ input 5]: -1
 *	[output 5]: error
 */

public class Task02 {
    public static String task02(int number) {

        if (number < 0) {
            return "error";
        }

        String min_str;
        String sec_str;


        int hour = number / 3600;
        number = number - (hour * 3600);
        int min = number / 60;
        number = number - (min * 60);


        min_str = (min < 10) ? "0" + min : String.valueOf(min);
        sec_str = (number < 10) ? "0" + number : String.valueOf(number);


        if (hour > 24) {
            hour = hour - 24;
        }

        String time = hour + ":" + min_str + ":" + sec_str;
        ;


        return time;


    }


   /* public static void main(String[] args) {
        int sec = 3661;
        String min_str;
        String sec_str;

        int hour = sec / 3600;
        sec = sec - (hour * 3600);
        int min = sec / 60;
        if (min < 9) {
            min_str = "0" + min;
        }else {
             min_str = String.valueOf(min);
        }
        sec = sec - (min * 60);
        if (sec < 9) {
             sec_str = "0" + sec;
        }else {
             sec_str = String.valueOf(sec);
        }



        if (hour > 24) {
            hour = hour - 24;
        }

        String time =  hour + ":" + min_str + ":" + sec_str;;



        System.out.println(time);

    }*/
}
