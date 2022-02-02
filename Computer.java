public class Computer {

    int year;
    float price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer(){
       isNotebook = false;
       operationSystem = "Win XP";
    }

    Computer(int year, float price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, float price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer otherComputer){
        if(price > otherComputer.price){
            System.out.println("The price of the first computer is higher than the second");
            return -1;
        }else if(price < otherComputer.price) {
            System.out.println("The price of the second computer in comparison is higher than the first");
            return -1;
        }else{
            System.out.println("The prices are equal");
            return 0;
        }
    }

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system is " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory < freeMemory) {
            freeMemory = freeMemory - memory;
            System.out.println("The free memory is " + freeMemory);
                   } else {
            System.out.println("Not enough free memory!");
        }
    }

}

