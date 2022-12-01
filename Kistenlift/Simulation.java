public class Simulation
{
    private Stapel links;
    private Stapel rechts;
    private Aufzug aufzug;

    public Simulation()
    {
        links = new Stapel();
        rechts = new Stapel();
        aufzug = new Aufzug();
    }

    public void setup()
    {
        System.out.println("---------- Erstelle Ausgangsstellung ----------");
        links.einfuegen(new Kiste(15));
        links.einfuegen(new Kiste(30));
        links.einfuegen(new Kiste(25));
        links.einfuegen(new Kiste(10));
        links.einfuegen(new Kiste(30));
        links.einfuegen(new Kiste(45));
        links.einfuegen(new Kiste(23));
        links.einfuegen(new Kiste(50));
        links.einfuegen(new Kiste(55));
        links.einfuegen(new Kiste(34));
        links.einfuegen(new Kiste(20));
        links.einfuegen(new Kiste(40));
        System.out.println("Stapel links: " );
        links.stapelDatenAusgeben();

    }

    public void start()
    {
        System.out.println("Los geht's!!!");
     


    }

    
}

