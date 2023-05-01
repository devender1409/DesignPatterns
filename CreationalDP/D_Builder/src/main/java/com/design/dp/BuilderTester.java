package com.design.dp;

import com.design.dp.builder.Computer;

public class BuilderTester {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1TB","8GB","15.9Inches")
                .setSsd("512GB")
                .setHasBluetooth(true)
                .setHasDolbyAudio(true)
                .setUltraEdgeDisplay(false)
                .build();

        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder("23","45","14");

        System.out.println(computerBuilder+"111111111");

        Computer.ComputerBuilder computerBuilder1 = computerBuilder.setHasBluetooth(true);

        System.out.println("22222  " + computerBuilder1.build());

        System.out.println("Computer is Ready using builderr design pattern -- ----->>>>> "+ computer);
    }
}
