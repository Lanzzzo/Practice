package ru_mirea_lab4;

public class Processor {
    private String model;
    private double freq;
    private int cores;

    public Processor(String model, double freq, int cores) {
        this.model = model;
        this.freq = freq;
        this.cores = cores;
    }

    public String getModel() {return model;}
    public double getFreq() {return freq;}
    public int getCores() {return cores;}

    public void setModel(String model) {this.model = model;}
    public void setFreq(double freq) {this.freq = freq;}
    public void setCores(int cores) {this.cores = cores;}

    public String toString() {
        return String.format("%s (%.2f Ghz, %d cores)", model, freq, cores);
    }

}
