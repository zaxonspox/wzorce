package Wzorce;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AccountService as = new AccountService();
        as.saveUser("Grzegorz", "Petri", 1234, "792-xxx-297", true);
        as.saveUser("Grzegorz", "Admin", 4321, "509-517-118", true);
        as.listEm();
        System.out.println(as.count());
    }
    public static void mainSingleton( String[] args){
        System.out.println("Destroy the World!");
        System.out.println("Wzorzec Singleton");
        Session ses = Session.getInstance();
        System.out.println(ses.getLang());
        System.out.println(ses.getUser());
        ses.loginUser("zaxon");
        System.out.println("Zalogowano: "+ses.getUser());
        Session ses2 = Session.getInstance();
        System.out.println("Nowe logowanie: "+ses2.getUser());
        System.out.println(ses.logoutUser());

    }
    public static void mainFactory( String[] args )
    {
        System.out.println( "Destroy the World!" );
        System.out.println( "Wzorzec Factory" );
        for( FactoryCar.CarType cart : FactoryCar.CarType.values() ){
            System.out.println("Typ paliwa w autcie "+cart+" to "+FactoryCar.buildCar(cart).getFuel());
        }

    }
    public static void mainBuilder( String[] args )
    {
        System.out.println( "Destroy the World!" );
        System.out.println( "Wzorzec Builder" );
        Room r1 = new Room.Builder().roomNo(1).bedsCnt(2).hasBathroom(true).isAvailable(true).isClean(true).roomSpace(12.5).build();    // należałoby przenieść roomNo i bedsCnt do konstruktora
        Room r2 = new Room.Builder().roomNo(2).bedsCnt(2).hasBathroom(true).isAvailable(false).isClean(true).roomSpace(13.5).build();    // należałoby przenieść roomNo i bedsCnt do konstruktora
        Room r3 = new Room.Builder(3,2).roomNo(3).bedsCnt(2).build();
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
}
