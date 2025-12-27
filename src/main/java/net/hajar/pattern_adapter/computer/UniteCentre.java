package net.hajar.pattern_adapter.computer;

public class UniteCentre {
    private Vga vga;

    public void print(String message) {
        System.out.println("************  UniteCentre ****************");
        vga.print(message);
        System.out.println("****************************");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
