public class GraphicsCard extends Properties implements RUN__ {
    private String used;      //용도
    public GraphicsCard(String name, int price, String company, String used) {
        super(name,price,company);
        this.used = used;
    }

    public void run__(){
        System.out.println(name+"화면을 렌더링 합니다.");
    }
}

