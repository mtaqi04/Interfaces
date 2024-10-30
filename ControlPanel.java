import java.util.ArrayList;

public class ControlPanel {
    private ArrayList<Machine> machines = new ArrayList<>();

    public void addMachine(Machine m) {
        machines.add(m);
    }

    public void startAllMachines() {
        for (Machine m : machines) {
            m.start();
        }
    }

    public void stopAllMachines() {
        for (Machine m : machines) {
            m.stop();
        }
    }
}
