package ru_mirea_lab3;

public class task2 {
    public static void main(String[] args) {
        //Создаем объекты класса Double, используя методы valueOf()
        Double num1 = Double.valueOf(3.14);
        System.out.println(num1);

        Double num2 = Double.valueOf("333");
        System.out.println(num2);

        int number = 39;
        Double num3 = Double.valueOf(number);
        System.out.println(num3);

        //Преобразуем значение типа String к типу double. Используем
        //метод Double.parseDouble().

        String num4 = "1234";
        Double new_str = Double.parseDouble(num4);
        System.out.println(new_str);

        //Преобразуем объект класса Double ко всем примитивным типам.
        Double num5 = Double.valueOf(89.7);

        int intValue = num5.intValue();
        byte byteValue = num5.byteValue();
        short shortValue = num5.shortValue();
        long longValue = num5.longValue();
        float floatValue = num5.floatValue();
        double doubleValue = num5.doubleValue();
        char charValue = (char) num5.intValue();
        boolean booleanValue = num5 != 0.0;

        System.out.println("\nИсходное Double значение: " + num5);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue + " (код Unicode: " + (int) charValue + ")");
        System.out.println("boolean: " + booleanValue);

        String d = Double.toString(3.14);
        System.out.println("\n"+d);
    }
}
