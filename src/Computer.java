public class Computer {

    protected Cpu cpu;
    protected Ram ram ;
    protected GraphicsCard graphicsCard;
    protected PowerSupplier powerSupplier;
    protected Cooler cooler;
    protected Mouse mouse;
    protected Keyboard keyboard;
    protected Monitor monitor;
    //static ArrayList<String> part = new ArrayList<String>();


public Computer(Cpu cpu, Ram ram , GraphicsCard graphicsCard, PowerSupplier powerSupplier){
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

        public ComputerBilder cpu(String name,int price,String company,int speed,String used){  //사용자가 설정해야하니까 public
            this.cpu= new Cpu(name,price,company,speed,used);
            return this;
        }
        public ComputerBilder ram(String name,int price,String company, int volume){
            this.ram =new Ram(name,price,company,volume);
            return this;
        }
        public ComputerBilder graphicsCard(String name,int price,String company, String used){
            this.graphicsCard=new GraphicsCard(name,price,company,used);
            return this;
        }
        public ComputerBilder powerSupplier(String name,int price,String company, int print){
            this.powerSupplier=new PowerSupplier(name,price,company,print);
            return this;
        }
        public ComputerBilder cooler(String name,int price,String company, String method){
            this.cooler=new Cooler(name,price,company,method);
            return this;
        }
        public ComputerBilder mouse(String name,int price,String company){
            this.mouse=new Mouse(name,price,company);
            return this;
        }
        public ComputerBilder keyboard(String name,int price,String company, String keyarr){
            this.keyboard=new Keyboard(name,price,company,keyarr);
            return this;
        }
        public ComputerBilder monitor(String name,int price,String company, int size){
            this.monitor=new Monitor(name,price,company,size);
            return this;
        }
        public Computer build(){    //지금까지 설정한 ComputerBuiler의 필드를 통해 객체를 생성해 반환한다.
            Computer computer=new Computer(cpu,ram ,graphicsCard,powerSupplier);
            computer.cooler=this.cooler;
            computer.mouse=this.mouse;
            computer.keyboard=this.keyboard;
            computer.monitor=this.monitor;

            return computer;
        }


    }
    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
        cpu.on();
        ram.on();
        graphicsCard.on();
        powerSupplier.on();
        parton();
    }

    public void shutdown(){
        System.out.println("컴퓨터를 종료합니다.");
        cpu.off();
        ram.off();
        graphicsCard.off();
        powerSupplier.off();
        partoff();
    }

    public void run() {
        System.out.println("컴퓨터 기능을 전부 실행합니다");
        cpu.run();
        ram.run();
        graphicsCard.run();
        powerSupplier.run();

        //mouse.run();//만들어 지지 않았는데 할수 없지
        partrun();

    }

    public void partrun(){
        if (this.cooler != null ) {
            cooler.run();
        }
        if (this.mouse != null ) {
            mouse.run();
        }
        if (keyboard != null) {
            keyboard.run();
        }
        if (this.monitor != null ) {
            monitor.run();
        }
    }
    public void parton() {
        if (this.cooler != null) {
            cooler.on();
        }
        if (this.mouse != null) {
            mouse.on();
        }
        if (keyboard != null) {
            keyboard.on();
        }
        if (this.monitor != null) {
            monitor.on();
        }
    }
    public void partoff() {
        if (this.cooler != null) {
            cooler.off();
        }
        if (this.mouse != null) {
            mouse.off();
        }
        if (keyboard != null) {
            keyboard.off();
        }
        if (this.monitor != null) {
            monitor.off();
        }
    }
}
