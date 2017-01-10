package FactoryMethod.AbstractFactory;

import FactoryMethod.Sender;

/**
 * ClassName��
 * Description��
 * <p>company��58ͬ�� <br>
 * Copyright��Copyright ? 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 11:12
 * @since JRE 1.6.0_22  or higher
 */

/**
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 * 必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，
 * 如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，
 * 直接增加新的工厂类就可以了，不需要修改之前的代码。因为抽象工厂不太好理解，
 * 我们先看看图，然后就和代码，就比较容易理解。
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
