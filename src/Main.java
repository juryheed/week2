import java.util.List;

public class Main {
    public static void main(String[] args) {

        //부품마다 각각 설정할수 있도록 바꾸기
        Computer COMPUTER = new Computer.ComputerBilder()
                .Cpu("Intel",10000,"주희주식",123,"게임용")
                .Ram("Samsung",10000,"주희주식",100)
                .GraphicsCard("Nvidia",1000,"주희주식","게임용")
                .PowerSupplier("Cooler Master",1000,"주희주식",1)
                .Monitor("Samsung",100,"주희 주식",100)
                .build();
        COMPUTER.boot();

        COMPUTER.run();
        COMPUTER.shutdown();
        System.out.println("");


        Computer COMPUTER2 = new Computer.ComputerBilder()
                .Cpu("Amd",10000,"주희 전자",123,"사무용")
                .Ram("Kingston",1000000,"주희 전자",10000)
                .GraphicsCard("Amd",1000,"주희 전자","사무용")
                .PowerSupplier("Thermaltake",1000,"주희 전자",0)
                .Keyboard("Logitech",456,"주희 전자","ISO")
                .build();
        COMPUTER2.boot();

        COMPUTER2.run();
        COMPUTER2.shutdown();
        System.out.println("");
    }
}