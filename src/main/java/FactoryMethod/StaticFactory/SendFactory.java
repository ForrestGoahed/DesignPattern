package FactoryMethod.StaticFactory;

import FactoryMethod.MailSender;
import FactoryMethod.Sender;
import FactoryMethod.SmsSender;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 10:50
 * @since JRE 1.6.0_22  or higher
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
