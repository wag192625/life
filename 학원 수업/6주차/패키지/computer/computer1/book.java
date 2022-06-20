package computer1;

public class book {
    public String modelName = "MacBook Pro(16형, 2021년)";
    public String cpu = "10코어 CPU(성능 코어 8개 및 효율 코어 2개)";
    public String ram = "16GB 통합 메모리";
    public String ssd ;
    //값을 지정
    public book() {
        
    }
    // public book(String input_cpu) {
    //     this.cpu = input_cpu;
    // }

    public book(String input_cpu, String input_ram, String input_ssd) {
        this.cpu = input_cpu;
        this.ram = input_ram;
        this.ssd = input_ssd;
    }
}   