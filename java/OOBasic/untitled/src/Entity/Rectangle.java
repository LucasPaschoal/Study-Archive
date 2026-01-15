package Entity;

public class Rectangle {
    private double width;
    private double heigth;

    public double Area() {
        return width * heigth;
    }

    public double Perimeter(){
        return (width * 2) + (heigth * 2);
    }

    public double Diagonal(){
        return Math.sqrt(((width * width) + (heigth * heigth)));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", Area()) + "\nPERIMETER = " + String.format("%.2f", Perimeter()) + "\nDIAGONAL = " + String.format("%.2f", Diagonal());
    }
}
