public class Vehicle implements Storable {
    @Override
    public void store() {
        System.out.println("Vehicle stored in garage.");
    }

    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}
