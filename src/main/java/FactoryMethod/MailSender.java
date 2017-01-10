package FactoryMethod;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 10:36
 * @since JRE 1.6.0_22  or higher
 */
public class MailSender implements Sender {
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
