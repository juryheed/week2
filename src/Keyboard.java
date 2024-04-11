public class Keyboard extends Propertie implements Runable {
    private String key; //키배열
    public Keyboard(String name, int price, String company, String key) {
        super(name,price,company);
        this.key = key;
    }

    public void runable(){
        System.out.println(name+"타이핑 합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}


