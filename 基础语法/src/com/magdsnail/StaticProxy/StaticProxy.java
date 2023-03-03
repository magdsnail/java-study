package com.magdsnail.StaticProxy;

//静态代理模式总结
//这是对象和代理对象都要实现同一个接口
public class StaticProxy {
    WeddingCompany weddingCompany = new WeddingCompany(new You());
    weddingCompany.HappyMarry();
}
interface Marry{
    void HappyMarry();
}

class You implements Marry{
    @Override
    public  void HappyMarry() {
        System.out.println("秦老师要结婚了，超开心");
    }
}

class WeddingCompany implements Marry{
    //代理
    private  Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private  void after() {
        System.out.println("结婚之后.收尾款");
    }

    private  void before() {
        System.out.println("结婚之后。布置现场");
    }


}