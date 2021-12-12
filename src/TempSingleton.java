public class TempSingleton {
    private static TempSingleton Instance = null;

    private TempSingleton(){
        // do something
        //
        // Направете възможен достъпът от GUI частта към функционалността за запис на данни чрез Singleton.
    }

    public static TempSingleton getInstance(){
        if (Instance == null){
            Instance = new TempSingleton();
        }
        return Instance;
    }
}
