import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 产品池
 */
public class ProductPool {

    public ProductPool(int size) {
        productList = new ArrayList<>(size);

    }

    public static int MAX = 10;
    //商品列表
    public  List<Product> productList ;

    public synchronized  void push(Product product){
        if(productList.size()==MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.productList.add(product);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.notifyAll();
    }

    public synchronized Product pop(){
        if(productList.size()==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Product product = this.productList.remove(0);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.notifyAll();

       return product;

    }
}
