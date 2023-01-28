package com.example.mufiye.designPattern.adapter.atguigu.objectAdapter;

public class VoltageAdapter implements Voltage5V{
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        super();
        voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
