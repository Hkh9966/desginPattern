/**
 * Java程序员
 */
public class JavaDeveloper implements Developer {

    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name+"  is coding Java...");
    }

    @Override
    public void debug() {
        System.out.println(name+"  is debuging Java...");
    }
}
