package factoryMethod;

/**
 * 工厂方法模式
 */
public class Test {
    public static void main(String[] args) {
        Util gun = new GunFactoryImpl().getUtil();
        Util knife = new KnifeFactoryImpl().getUtil();
    }
}
