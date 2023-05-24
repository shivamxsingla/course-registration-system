/**
 * 
 */
package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.flipkart.constant.ModeOfPaymentConstant;
import com.flipkart.constant.SQLQueriesConstant;
import com.flipkart.service.PaymentOperation;
import com.flipkart.utils.DBUtil;

/**
 * @author shivam.singla
 *
 */
@SuppressWarnings("unused")
public class PaymentDaoOperation implements PaymentDaoInterface {
	private static Logger logger = Logger.getLogger(NotificationDaoOperation.class);
	private static volatile PaymentDaoOperation instance = null;
	
	public static Object getInstance() {
		if(instance==null)
		{
			synchronized(PaymentDaoOperation.class){
				instance=new PaymentDaoOperation();
			}
		}
		return instance;
	}
	
	public void savePayment(String sid, int amount, ModeOfPaymentConstant mode, String creds) {
		Connection conn = DBUtil.getConnection();
		try
		{
			PreparedStatement insertPayment = conn.prepareStatement(SQLQueriesConstant.INSERT_PAYMENT);
			int id = generateId();
			if (id == -1)
				return;
			insertPayment.setInt(1, id);
			insertPayment.setString(2, sid);
			insertPayment.setInt(3, amount);
			insertPayment.setString(4, ModeOfPaymentConstant.getStringModeOfPayment(mode) );
			insertPayment.setString(5, creds);
			insertPayment.executeUpdate();
		}
		catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
		}
	};
	
	public int generateId()
	{
		Connection conn = DBUtil.getConnection();
		int paymentId = 0;
		try
		{
			PreparedStatement getAllpayment = conn.prepareStatement("select * from payment");
			ResultSet result = getAllpayment.executeQuery();
			int maxId = 0;
			
			while (result.next())
			{
				int id = result.getInt("id");
				if (id > maxId)
					maxId =  id;
			}
			
			paymentId = maxId+1;
			return paymentId;
		}
		catch(SQLException e)
		{
			logger.error(e.getMessage());
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
		}
		return paymentId;
	}
	

}
