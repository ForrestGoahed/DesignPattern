package Bridge;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright © 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 20:05
 * @since JRE 1.6.0_22  or higher
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
