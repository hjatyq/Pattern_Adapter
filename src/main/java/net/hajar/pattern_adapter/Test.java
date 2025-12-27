package net.hajar.pattern_adapter;

import net.hajar.pattern_adapter.adapter.HdmiVgaAdapter;
import net.hajar.pattern_adapter.computer.Ecran;
import net.hajar.pattern_adapter.computer.TV;
import net.hajar.pattern_adapter.computer.UniteCentre;
import net.hajar.pattern_adapter.computer.VideoProjecteur;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour Hajar");

        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour Madame Hajar");
        uniteCentre.setVga(new HdmiVgaAdapter());
        uniteCentre.print("Bonjour Madame Hajar");

        HdmiVgaAdapter  hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHDMI(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Hajar ");
    }
}
