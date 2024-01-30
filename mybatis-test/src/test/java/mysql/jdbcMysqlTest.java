package mysql;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName jdbcMysqlTest
 * @description: TODO
 * @author: suhaoran
 * @date 2024年01月28日
 * @version: 1.0
 */

public class jdbcMysqlTest {

    @Test
    public void operateUserTable() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from user ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("age"));
            System.out.println(rs.getDate("birthday"));
            System.out.println("/n");
        }
    }

}
