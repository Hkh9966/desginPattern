package abstractFactory;

public class BYDFactory implements Factory {
    @Override
    public Jiaoche getJiaoche() {
        return new BYDJiaoChe();
    }

    @Override
    public SUV getSUV() {
        return new BYDSUV();
    }
}
