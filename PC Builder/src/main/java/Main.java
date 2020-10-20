public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram("Ram", 200);
        Cpu cpu = new Cpu("Cpu", 300);
        PowerSupply ps = new PowerSupply("PowerSupply", 600);

        Pc computer = new Pc();
        computer.addComponent(ram);
        computer.addComponent(cpu);
        computer.addComponent(ps);
        computer.isWorking();

    }
}
