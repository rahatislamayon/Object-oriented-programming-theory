class Burger{
    String name;
    String size;

    public  Burger(String name,String size)
    {
        this.name=name;
        this.size=size;
    }
    public void prepare()
    {
        System.out.println("burger:"+size);
    }
}

class BeefBurger extends Burger{
    String flavor;
    int price;
    
    BeefBurger(String name,String flavor,String size,int price)
    {
        super(name,size);
        this.flavor=flavor;
        this.price=price;
    }
    
    @Override
    public void prepare()
    {
        super.prepare();
        System.out.println("Flavor"+flavor);
        System.out.println("price"+price);
    }
}

class VagiBurger extends Burger{
    String flavor;
    int price;
    
    VagiBurger(String name,String flavor,String size,int price)
    {
        super(name,size);
        this.flavor=flavor;
        this.price=price;
    }
    
    @Override
    public void prepare()
    {
        super.prepare();
        System.out.println("Flavor"+flavor);
        System.out.println("price"+price);
    }
}

class mainburger
{
    public  static void main(String[] args)
    {
        Burger beefBurger=new BeefBurger("Double Decke","spyci","Large",400);
        beefBurger.prepare();

        Burger vegiBurger=new VagiBurger("masroom","sweet","small",300);
        vegiBurger.prepare();
    }
}