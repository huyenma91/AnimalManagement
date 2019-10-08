package demoInterface;

public class ConMeo extends DongVat implements NhungHanhViCuaDongVat {
    @Override
    public void an() {
        System.out.println("Con Meo an com");
    }

    @Override
    public void ngu() {
        System.out.println("Con Meo ngu tren noc nha");
    }

    @Override
    public void diChoi() {
        System.out.println("Con Meo di choi khuya");
    }

    @Override
    public void chay() {
        System.out.println("Con Meo leo cay");
    }
}
