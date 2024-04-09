public class Monitor extends Properties implements RUN__ {
    private int size; //크기
    public Monitor(String name, int price, String company, int size) {
        super(name,price,company);
        this.size = size;
    }

    public void run__(){
        System.out.println(name+"화면을 출력합니다.");
    }
}

