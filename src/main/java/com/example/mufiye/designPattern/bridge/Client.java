package com.example.mufiye.designPattern.bridge;

public class Client {
    public static void main(String[] args) {
        Brand vivo = new Vivo();
        Brand xiaomi = new Xiaomi();
        Phone vivoFoldPhone = new FoldPhone(vivo);
        Phone xiaomiFoldPhone = new FoldPhone(xiaomi);
        Phone vivoUpRightPhone = new UpRightPhone(vivo);
        Phone xiaomiUpRightPhone = new UpRightPhone(xiaomi);

        vivoFoldPhone.open();
        vivoFoldPhone.call();
        vivoFoldPhone.close();

        xiaomiFoldPhone.open();
        xiaomiFoldPhone.call();
        xiaomiFoldPhone.close();

        vivoUpRightPhone.open();
        vivoUpRightPhone.call();
        vivoUpRightPhone.close();

        xiaomiUpRightPhone.open();
        xiaomiUpRightPhone.call();
        xiaomiUpRightPhone.close();
    }
}
