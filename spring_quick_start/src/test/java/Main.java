import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

public class Main {

    @Test
    public void testSpring(){
        //1.加载spring配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取spring创建的对象
        User user = app.getBean("user", User.class);

        System.out.println(user);
    }
}
