import java.util.Random;

public class Computer {
    private String processor;
    private int ram;
    private int hardDrive;
    private static int cycle = 0;
    private static final int maxCycle = 3;
    private boolean on =false;
    private boolean off =false;

    Computer() {
    }

    Computer(String processor, int ram, int hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    private void end() throws Exception {
        cycle++;
        if (cycle > maxCycle)
            throw new Exception("Yor computer burned down");
    }


    public void on(int x) throws Exception {
        end();
        if(on==true)
            throw new Exception("Yor computer is working right now!");
        on=true;
        Random rand = new Random();
        int y = rand.nextInt(2);
        if (x == y)
            System.out.println("Loading the system...");
        else
            throw new Exception("Yor computer burned down");


    }

    public void off(int x) throws Exception {
        if(off==true)
            throw new Exception("Yor computer is working right now!");
        off=true;
        Random rand = new Random();
        int y = rand.nextInt(2);
        if (x == y)
            System.out.println("Shutting down the system...");
        else
            throw new Exception("Yor computer burned down");

    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", RAM=" + ram +
                ", hardDrive=" + hardDrive +
                ", maxCycle=" + maxCycle +
                '}';
    }
}
