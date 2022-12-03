package org.example;

public class Land {
    public String Name;
    public String isDasLandInEu;
    public double gross;

    public Land(String Name, String isDasLandInEu, double gross) {
        this.Name = Name;
        this.isDasLandInEu = isDasLandInEu;
        this.gross = gross;
    }
    public Land(){
        this.Name = "Mazedonein";
        this.isDasLandInEu = "Nein";
        this.gross = 200.00;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIsDasLandInEu() {
        return isDasLandInEu;
    }

    public void setIsDasLandInEu(String isDasLandInEu) {
        this.isDasLandInEu = isDasLandInEu;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    @Override
    public String toString() {
        return "Land{" +
                "Name='" + Name + '\'' +
                ", isDasLandInEu='" + isDasLandInEu + '\'' +
                ", gross=" + gross +
                '}';
    }
}
