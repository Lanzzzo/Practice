package ru_mirea_lab4;

public class Monitor {
    private double diagonal;
    private String resolution;
    private String matrix;

    public Monitor(double diagonal, String resolution, String matrix) {
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.matrix = matrix;
    }

    public double getDiagonal() {return diagonal;}
    public String getResolution() {return resolution;}
    public String getMatrix() {return matrix;}

    public void setDiagonal(double diagonal) {this.diagonal = diagonal;}
    public void setResolution(String resolution) {this.resolution = resolution;}
    public void setMatrix(String matrix) {this.matrix = matrix;}

    public String toString() {
        return String.format("%.1f' %s %s", diagonal, resolution, matrix);
    }
}
