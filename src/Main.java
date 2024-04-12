import java.util.List;

public class Main {
    public static void main(String[] args) {

        //부품마다 각각 설정할수 있도록 바꾸기
        Computer COMPUTER = new Computer.ComputerBilder()
                .cpu("Intel",10000,"주희주식",123,"게임용")
                .ram("Samsung",10000,"주희주식",100)
                .graphicsCard("Nvidia",1000,"주희주식","게임용")
                .powerSupplier("Cooler Master",1000,"주희주식",1)
                .monitor("Samsung",100,"주희 주식",100)
                .build();
        COMPUTER.boot();
        System.out.println("");
        COMPUTER.run();
        System.out.println("");
        COMPUTER.shutdown();
        System.out.println("");


        Computer COMPUTER2 = new Computer.ComputerBilder()
                .cpu("Amd",10000,"주희 전자",123,"사무용")
                .ram("Kingston",1000000,"주희 전자",10000)
                .graphicsCard("Amd",1000,"주희 전자","사무용")
                .powerSupplier("Thermaltake",1000,"주희 전자",0)
                .keyboard("Logitech",456,"주희 전자","ISO")
                .build();
        COMPUTER2.boot();

        COMPUTER2.run();
        COMPUTER2.shutdown();
        System.out.println("");
    }
}