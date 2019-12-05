
public class Mage{

    private String nom;
    private String prenom;
    private int age;

    public Mage(String nom, String prenom, int age) {
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void lancerSort(){
        command.execute();
    }
}


