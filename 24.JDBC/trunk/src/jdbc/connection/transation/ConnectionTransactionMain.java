package jdbc.connection.transation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.member.ConnectionFactory;

public class ConnectionTransactionMain {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String updateSqlA="update accountA set acc_balance = acc_balance - ? where acc_no=?";
		String updateSqlB="update accountB set acc_balance = acc_balance + ? where acc_no=?";
		
		String selectSqlA="select  acc_balance from accountA where acc_no=?";
		String selectSqlB="select  acc_balance from accountB where acc_no=?";
		
		try{
			con=ConnectionFactory.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(updateSqlA);
			int acc_no = 10000;
			int money  = 100000; 
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no );
			int updateRows = pstmt.executeUpdate();
			pstmt.clearParameters();
			System.out.println("1.accountA: "+acc_no+"�����¿��� "+money+ "����  ���:"+updateRows);
			pstmt.close();
			pstmt=null;
			
			pstmt=con.prepareStatement(updateSqlB); 
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no );
			updateRows=pstmt.executeUpdate();
			pstmt.close();
			pstmt=null;
			System.out.println("2.accountB: "+acc_no+"�����¿��� "+money+ "����  �Ա�:"+updateRows);
			
			pstmt=con.prepareStatement(selectSqlA);
			pstmt.setInt(1, acc_no);
			ResultSet rs=pstmt.executeQuery();
			int balanceA=0;
			if(rs.next()){
				balanceA = rs.getInt("acc_balance");
				System.out.println("3.accountA �����ܰ�:"+balanceA);
			}
			
			if(balanceA < 0){
				con.rollback();
				System.out.println("4-1.accountA �ܰ����:rollback");
			}else{
				con.commit();
				System.out.println("4-2.accountA ���� accountB ��ü����:commit");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			try {
				con.rollback();
				System.out.println("4-3.accountA ���� accountB ��ü�߿��ܹ߻�:rollback");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
		
	}

}
