package com.example.mufiye.designPattern.proxy;

public class PrinterProxy implements Printable{
    private String name;
    private Printer real;
    public PrinterProxy(){

    }
    public PrinterProxy(String name){
        this.name = name;
    }
    public synchronized void setPrinterName(String name){
        if(real != null){
            real.setPrinterName(name);
        }
        this.name = name;
    }
    public String getPrinterName(){
        return name;
    }
    public void print(String string){
        realize();
        real.print(string);
    }
    public synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}
