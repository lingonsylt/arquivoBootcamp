public class Storage{
    private int
    id;

    private float
    price;

    private String
    item;

    public Storage(String item){
        this.item = item;
    }
    
    public int getId(){
        return id;
    }

    public float getPrice(){
        return price;
    }

    public String getItem(){
        return item;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setItem(String item){
        this.item = item;
    }
}
