package factoryMethod;

/**
 * 刀工厂
 */
public class KnifeFactoryImpl implements Factory {
    @Override
    public Util getUtil() {
        return new Knife();
    }
}
