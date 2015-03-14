package jdbc.common;
import java.sql.Connection;
import jdbc.member.ConnectionFactory;
/*
 * ��� ��������� DaoŬ����(RDB)���� ����ϰԵǴ�
 * �������� ����� �����س��� �θ�Ŭ����
 */
public class RdbDao {
	public Connection getConnection() throws Exception{
		return ConnectionFactory.getConnection();
	}
	public void releaseConnection(Connection con) throws Exception{
		ConnectionFactory.releaseConnection(con);
	}
}
