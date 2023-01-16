package reflection_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class H_main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //1. 得到Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. 创建对象实例，使用无参构造器
        PrivateTest privateTestObj = privateTestClass.getDeclaredConstructor().newInstance();
        //PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4. 设置name属性可访问,爆破
        name.setAccessible(true);
        name.set(privateTestObj, "jack");
        //5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. 调用getName方法
        Object invoke = getName.invoke(privateTestObj);
        System.out.println(invoke);


    }
}

class PrivateTest {
    private String name = "tom";

    public String getName() {
        return name;
    }
}