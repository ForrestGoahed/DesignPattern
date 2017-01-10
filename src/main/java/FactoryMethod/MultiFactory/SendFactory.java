package FactoryMethod.MultiFactory;

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
 * @Date 2016/11/8 10:48
 * @since JRE 1.6.0_22  or higher
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
