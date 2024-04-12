public class GraphicsCard extends Propertie implements Runable {
    private String used;      //용도
    public GraphicsCard(String name, int price, String company, String used) {
        super(name,price,company);
        this.used = used;
    }

    public void run(){
        System.out.println(name+"화면을 렌더링 합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}

