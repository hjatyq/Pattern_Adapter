package net.hajar.pattern_adapter.computer;

public class VideoProjecteur implements Vga{
    @Override
    public void print(String message) {
        System.out.println("........Video...........");
        System.out.println(message);
        System.out.println("......................");
    }
}
