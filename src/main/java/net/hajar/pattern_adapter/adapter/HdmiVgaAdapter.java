package net.hajar.pattern_adapter.adapter;

import net.hajar.pattern_adapter.computer.HDMI;
import net.hajar.pattern_adapter.computer.TV;
import net.hajar.pattern_adapter.computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private HDMI  hdmi;

    @Override
    public void print(String message) {
        System.out.println("*************Adapter*********");
        byte[]data = message.getBytes();
        hdmi.view(data);
        System.out.println("*************Adapter*********");
    }

    public void setHDMI(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
