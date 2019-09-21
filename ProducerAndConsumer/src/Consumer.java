public class Consumer extends Thread {
    public ProductPool productPool ;

    public Product pop;

    public Consumer (ProductPool productPool){
        this.productPool = productPool;
    }

    @Override
    public void run() {
        while (true){
             pop = productPool.pop();
            System.out.println("消费者消费了:"+pop.getProductName());
        }
    }
}
