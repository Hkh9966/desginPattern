/**
 * 生产者消费者设计模式
 *  生产者：通过生产生产标记 判断是否生产产品
 *  如果需要生产 生产产品  通知消费者消费 释放锁
 *  不需要生产   释放锁 等待
 *  消费者：消费产品 判断是否有足够的产品可以消费
 *  可以消费：获取产品进行消费 通知生产者生产 释放锁
 *  不可以消费：释放锁等待生产者生产。
 */
public class Demo {
    public static ProductPool productPool = new ProductPool(10);

    public static void main(String[] args) {
        Producer producer = new Producer(productPool);
        Consumer consumer = new Consumer(productPool);
        producer.start();
        consumer.start();
    }
}
