public class SortIceCommand implements Command{

    private Sort sort;

    SortIceCommand(Sort sort){
        this.sort= sort;
    }

    public void execute() {
        this.sort.LancerSortIce();
    }
}








