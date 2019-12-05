
public class SortAirCommand implements Command{

    private Sort sort;

    SortAirCommand(Sort sort){
        this.sort= sort;
    }

    public void execute() {
        this.sort.LancerSortAir();
    }
}




