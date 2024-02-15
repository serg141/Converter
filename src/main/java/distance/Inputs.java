package distance;

import java.util.Scanner;

public class Inputs {
    private int fromUnit = 0;
    private int toUnit = 0;
    private int valueNumber = 0;

    public void unit() {
        while (fromUnit < 1 || fromUnit > 8) {
            System.out.println("Выберите единицу измерения: 1 - мм, 2 - см, 3 - м, 4 - км, 5 - фут, 6 - дюйм, " +
                    "7 - ярд, 8 - миля");
            Scanner sc = new Scanner(System.in);

            if (sc.hasNextInt()) fromUnit = sc.nextInt();
        }

        while (toUnit < 1 || toUnit > 8) {
            System.out.println("Выберите единицу измерения: 1 - мм, 2 - см, 3 - м, 4 - км, 5 - фут, 6 - дюйм, " +
                    "7 - ярд, 8 - миля");
            Scanner sc = new Scanner(System.in);

            if (sc.hasNextInt()) toUnit = sc.nextInt();

            if (toUnit == fromUnit) {
                toUnit = 0;
                System.out.println("Выберите другую единицу измерения");
            }
        }
    }

    public void value() {
        System.out.print("Введите расстояние: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) valueNumber = sc.nextInt();
    }

    public int getFromUnit() {
        return fromUnit;
    }

    public int getValueNumber() {
        return valueNumber;
    }

    public int getToUnit() {
        return toUnit;
    }
}
