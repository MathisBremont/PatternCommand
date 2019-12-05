public class SortEarthCommand implements Command{

    private Sort sort;

    SortEarthCommand(Sort sort){
        this.sort= sort;
    }

    public void execute() {
        this.sort.LancerSortEarth();
    }
}





