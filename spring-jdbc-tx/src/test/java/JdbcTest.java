import com.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: Diao Rui
 * @className: JdbcTest
 * @Description: TODO
 * @DateTime: 2023/8/8 15:20
 * @version: 1.0
 **/
//配置springTest
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class JdbcTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "INSERT INTO temp(name,age,sex) values(?,?,?)";
        int update = jdbcTemplate.update(sql, "张三", 18, "男");
        if (update > 0) {
            System.out.println("Insert successfully");
        } else {
            System.out.println("Insert failed");
        }
    }

    @Test
    public void testUpdate() {
        String sql = "UPDATE temp SET age=?,name=? where id = ?";
        //执行sql
        int update = jdbcTemplate.update(sql, 18, "李四", 1);
        if (update > 0) {
            System.out.println("update successfully");
        } else {
            System.out.println("update failed");
        }
    }

    @Test
    public void testQuery() {
        //查询一个对象
        String sql = "SELECT * FROM temp WHERE id = ?";
        //通过自己实现接口的实现类完成
        Employee employeeRes = jdbcTemplate.queryForObject(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setAge(rs.getInt("age"));
                employee.setSex(rs.getString("sex"));
                return employee;
            }
        }, 2);
        //通过使用spring实现类
        Employee object = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), 2);
        System.out.println(employeeRes);
        System.out.println(object);
    }

    @Test
    public void testQueryList() {
        //查询一个集合
        String sql = "SELECT * FROM temp";
        List<Employee> employees = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        System.out.println(employees);
    }

    @Test
    public void testDelete() {
        String sql = "delete from temp where id=?";
        int update = jdbcTemplate.update(sql, 1);
        if (update > 0) {
            System.out.println("delete successfully");
        } else {
            System.out.println("delete failed");
        }
    }
    //查询单个值
    @Test
    public void testCount() {
        String sql = "select count(id) from temp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
