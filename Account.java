abstract class Account {
    protected String name;
    protected String id;

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();
}