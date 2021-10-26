public class food
{
    private String name;
    private String type;
    private int price;
    food(String name,int price,String type)
    {
        super();
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public String toString()
    {
        return name+" is ₹"+price;
    }
}