
public class POWERSupplier extends Properties implements RUN__{
    private int shot;   //출력
    public POWERSupplier(String name, int price, String company,int shot) {
        super(name,price,company);
        this.shot=shot;
    }
    public void run__(){
        System.out.println(name+"전원을 공급합니다.");
    }
}