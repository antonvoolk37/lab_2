package bsu.rfikt.java.group6.lab2.Volkov.varA;
import java.lang.Math;

public class Formula {
    private double sum = 0;

    public double calculate1(double x, double y, double z){
        return(Math.pow((Math.cos(Math.PI * Math.pow(x, 3)) + Math.log(Math.pow(1 + y, 2))), 0.25) * (Math.exp(Math.pow(z,2)) + Math.sqrt(1/x) + Math.cos(Math.exp(y))));
    }

    public double calculate2(double x, double y, double z){
        return ( Math.pow(x, x) / (Math.sqrt(Math.pow(y, 3) + 1) + Math.log(z)));
    }

    public void addSum(double M){
        sum += M;
    }

    public void clearSum(){
        sum = 0;
    }

    public Double getSum(){
        return sum;
    }
}
