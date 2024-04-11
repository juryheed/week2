
public class PowerSupplier extends Propertie implements Runable{
    private int shot;   //출력
    public PowerSupplier(String name, int price, String company,int shot) {
        super(name,price,company);
        this.shot=shot;
    }
    public void runable(){
        System.out.println(name+"전원을 공급합니다.");
    }
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}