package Facade;

/**
 * ClassName：
 * Description：
 * <p>company：58同城 <br>
 * Copyright：Copyright © 2011 58.com All Rights Reserved<br>
 *
 * @author shaohongtao
 * @Date 2016/11/8 23:17
 * @since JRE 1.6.0_22  or higher
 */

/**
 * 外观模式（门面模式）是为了解决类与类之家的依赖关系的，像spring一样，
 * 可以将类和类之间的关系配置到配置文件中，
 * 而外观模式就是将他们的关系放在一个Facade类中，
 * 降低了类类之间的耦合度，该模式中没有涉及到接口
 *
 * 如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，
 * 产生关系，这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，
 * 这不是我们想要看到的，有了Computer类，
 * 他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，这，就是外观模式！
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
