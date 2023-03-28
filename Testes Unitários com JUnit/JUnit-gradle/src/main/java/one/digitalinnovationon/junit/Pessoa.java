package one.digitalinnovationon.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String name;
    private LocalDate nascimento;

    public Pessoa(String name, LocalDate nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }
    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }


}

