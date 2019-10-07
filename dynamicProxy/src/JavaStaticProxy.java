/**
 * 静态代理
 * 持有目标对象的实例
 * 特点：
 * 静态代理虽然实现简单且容易理解，但由于代理类持有目标对象的引用，
 * 使得代理对象(JavaStaticProxy)与目标对象(JavaDeveloper)耦合在一起，
 * 一个代理类不能作用于多个目标对象。
 * 如果一个接，口下有多种实现而每种实现都需要代理的话，就需要重新写代理类，不能重用代码。
 * 同时,一旦接口增加方法,目标对象与代理对象都要维护
 * 例如现在需要一个C++的程序员代理 就需要重新写代理类.
 */
public class JavaStaticProxy implements Developer{

    private JavaDeveloper javaDeveloper;

    public JavaStaticProxy(JavaDeveloper javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }

    @Override
    public void code() {
        System.out.println("Before code ...");
        javaDeveloper.code();
        System.out.println("After code ...");
    }

    @Override
    public void debug() {
        System.out.println("Before debug ...");
        javaDeveloper.debug();
        System.out.println("After debug ...");
    }
}
