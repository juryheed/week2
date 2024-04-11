

public class Cpu extends Propertie implements Runable {
    private int speed;      //속도
    private String used;    //용도

    public Cpu(String name, int price, String company, int speed, String used) {
        super(name,price,company);
        this.speed = speed;
        this.used = used;
    }

    public void runable(){
        System.out.println(name+"를 처리합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}
