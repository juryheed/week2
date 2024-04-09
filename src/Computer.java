
public class Computer {

    public String Cpu;
    public String Ram;
    public String GraphicsCard;
    public String POWERSupplier;
    public String Cooler;
    public String Mouse;
    public String Keyboard;
    public String Monitor;


    public Computer(String Cpu,String Ram,String GraphicsCard, String POWERSupplier){
        this.Cpu=Cpu;
        this.Ram=Ram;
        this.GraphicsCard=GraphicsCard;
        this.POWERSupplier=POWERSupplier;
    }
    public static  class ComputerBilder{
        public String Cpu;
        public String Ram;
        public String GraphicsCard;
        public String POWERSupplier;
        public String Cooler;
        public String Mouse;
        public String Keyboard;
        public String Monitor;

        public ComputerBilder Cpu(String Cpu){
            this.Cpu=Cpu;
            return this;
        }
        public ComputerBilder Ram(String Ram){
            this.Ram=Ram;
            return this;
        }
        public ComputerBilder GraphicsCard(String GraphicsCard){
            this.GraphicsCard=GraphicsCard;
            return this;
        }
        public ComputerBilder POWERSupplier(String POWERSupplier){
            this.POWERSupplier=POWERSupplier;
            return this;
        }
        public ComputerBilder Cooler(String Cooler){
            this.Cooler=Cooler;
            return this;
        }
        public ComputerBilder Mouse(String Mouse){
            this.Mouse=Mouse;
            return this;
        }
        public ComputerBilder Keyboard(String Keyboard){
            this.Keyboard=Keyboard;
            return this;
        }
        public ComputerBilder Monitor(String Monitor){
            this.Monitor=Monitor;
            return this;
        }
        public Computer build(){    //지금까지 설정한 ComputerBuiler의 필드를 통해 객체를 생성해 반환한다.
            Computer computer=new Computer(Cpu,Ram,GraphicsCard,POWERSupplier);
            computer.Cooler=this.Cooler;
            computer.Mouse=Mouse;
            computer.Keyboard=this.Keyboard;
            computer.Monitor=this.Monitor;
            return computer;
        }
    }
    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
    }

    public void shutdown(){
        System.out.println("컴퓨터를 종료합니다.");
    }

    public void run(){
        System.out.println("컴퓨터 기능을 전부 실행합니다");
        runCpu();
        runRam();
        runGraphicsCard();
        runPowerSupplier();
        if (this.Cooler != null ) {
            runCooler();
        }
        if (this.Mouse != null ) {
            runMouse();
        }
        if (Keyboard != null) {
            runKeyboard();
        }
        if (this.Monitor != null ) {
            runMonitor();
        }
    }

    public void runCpu(){
        new Cpu(this.Cpu,0 ,"",0 ,"").run__();
    }
    public void runRam(){
        new Ram(this.Ram,0,"",0).run__();
    }

    public void runGraphicsCard(){
        new GraphicsCard(this.GraphicsCard,0,"","").run__();
    }
    public void runPowerSupplier(){
        new POWERSupplier(this.GraphicsCard,0,"",0).run__();
    }

    public void runCooler(){
        new Cooler(this.Cooler,0,"","").run__();
    }
    public void runMouse(){
        new Mouse(this.Mouse,0,"").run__();
    }
    public void runKeyboard(){
        new Keyboard(this.Keyboard,0,"","").run__();
    }
    public void runMonitor(){
        new Monitor(this.Monitor,0,"",0).run__();
    }

}
