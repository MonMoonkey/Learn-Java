package priv.monkey.learn.java.dagger2;

import javax.inject.Inject;

/**
 * @author:Monkey
 * @time: Create on 2018/5/31
 */
public class Res {
    public Product product;
    @Inject
    public Res(Product p) {
        this.product=p;
    }
}
