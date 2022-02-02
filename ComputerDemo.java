public class ComputerDemo {
    public static void main(String[] args) {

        Computer pc = new Computer(2021, 3000, false, 512, 400, "Win XP");
        Computer mac = new Computer(2017, 2500, true, 128, 50, "macOS");


        pc.comparePrice(mac);

        mac.useMemory(40);
        pc.changeOperationSystem("linux");
        System.out.println(" ");

        if (pc.isNotebook) {
            System.out.println("notebook PC: ");
        } else {
            System.out.println("desktop PC: ");
        }
        System.out.println("Year: " + pc.year);
        System.out.println("Price: " + pc.price);
        System.out.println("HDD: " + pc.hardDiskMemory);
        System.out.println("free memory: " + pc.freeMemory);
        System.out.println("OS: " + pc.operationSystem);

        System.out.println(" ");

        if (mac.isNotebook) {
            System.out.println("notebook Mac: ");
        } else {
            System.out.println("desktop Mac: ");
        }
        System.out.println("Year: " + mac.year);
        System.out.println("Price: " + mac.price);
        System.out.println("HDD: " + mac.hardDiskMemory);
        System.out.println("free memory: " + mac.freeMemory);
        System.out.println("OS: " + mac.operationSystem);
    }
}
