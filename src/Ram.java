public class Ram extends Propertie implements Runable {
    private int volume;      //용량
    public Ram(String name, int price, String company, int volume) {
        super(name,price,company);
        this.volume = volume;
    }
    public void runable(){
        System.out.println(name+"데이터를 읽습니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}

