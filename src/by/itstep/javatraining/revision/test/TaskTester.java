package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {
    public static final String RIGHT = "completed successfully. Well DONE!!!";
    public static final String WRONG = "was NOT running successfully. Something was WRONG!";

    public static String testingTask01() {

        boolean result = Task01.task01(1, 1, 1, 2, 2, 2) == 3661
                && Task01.task01(0, 0, 0, 1, 1, 1) == 3661
                && Task01.task01(2, 2, 2, 3, 3, 3) == 3661
                && Task01.task01(3, 3, 3, 4, 4, 4) == 3661
                && Task01.task01(1, 2, 30, 1, 3, 20) == 50
                && Task01.task01(0, 0, 0, 0, 0, 1) == 1
                && Task01.task01(0, 0, 0, 0, 1, 0) == 60
                && Task01.task01(0, 0, 0, 1, 0, 0) == 3600

                && Task01.task01(1, 1, 1, 1, 1, 1) == 0
                && Task01.task01(2, 2, 2, 1, 1, 1) == 3661
                && Task01.task01(4, 4, 4, 3, 3, 3) == 3661
                && Task01.task01(1, 3, 20, 1, 2, 30) == 50
                && Task01.task01(0, 0, 1, 0, 0, 0) == 1
                && Task01.task01(0, 1, 0, 0, 0, 0) == 60
                && Task01.task01(1, 0, 0, 0, 0, 0) == 3600

                && Task01.task01(24, 1, 1, 1, 1, 1) == -1
                && Task01.task01(25, 1, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 24, 1, 1) == -1
                && Task01.task01(1, 1, 1, 25, 1, 1) == -1
                && Task01.task01(1, 60, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 60, 1, 1, 1) == -1
                && Task01.task01(1, 61, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 61, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 1, 60, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, 60) == -1
                && Task01.task01(1, 1, 1, 1, 61, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, 61) == -1


                && Task01.task01(-1, 1, 1, 1, 1, 1) == -1
                && Task01.task01(1, -1, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, -1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, -1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 1, -1, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, -1) == -1;

        return "Task 01 [Time Period] " + (result ? RIGHT : WRONG);
    }


    public static String testingTask02() {

        boolean result = Task02.task02(0).trim().equalsIgnoreCase("0:00:00")
                && Task02.task02(3602).trim().equalsIgnoreCase("1:00:02")
                && Task02.task02(86399).trim().equalsIgnoreCase("23:59:59")
                && Task02.task02(129700).trim().equalsIgnoreCase("12:01:40")
                && Task02.task02(1).trim().equalsIgnoreCase("0:00:01")
                && Task02.task02(3600).trim().equalsIgnoreCase("1:00:00")
                && Task02.task02(60).trim().equalsIgnoreCase("0:01:00")
                && Task02.task02(3661).trim().equalsIgnoreCase("1:01:01")

                && Task02.task02(-1).trim().equalsIgnoreCase("error");

        return "Task 02 [Digital Watch] " + (result ? RIGHT : WRONG);
    }

    public static String testingTask03() {
        boolean result = Task03.task03(23, 52, 8, 43) == 8
                && Task03.task03(14, 7, 6, 11) == 1
                && Task03.task03(23, 52, 0, 43) == 0
                && Task03.task03(7, 14, 6, 11) == 1
                && Task03.task03(14, 8, 4, 8) == 4
                && Task03.task03(8, 14, 4, 8) == 4
                && Task03.task03(8, 14, 4, 12) == 2
                && Task03.task03(52, 23, 20, 8) == 3
                && Task03.task03(8, 25, 8, 23) == 0
                && Task03.task03(53, 41, 20, 25) == 20
                && Task03.task03(46, 41, 20, 25) == 20
                && Task03.task03(10, 6, 1, 2) == 1
                && Task03.task03(24, 10, 8, 24) == 0;

        return "Task 03 [Student and Swimming Pool] " + (result ? RIGHT : WRONG);
    }

    public static String testingTask04() {
        boolean result = Task04.task04(7, 6, 1).trim().equals("1 6 7")
                && Task04.task04(6, 7, 2).trim().equals("2 6 7")
                && Task04.task04(7, 7, 4).trim().equals("4 7 7")
                && Task04.task04(7, 4, 7).trim().equals("4 7 7")
                && Task04.task04(4, 7, 7).trim().equals("4 7 7")
                && Task04.task04(1, 2, 3).trim().equals("1 2 3")
                && Task04.task04(1, 3, 2).trim().equals("1 2 3")
                && Task04.task04(2, 1, 3).trim().equals("1 2 3")
                && Task04.task04(2, 3, 1).trim().equals("1 2 3")
                && Task04.task04(3, 1, 2).trim().equals("1 2 3")
                && Task04.task04(3, 2, 1).trim().equals("1 2 3")
                && Task04.task04(1, 1, 1).trim().equals("1 1 1");

        return "Task 04 [Ordering Numbers] " + (result ? RIGHT : WRONG);
    }

    public static String testingTask05() {
        boolean result = Task05.task05(4, 6, 5, 6, 5, 6)

                && !Task05.task05(3, 5, 5, 2, 3, 4)
                && !Task05.task05(0, 3, 5, 2, 3, 4)
                && !Task05.task05(3, -5, 5, 2, 3, 4)

                && !Task05.task05(3, 0, 5, 2, 3, 4)
                && !Task05.task05(3, 3, 0, 2, 3, 4)
                && !Task05.task05(3, 3, 5, 0, 3, 4)
                && !Task05.task05(3, 3, 5, 2, 0, 4)
                && !Task05.task05(3, 3, 5, 2, 3, 0)
                && !Task05.task05(-3, 5, 5, 2, 3, 4)
                && !Task05.task05(3, 5, -5, 2, 3, 4)
                && !Task05.task05(3, 5, 5, -2, 3, 4)
                && !Task05.task05(3, 5, 5, 2, -3, 4)
                && !Task05.task05(3, 5, 5, 2, 3, -4)

                && !Task05.task05(5, 5, 3, 2, 3, 4)
                && !Task05.task05(3, 5, 5, 2, 4, 3)
                && !Task05.task05(3, 5, 5, 3, 2, 4)
                && !Task05.task05(3, 5, 5, 3, 4, 2)
                && !Task05.task05(3, 5, 5, 4, 2, 3)
                && !Task05.task05(3, 5, 5, 4, 3, 2)
                && !Task05.task05(5, 5, 5, 4, 4, 4)
                && !Task05.task05(5, 5, 4, 4, 4, 4)
                && !Task05.task05(5, 4, 5, 4, 4, 4)
                && !Task05.task05(4, 5, 5, 4, 4, 4)
                && !Task05.task05(5, 4, 4, 4, 4, 4)
                && !Task05.task05(4, 5, 4, 4, 4, 4)
                && !Task05.task05(4, 4, 5, 4, 4, 4)
                && !Task05.task05(2, 1, 1, 1, 1, 1)
                && !Task05.task05(1, 2, 1, 1, 1, 1)
                && !Task05.task05(1, 1, 2, 1, 1, 1)

                && Task05.task05(4, 5, 6, 6, 5, 6)
                && Task05.task05(6, 4, 5, 6, 5, 6)
                && Task05.task05(6, 5, 4, 6, 5, 6)
                && Task05.task05(5, 6, 4, 6, 5, 6)
                && Task05.task05(5, 4, 6, 6, 5, 6)
                && Task05.task05(4, 6, 5, 6, 6, 5)
                && Task05.task05(4, 6, 5, 5, 6, 6)
                && Task05.task05(4, 4, 4, 5, 5, 5)
                && Task05.task05(1, 1, 1, 1, 1, 1)
                && Task05.task05(1, 1, 1, 2, 1, 1)
                && Task05.task05(1, 1, 1, 1, 2, 1)
                && Task05.task05(1, 1, 1, 1, 1, 2)
                && Task05.task05(4, 4, 4, 4, 4, 4)
                && Task05.task05(4, 4, 4, 4, 5, 5)
                && Task05.task05(4, 4, 4, 5, 4, 5)
                && Task05.task05(4, 4, 4, 5, 5, 4)
                && Task05.task05(4, 4, 4, 4, 4, 5)
                && Task05.task05(4, 4, 4, 4, 5, 4)
                && Task05.task05(4, 4, 4, 5, 4, 4);

        return "Task 05 [Rectangular World 3] " + (result ? RIGHT : WRONG);
    }

    public static String testingTask06() {
        boolean result = Task06.task06(1, 2, 3, 3, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 2, 3, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(3, 2, 1, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(3, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(0, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, -11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")

                && Task06.task06(1, 1, 1, 1, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 1, 1, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(1, 2, 1, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(1, 1, 2, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 1, 1, 1, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 1, 1, 1, 1, 2).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 2, 1, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(2, 1, 2, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(1, 2, 2, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(1, 2, 2, 1, 2, 2).trim().equalsIgnoreCase("Boxes are equal.")
                && Task06.task06(1, 2, 2, 2, 1, 2).trim().equalsIgnoreCase("Boxes are equal.")

                && Task06.task06(2, 3, 2, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(3, 2, 2, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 3, 3, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 3, 2, 3, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 3, 2, 1, 3).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 3, 1, 2, 3).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 3, 1, 3, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 2, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 1, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 1, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 2, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 2, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 2, 1, 2, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 2, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 1, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(1, 2, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(1, 1, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(1, 2, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task06.task06(2, 1, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")

                && Task06.task06(3, 1, 2, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(2, 3, 1, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(2, 1, 3, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 2, 3, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 3, 2, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(3, 2, 1, 2, 3, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(3, 2, 1, 3, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(2, 1, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 2, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 2, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(2, 1, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(2, 2, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 1, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 2, 1, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 2, 2, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 1, 1, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 1, 2, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task06.task06(1, 1, 1, 2, 1, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")

                && Task06.task06(3, 5, 11, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(11, 5, 3, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(11, 3, 5, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(5, 11, 3, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(5, 3, 11, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(3, 11, 5, 4, 9, 7).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(3, 11, 5, 7, 9, 4).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(3, 11, 5, 7, 4, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(3, 11, 5, 9, 7, 4).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task06.task06(3, 11, 5, 9, 4, 7).trim().equalsIgnoreCase("Boxes are incomparable.")

                && Task06.task06(3, 0, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 0, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, 0, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, 4, 0, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, 4, 7, 0).trim().equalsIgnoreCase("Error.")
                && Task06.task06(-3, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, -5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, -4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, 4, -7, 9).trim().equalsIgnoreCase("Error.")
                && Task06.task06(3, 11, 5, 4, 7, -9).trim().equalsIgnoreCase("Error.");

        return "Task 06 [Boxes] " + (result ? RIGHT : WRONG);
    }

    public static String testingTask07() {

        boolean result = Task07.task07(-1, 1) == 55
                && Task07.task07(40, 2) == 24
                && Task07.task07(0, 1) == 0
                && Task07.task07(10, 0) == 0
                && Task07.task07(1, 1) == 1
                && Task07.task07(2, 1) == 2
                && Task07.task07(2, 2) == 4
                && Task07.task07(-2, 1) == 54
                && Task07.task07(-2, 2) == 52
                && Task07.task07(10, 1000) == 32
                && Task07.task07(-10, 1000) == 24
                && Task07.task07(-1000, 10) == 24
                && Task07.task07(1000, 10) == 32

                && Task07.task07(10, -1) == -1
                && Task07.task07(-10, -1) == -1;

        return "Task 07 [Minsk Ring Road] " + (result ? RIGHT : WRONG);
    }
}