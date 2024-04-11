
public class Computer {

    protected Cpu cpu;
    protected Ram ram ;
    protected GraphicsCard graphicsCard;
    protected PowerSupplier powerSupplier;
    protected Cooler cooler;
    protected Mouse mouse;
    protected Keyboard keyboard;
    protected Monitor monitor;


    private Computer(Cpu cpu,Ram ram ,GraphicsCard graphicsCard, PowerSupplier powerSupplier){
        this.cpu=cpu;
        this.ram =ram ;
        this.graphicsCard=graphicsCard;
        this.powerSupplier=powerSupplier;
    }
    public static class ComputerBilder{
        private Cpu cpu;    //밖에서 건들면 안됨
        private Ram ram ;
        private GraphicsCard graphicsCard;
        private PowerSupplier powerSupplier;
        private Cooler cooler;
        private Mouse mouse;
        private Keyboard keyboard;
        private Monitor monitor;

        public ComputerBilder Cpu(String name,int price,String company,int speed,String used){  //사용자가 설정해야하니까 public
            this.cpu=new Cpu(name,price,company,speed,used);
            return this;
        }
        public ComputerBilder Ram(String name,int price,String company, int volume){
            this.ram =new Ram(name,price,company, volume);
            return this;
        }
        public ComputerBilder GraphicsCard(String name,int price,String company, String used){
            this.graphicsCard=new GraphicsCard(name,price,company,used);
            return this;
        }
        public ComputerBilder PowerSupplier(String name,int price,String company, int print){
            this.powerSupplier=new PowerSupplier(name,price,company,print);
            return this;
        }
        public ComputerBilder Cooler(String name,int price,String company, String method){
            this.cooler=new Cooler(name,price,company,method);
            return this;
        }
        public ComputerBilder Mouse(String name,int price,String company){
            this.mouse=new Mouse(name,price,company);
            return this;
        }
        public ComputerBilder Keyboard(String name,int price,String company, String keyarr){
            this.keyboard=new Keyboard(name,price,company,keyarr);
            return this;
        }
        public ComputerBilder Monitor(String name,int price,String company, int size){
            this.monitor=new Monitor(name,price,company,size);
            return this;
        }
        public Computer build(){    //지금까지 설정한 ComputerBuiler의 필드를 통해 객체를 생성해 반환한다.
            Computer computer=new Computer(cpu,ram ,graphicsCard,powerSupplier);
            computer.cooler=this.cooler;
            computer.mouse=mouse;
            computer.keyboard=this.keyboard;
            computer.monitor=this.monitor;
            return computer;
        }
    }
    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
    }

    public void shutdown(){
        System.out.println("컴퓨터를 종료합니다.");
    }

    public void run() {
        System.out.println("컴퓨터 기능을 전부 실행합니다");
        cpu.runable();
        ram.runable();
        graphicsCard.runable();
        powerSupplier.runable();
        if (this.cooler != null ) {
            cooler.runable();
        }
        if (this.mouse != null ) {
            mouse.runable();
        }
        if (keyboard != null) {
            keyboard.runable();
        }
        if (this.monitor != null ) {
            monitor.runable();
        }
    }
}
