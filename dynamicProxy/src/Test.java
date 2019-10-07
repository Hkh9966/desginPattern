import java.lang.reflect.Proxy;

/**
 * 代理模式：
 *
 * 什么时候使用代理模式?
 * 1、当我们想要隐藏某个类时，可以为其提供代理。
 *
 * 2、当一个类需要对不同的调用者提供不同的调用权限时，可以使用代理类来实现
 * （代理类不一定只有一个，我们可以建立多个代理类来实现，也可以在一个代理类中进行权限判断来进行不同权限的功能调用）。
 *
 * 3、当我们要扩展某个类的某个功能时，可以使用代理模式，在代理类中进行简单扩展（只针对简单扩展，可在引用委托类的语句之前与之后进行）。
 */
public class Test {
    public static void main(String[] args) {
        /*
        静态代理测试
         */
        JavaStaticProxy staticProxy = new JavaStaticProxy(new JavaDeveloper("Xiaohu"));
        staticProxy.code();
        staticProxy.debug();

        /*
        动态代理测试
         */
        Developer javaDeveloper = new JavaDeveloper("Xiaohu");

        //创建代理对象
        Developer javaDeveloperProxy = (Developer)Proxy.newProxyInstance(javaDeveloper.getClass().getClassLoader(),
                javaDeveloper.getClass().getInterfaces(),new DynamicProxy(javaDeveloper));
        javaDeveloperProxy.code();

        //这次在实现C++程序员代理时就不用像静态代理一样再写一个代理类了
        Developer cppDeveloper = new CPPDeveloper("XiaoZhang");
        Developer cppDeveloperProxy = (Developer)Proxy.newProxyInstance(cppDeveloper.getClass().getClassLoader(),
                cppDeveloper.getClass().getInterfaces(),new DynamicProxy(cppDeveloper));
        cppDeveloperProxy.code();
        cppDeveloperProxy.debug();
    }
}
