package ru_mirea_lab4;

public class MainTest {
    public static void main(String[] args) {
        // Создаем компоненты компьютера
        Brand brand = Brand.ASUS;
        Processor cpu = new Processor("Intel Core i7-11700", 2.5, 8);
        Memory ram = new Memory("DDR4", 16, 3200);
        Monitor display = new Monitor(27.0, "3840x2160", "IPS");


        // Создаем компьютер
        Computer myComputer = new Computer(brand, cpu, ram, display);

        System.out.println(myComputer.toString());
    }
}

