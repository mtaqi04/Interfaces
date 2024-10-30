public class Main {
    public static void main(String[] args) {
        Info[] infoObjects = new Info[] {
                new Machine("M1"),
                new Person("Alice"),
                new Robot("R1")
        };

        for (Info info : infoObjects) {
            info.showInfo();
        }
    }
}
