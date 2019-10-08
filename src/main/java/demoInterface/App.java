package demoInterface;

public class App {
    public static void main(String[] args) {
        ConCho c =new ConCho();
        c.tenDongVat = "Lucky";
        c.tuoi = "7";
        c.an();
        c.chay();
        c.diChoi();
        c.ngu();
        c.sanMoi();
        ConMeo m =new ConMeo();
        m.tenDongVat = "Meow";
        m.tuoi = "5";
        m.an();
        m.chay();
        m.diChoi();
        m.ngu();
        m.sanMoi();
    }
}
