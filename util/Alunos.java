package util;

public class Alunos {

    private String name;
    private double n1,n2;

    public Alunos(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getName() {
        return name;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public boolean aprovado()
    {
        if(((n1+n2)/2) >= 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
