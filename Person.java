public class Person implements Info, Storable {
    private String name;
    private Machine ownedMachine;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Person name: " + name);
    }

    @Override
    public void store() {
        System.out.println("Person " + name + " stored in database.");
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I own machine with ID: ");
        if (ownedMachine != null) {
            ownedMachine.showInfo();
        }
    }

    public void setOwnedMachine(Machine machine) {
        this.ownedMachine = machine;
    }
}
