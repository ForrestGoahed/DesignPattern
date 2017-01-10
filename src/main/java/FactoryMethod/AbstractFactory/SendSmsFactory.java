package FactoryMethod.AbstractFactory;

import FactoryMethod.Sender;
import FactoryMethod.SmsSender;

/**
 * ClassName£º
 * Description£º
 * <p>company£º58Í¬³Ç <br>
 * Copyright£ºCopyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 11:11
 * @since JRE 1.6.0_22  or higher
 */
public class SendSmsFactory implements Provider{

    public Sender produce() {
        return new SmsSender();
    }
}
