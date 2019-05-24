package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.chainsys.model.Connectionutil;

public class UserDao {
	static final Logger log=Logger.getLogger(UserDao.class);
	public boolean Logindetails(User user) {
		
		boolean status = false;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into logindetails(customer_id,password) values(?,?)";
			log.debug("karthi"+sql);

			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getCus_id());
			ps.setString(2, user.getPassword());

			ps.executeUpdate();
			status = true;
			Connectionutil.close(connection, ps, null);
		} catch (Exception e) {
			System.out.println(e);
			log.error("Exception caught"+e.getMessage());
			
		}
		return status;
	}

	public User Profiledetails(User user) {
		User user1 = null;
		try {
			Connection connection = Connectionutil.getconnection();
			System.out.println(user.getCus_id());
			String sql = "select circle.circle_no,circle.circle_name,circle.division_name,Consumer.cus_id as c_id,Consumer.cus_name as c_name,Consumer.cus_age as c_age,Consumer.cus_gender as c_gender,Consumer.cus_email as c_email,Consumer.cus_address as c_address,Consumer.cus_pincode as c_pin,Consumer.cus_phonenumber as c_phone,Consumer.cus_aadharnumber as c_aadhar from circle inner join Consumer on circle.circle_cus_id=consumer.cus_id where consumer.cus_id=?";
			log.debug("karthi"+sql);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getCus_id());
		log.debug("id" + user.getCus_id());

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				user1 = new User();
				user1.setCircle_no(rs.getInt("circle_no"));
		//		log.debug("ciS" + user1.getCus_id());
				user1.setCircle_name(rs.getString("circle_name"));
				user1.setDivision_name(rs.getString("division_name"));
				user1.setCus_id(rs.getInt("c_id"));
	//			System.out.println("ciS" + user1.getCus_id());

				user1.setCus_name(rs.getString("c_name"));
				user1.setCus_age(rs.getInt("c_age"));
				user1.setCus_gender(rs.getString("c_gender"));
				user1.setCus_email(rs.getString("c_email"));
				user1.setCus_address((rs.getString("c_address")));
				user1.setCus_pincode(rs.getInt("c_pin"));
				user1.setCus_phonenumber(rs.getLong("c_phone"));
				user1.setCus_aadharnumber(rs.getLong("c_aadhar"));
				Connectionutil.close(connection, ps, rs);
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.error("Exception caught"+e.getMessage());
		}

		return user1;

	}

	public User Meterdetails(User user) {
		User user1 = null;
		try {
			Connection connection = Connectionutil.getconnection();
			System.out.println(user.getCus_id());
			String sql = "select met_no,met_unit,met_month,met_amount from meter where meter_cus_id_seq=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getCus_id());
			System.out.println(user.getMet_no());
			// ps.executeUpdate();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user1 = new User();
				user1.setMet_no(rs.getInt("met_no"));
				System.out.println(user1.getMet_no());

				user1.setMet_unit(rs.getInt("met_unit"));
				user1.setMet_month(rs.getString("met_month"));
				user1.setMet_amount(rs.getInt("met_amount"));
				Connectionutil.close(connection, ps, rs);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return user1;

	}

	public boolean Circledetails(User user) {
		boolean status = false;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into circle(circle_cus_id,circle_no,circle_name,division_name) values(cir_id_seq.NEXTVAL,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, user.getCircle_no());
			ps.setString(2, user.getCircle_name());
			ps.setString(3, user.getDivision_name());
			ps.executeUpdate();
			status = true;
			Connectionutil.close(connection, ps, null);
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public boolean Consumer(User user) {
		boolean status = false;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into consumer(cus_id,cus_name,cus_age,cus_gender,cus_email,cus_address,cus_pincode,cus_phonenumber,cus_aadharnumber) values(cus_id_sequence.NEXTVAL,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, user.getCus_name());
			System.out.println("name=" + user.getCus_name());
			ps.setInt(2, user.getCus_age());
			ps.setString(3, user.getCus_gender());
			ps.setString(4, user.getCus_email());
			ps.setString(5, user.getCus_address());
			ps.setInt(6, user.getCus_pincode());
			ps.setLong(7, user.getCus_phonenumber());
			ps.setLong(8, user.getCus_aadharnumber());
			ps.executeUpdate();
			status = true;
		
			Connectionutil.close(connection, ps, null);
	
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public boolean Meter(User user) {
		boolean status = false;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "insert into meter(meter_cus_id_seq,met_no,met_unit,met_month,met_amount) values(met_cus_id_seq.NEXTVAL,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, user.getMet_no());
		//	System.out.println("name=" + user.getMet_no());
			ps.setInt(2, user.getMet_unit());
			ps.setString(3, user.getMet_month());
			ps.setInt(4, user.getMet_amount());
			ps.executeUpdate();
			status = true;
			Connectionutil.close(connection, ps, null);
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public User getAllRecords() {
		
		User user = null;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "select circle_no,circle_name,division_name from (select circle_no,circle_name,division_name, rownum  from circle order by circle_no desc ) where rownum<2";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setCircle_no(rs.getInt("circle_no"));
				System.out.println(user.getCircle_no());
				user.setCircle_name(rs.getString("circle_name"));
				user.setDivision_name(rs.getString("division_name"));
				Connectionutil.close(connection, ps, rs);
			}
			System.out.println(user.getCircle_no());
		} catch (Exception e) {
			System.out.println(e);
		}

		return user;
	}

	public User getAllRecords1() {

		User user = null;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "select cus_id,cus_name,cus_age,cus_gender,cus_email,cus_address,cus_pincode,cus_phonenumber,cus_aadharnumber from (select  cus_id,cus_name,cus_age,cus_gender,cus_email,cus_address,cus_pincode,cus_phonenumber,cus_aadharnumber, rownum  from consumer order by cus_id desc ) where rownum<2";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setCus_id(rs.getInt("cus_id"));
				user.setCus_name(rs.getString("cus_name"));
				user.setCus_age(rs.getInt("cus_age"));
				user.setCus_gender(rs.getString("cus_gender"));
				user.setCus_email(rs.getString("cus_email"));
				user.setCus_address((rs.getString("cus_address")));
				user.setCus_pincode(rs.getInt("cus_pincode"));
				user.setCus_phonenumber(rs.getLong("cus_phonenumber"));
				user.setCus_aadharnumber(rs.getLong("cus_aadharnumber"));
				Connectionutil.close(connection, ps, rs);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return user;
	}

	public User getAllRecords2() {

		User user = null;
		try {
			Connection connection = Connectionutil.getconnection();

			String sql = "select met_no,met_unit,met_month,met_amount from (select met_no,met_unit,met_month,met_amount, rownum  from meter order by met_no desc ) where rownum<2";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setMet_no(rs.getInt("met_no"));
				user.setMet_unit(rs.getInt("met_unit"));
				user.setMet_month(rs.getString("met_month"));
				user.setMet_amount(rs.getInt("met_amount"));
				Connectionutil.close(connection, ps, rs);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return user;
	}

}
