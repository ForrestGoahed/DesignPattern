package Proxy;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright © 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 19:36
 * @since JRE 1.6.0_22  or higher
 */
public class Source implements Sourceable {

    public void method() {
        System.out.println("the original method!");
    }
}
