package Entity;

public class Studant {
    private String name;
    private double n1;
    private double n2;
    private double n3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double soma(){
        return (n1 + n2 + n3);
    }

    public void passed(){
        double media = soma();
        if (media >= 60){
            System.out.println("FINAL GRADE = "+media +"\nPASS");
        } else {
            double missingPoints;
            missingPoints = 60 - media;
            System.out.println("FINAL GRADE = "+media+"\nFAILED"+"\nMISSING "+missingPoints+" POINTS");
        }
    }


}
