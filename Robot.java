public class Robot extends Machine implements Info {
    public Robot(String id) {
        super(id);
    }

    public void executeTask(String task) {
        System.out.println("Robot is executing " + task);
    }

    public void recharge() {
        System.out.println("Robot is recharging");
    }
}
