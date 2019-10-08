package demoInterface;

public class ConCho extends DongVat implements NhungHanhViCuaDongVat,NhungHanhViKhacCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con Cho an com");
    }

    @Override
    public void ngu() {
        System.out.println("Con Cho ngu duoi dat");
    }

    @Override
    public void diChoi() {
        System.out.println("Con Cho ko di choi");
    }

    @Override
    public void chay() {
        System.out.println("Con Cho chay bang 4 chan");
    }

    @Override
    public void noDua() {
        System.out.println("");
    }

    @Override
    public void sinhSan() {
        System.out.println("");
    }

}
