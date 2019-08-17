package cn.bdqn;

import cn.bdqn.entity.User;
import cn.bdqn.mapper.UserMapper;
import cn.bdqn.util.Proving;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdqnApplicationTests {

    @Test
    public void contextLoads() {
        //短信验证码测试
        Proving p = new Proving();
        if (p.verification("18739779828")){
            System.out.println(p.getRadonNumber);
        }
    }

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
