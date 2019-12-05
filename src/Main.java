public class Main {
    public static void main(String[] args){
        Mage gandalf = new Mage("Leblanc","Gandalf",24000);
        Sort sortilege = new Sort();

        Command sortFeu = new SortFireCommand(sortilege);
        gandalf.setCommand(sortFeu);
        gandalf.lancerSort();

        Command sortAir = new SortAirCommand(sortilege);
        gandalf.setCommand(sortAir);
        gandalf.lancerSort();

        Command sortEarth = new SortEarthCommand(sortilege);
        gandalf.setCommand(sortEarth);
        gandalf.lancerSort();

        Command sortIce = new SortIceCommand(sortilege);
        gandalf.setCommand(sortIce);
        gandalf.lancerSort();

    }
}








