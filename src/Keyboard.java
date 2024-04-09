public class Keyboard extends Properties implements RUN__ {
    private String key; //키배열
    public Keyboard(String name, int price, String company, String key) {
        super(name,price,company);
        this.key = key;
    }

    public void run__(){
        System.out.println(name+"타이핑 합니다.");
    }
}


