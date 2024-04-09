interface RUN__{
    void run__();
}
class Properties{   //속성 상속 부모
    protected String name;    //부품명
    protected int price;      //가격
    protected String company; //제조사

    public Properties(String name, int price, String company) {
        this.name=name;
        this.price=price;
        this.company=company;
    }
}



public class Cpu extends Properties implements RUN__ {
    private int speed;      //속도
    private String used;    //용도

    public Cpu(String name, int price, String company, int speed, String used) {
        super(name,price,company);
        this.speed = speed;
        this.used = used;
    }

    public void run__() {
        System.out.println(name+"를 처리합니다.");
    }
}
