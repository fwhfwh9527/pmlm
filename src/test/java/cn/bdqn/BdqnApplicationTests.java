package cn.bdqn;

import cn.bdqn.util.Proving;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdqnApplicationTests {

    @Test
    public void contextLoads() {
        Proving p = new Proving();
        if (p.verification("18739779828")){
            System.out.println(p.getRadonNumber);
        }
    }

}
