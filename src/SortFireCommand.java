public class SortFireCommand implements Command{

    private Sort sort;

    SortFireCommand(Sort sort){
        this.sort= sort;
    }

    public void execute() {
        this.sort.LancerSortFire();
    }
}


