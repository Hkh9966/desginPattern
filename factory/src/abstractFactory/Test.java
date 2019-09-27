package abstractFactory;

public class Test {
    public static void main(String[] args) {
        Jiaoche bmwJiaoChe = new BMWFactory().getJiaoche();
        SUV bydSUV = new BYDFactory().getSUV();
    }
}
