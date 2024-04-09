
public class Main {
    public static void main(String[] args) {

        /*Computer computer=new Computer("Intel","Samsung","Nvidia","Cooler Master");
        System.out.println(Computer.ComputerBilder Cpu;
        //System.out.println(Cpu.p());
         */

        Computer COMPUTER = new Computer.ComputerBilder()
                .Cpu("Intel")
                .Ram("Samsung")
                .GraphicsCard("Nvidia")
                .POWERSupplier("Cooler Master")
                .Monitor("Samsung")
                .build();
        COMPUTER.boot();
        COMPUTER.run();
        COMPUTER.shutdown();
        System.out.println("");

        Computer COMPUTER2 = new Computer.ComputerBilder()
                .Cpu("Amd")
                .Ram("Kingston")
                .GraphicsCard("Amd")
                .POWERSupplier("Thermaltake")
                .Mouse("Razer")
                .Keyboard("ISO")
                .build();
        COMPUTER2.boot();
        COMPUTER2.run();
        COMPUTER2.shutdown();

    }
}