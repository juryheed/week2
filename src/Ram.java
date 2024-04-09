public class Ram extends Properties implements RUN__ {
    private int volume;      //용량
    public Ram(String name, int price, String company, int volume) {
        super(name,price,company);
        this.volume = volume;
    }
    public void run__(){
        System.out.println(name+"데이터를 읽습니다.");
    }
}

