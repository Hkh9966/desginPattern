public class CPPDeveloper implements Developer {

    private String name;

    public CPPDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name+" is coding c++ ...");
    }

    @Override
    public void debug() {
        System.out.println(name+" is debuging c++ ...");
    }
}
