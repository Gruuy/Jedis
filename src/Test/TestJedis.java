import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.List;
import java.util.Set;

public class TestJedis {
    @Test
    public void TestRedis(){
        Jedis jedis=new Jedis("localhost",6379);
        jedis.auth("123456");
        System.out.println("连接成功！");
        Set<String> set1=jedis.keys("*");
        System.out.println(set1);
    }
}
