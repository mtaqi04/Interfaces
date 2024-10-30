public class Machine implements Info, Storable {
    private String id;

    public Machine(String id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID: " + id);
    }

    @Override
    public void store() {
        logOperation("store");
        System.out.println("Machine stored.");
    }

    public void start() {
        logOperation("start");
        System.out.println("Machine started.");
    }

    public void start(String mode) {
        logOperation("start in " + mode + " mode");
        System.out.println("Machine started in " + mode + " mode.");
    }

    public void start(int powerLevel) {
        logOperation("start with power level " + powerLevel);
        System.out.println("Machine started with power level " + powerLevel + ".");
    }

    public void stop() {
        logOperation("stop");
        System.out.println("Machine stopped.");
    }

    private void logOperation(String operation) {
        System.out.println("Log: " + operation);
    }
}
