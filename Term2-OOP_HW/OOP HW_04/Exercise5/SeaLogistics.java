package Exercise5;

public class SeaLogistics extends Logistics{
    
    public Transport createTransport(){
        return new Ship();
    }
}
