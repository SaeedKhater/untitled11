package tr.edu.maltepe.OOP;


public class Professor extends Person
{
    private String Rol;
    private String ProfessorName;
    private int ID;

    public Prof(int ID,String Rol,String ProfName){
        this.ProfName=ProfessorName;
        this.ID=ID;
        this.Rol=Rol;

    }
    public int getPID(){
        return ID;
    }
    public String getPRol(){
        return Rol;}

    public String getPName() {
        return ProfName;}


    public String land(String Rol,String name,String bookName){
        return Rol+name+"want to give back the book id="+bookName;

    }}