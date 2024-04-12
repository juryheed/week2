public class Cooler extends Propertie implements Runable{
    private String method;      //냉각방식
    public Cooler(String name, int price, String company, String cooling) {
        super(name,price,company);
        this.method = method;
    }

    public void run(){
        System.out.println(name+"냉각합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}

