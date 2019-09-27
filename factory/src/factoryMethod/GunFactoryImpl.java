package factoryMethod;

/**
 * 枪工厂
 */
public class GunFactoryImpl implements Factory{
    @Override
    public  Util getUtil() {
        return new Gun();
    }
}
