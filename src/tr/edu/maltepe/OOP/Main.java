package tr.edu.maltepe.OOP;



public class Main {
    public static void main(String[] args) {

        Professor prf1 = new Professor(1, "Teacher", "Asaf Varol");
        Student st1 = new Student(2, "Student", "Safak Atan", "CE");
        Student st2 = new Student(3, "Student", "Said Tarik", "CE");
        Books bk1= new Books(001,"Masallar");
        Books bk2= new Books(002,"Makaleler");
        Books bk3= new Books(003,"Romanlar");
        System.out.println(st1.giveBack(st1.getRol(), st1.getName(), bk1.getBookName()));
        System.out.println(prf1.land(prf1.getRol(), prf1.getName(),bk2.getBookName()));
        System.out.println(st2.notAv(st2.getRol(), st2.getName(), bk3.getBookName()));





    }
}