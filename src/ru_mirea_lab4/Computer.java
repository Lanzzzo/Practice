package ru_mirea_lab4;

enum Brand {
    HP, DELL, LENOVO, MSI, ASUS, ACER
}

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {return brand;}
    public Processor getProcessor() {return processor;}
    public Memory getMemory() {return memory;}
    public Monitor getMonitor() {return monitor;}

    public void setBrand(Brand brand) {this.brand = brand;}
    public void setProcessor(Processor processor) {this.processor = processor;}
    public void setMemory(Memory memory) {this.memory = memory;}
    public void setMonitor(Monitor monitor) {this.monitor = monitor;}

    public String toString() {
        return "Brand: " + brand.toString() +
                "\nProcessor: " + processor.toString() +
                "\nMemory: " + memory.toString() +
                "\nMonitor: " + monitor.toString();
    }
}
