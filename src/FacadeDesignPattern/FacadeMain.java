package FacadeDesignPattern;

public class FacadeMain {

    public static void main(String[] args) {

        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();


        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hd);
        computerFacade.start();
    }
}
