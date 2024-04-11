public class Monitor extends Propertie implements Runable {
    private int size; //크기
    public Monitor(String name, int price, String company, int size) {
        super(name,price,company);
        this.size = size;
    }

    public void runable(){
        System.out.println(name+"화면을 출력합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}

