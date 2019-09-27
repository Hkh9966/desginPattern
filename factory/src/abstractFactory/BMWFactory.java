package abstractFactory;

public class BMWFactory implements  Factory {
    @Override
    public Jiaoche getJiaoche() {
        return new BMWJiaoChe();
    }

    @Override
    public SUV getSUV() {
        return new BMWSUV();
    }
}
