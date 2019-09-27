package abstractFactory;
/*
汽车基类
 */
public abstract class Car {
}
/*
奔驰
 */
 abstract class BMW extends Car{

}
/*
比亚迪
 */
abstract class BYD extends Car{

}

/**
 * 轿车
 */
interface Jiaoche{

}

/**
 * SUV
 */
interface SUV{

}

/**
 * 宝马轿车
 */
class BMWJiaoChe extends BMW implements Jiaoche{

}

/**
 * 宝马SUV
 */
class BMWSUV extends BMW implements SUV{

}
/**
 * 比亚迪轿车
 */

class BYDJiaoChe extends BYD implements Jiaoche{

}
/**
 * 比亚迪SUV
 */
class BYDSUV extends BYD implements SUV{

}
