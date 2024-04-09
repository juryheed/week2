public class Cooler extends Properties implements RUN__ {
    private String method;      //냉각방식
    public Cooler(String name, int price, String company, String cooling) {
        super(name,price,company);
        this.method = method;
    }

    public void run__(){
        System.out.println(name+"냉각합니다.");
    }
}

