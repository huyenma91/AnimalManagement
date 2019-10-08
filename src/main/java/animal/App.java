package animal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        DongVat dv = new DongVat();
//        dv.an();
        ConCho c = new ConCho();
        c.soChan = "4";
        c.tenDongVat = "Lucky";
        System.out.println(c.tenDongVat+" co "+c.soChan+" chan ");
        c.an();
        c.ngu();

        ConDe d = new ConDe();
        d.an();
    }
}
