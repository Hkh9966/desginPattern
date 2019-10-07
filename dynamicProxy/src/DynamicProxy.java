import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Jdk动态代理
 * 程序运行时通过反射机制创建的代理。将一些公共逻辑可以写在方法执行的前后，实现切面编程
 * 在新生成的代理对象中，每个方法都被套了一层invoke中的逻辑。
 * 这也体现出了动态生成带来的便捷。
 *
 *
 * 静态代理和JDK代理有一个共同的缺点，就是目标对象必须实现一个或多个接口 如果只是一个类可以使用CGLib代理
 *
 * 在Spring的AOP编程中：
 * 如果加入容器的目标对象有实现接口，用JDK代理
 * 如果目标对象没有实现接口，用Cglib代理
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do target method before...");
        Object invoke = method.invoke(target, args);
        System.out.println("Do target method after...");
        return invoke;
    }
}
