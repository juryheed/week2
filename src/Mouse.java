public class  Mouse extends Propertie implements Runable {
    public Mouse(String name, int price, String company)
    {
        super(name,price,company);
    }
    public void runable(){System.out.println(name+"클릭합니다.");}
    public void on(){System.out.println(name+"를 On합니다");}
    public void off(){System.out.println(name+"를 Off합니다");}
}

