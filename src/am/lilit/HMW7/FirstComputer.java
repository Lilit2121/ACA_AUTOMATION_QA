package am.lilit.HMW7;

import java.util.Objects;

public class FirstComputer {

    public String cpu;
    public String ram;
    public String ssd;

    public FirstComputer(String cpu,String ram,String ssd){
        this.cpu=cpu;
        this.ram=ram;
        this.ssd=ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return cpu.equals(computer.cpu) && ram.equals(computer.ram) && ssd.equals(computer.ssd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd);
    }
}

