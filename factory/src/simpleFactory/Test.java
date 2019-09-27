package simpleFactory;

import java.io.BufferedReader;
/*
简单工厂模式
 */
public class Test {
    public static void main(String[] args) {
        /*
        简化构造对象代码
        */
        BufferedReader bufferedReader = Factory.getBufferedReader("D:/123.txt","UTF-8");
        /*
        动态获取子类对象
         */
        Util gun = Factory.getUtil("gun");
    }
}
