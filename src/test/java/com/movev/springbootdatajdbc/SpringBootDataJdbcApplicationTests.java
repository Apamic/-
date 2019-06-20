package com.movev.springbootdatajdbc;

import com.movev.springbootdatajdbc.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJdbcApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();

    }

//    public SqlSessionFactory getSqlSessionFactory() throws IOException {
//         String resource = "mybatis-config.xml";
//         InputStream inputStream = resource.getResourceAsStream(resource);
//         return new SqlSessionFactoryBuilder().build(InputStream);
//    }


    /**
     * 两级缓存：
     * 一集缓存：（本地缓存）：sqlSession级别的缓存，一集缓存是一直开启；
     *          与数据库同一次会话期间查询到的数据会放在本地缓存。
     *          以后如果需要获取相同的数据，就直接在从缓存中拿。
     *
     *          一集缓存失效情况（没有使用到当前一集缓存的情况，效果就是，还需再向数据发出请求）：
     *          1，sqlSession不同。
     *          2，sqlSession相同，查询条件不一样。（当前一集缓存中还没有这个数据）
     *          3，sqlSession相同，两次查询之间执行了增删改操作(这次增删改可能对当前数据有影响)
     *          4，sqlSession相同，手动清除一级缓存。
     *
     * 二级缓存：（全局缓存）：基于namespace级别的缓存：一个namespace对应一个二级缓存：
     *          工作机制：
     *          1，一个会话，查询一条数据，这个数据就会被放在当前会话的一级缓存中；
     *          2, 如果会话关闭；一级缓存中的数据会被保存到二级缓存中；新的会话查询信息，就可以参照二级缓存
     *          3，sqlSession===EmployeeMapper==>Employee
     *                          DepartmentMapper==>Department
     *             不同namespace查出的数据会放在自己对应的缓存中（Map）
     *
     *
     *          使用：
     *              1）,开启全局二级缓存配置：<setting name="cacheEnabled" value="true"/>
     *              2）,去mapper.xml中配置使用二级缓存：<cache></cache>
     *              3）,我们的接口ＰＯＪＯ需要实现序列化接口
     */
}
