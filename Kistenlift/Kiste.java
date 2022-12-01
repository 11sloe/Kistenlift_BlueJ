
public class Kiste
{
    int masse;
    public Kiste(int masse_)
    {
        masse = masse_;

    }

    public int getMasse()
    {
        return masse;
    }

    public void infosAusgeben()
    {
        System.out.println(" (" + masse + ")");
    }
}