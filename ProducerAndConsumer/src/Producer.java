import java.util.UUID;

public class Producer extends Thread{
    public ProductPool productPool ;

    public Producer (ProductPool productPool){
        this.productPool = productPool;
    }
    @Override
    public void run() {
       while(true){
           String name = (int)(Math.random()*100) +"号产品" ;
           Product product = new Product(name);
           productPool.push(product);
           System.out.println("生产者生产了:"+name);
       }
    }
}
