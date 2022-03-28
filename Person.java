package tr.edu.maltepe.OOP;

public class Person {
    private int ID;
    private String Rol;

    public Person() {
        this.Rol=Rol;
        this.ID=ID;
    }
    public String getRol() {
        return Rol;}

    public int getID() {
        return ID;
    }


    public String printString() {
        return "Role=" + getRol() + " ID:" + getID();


    }}