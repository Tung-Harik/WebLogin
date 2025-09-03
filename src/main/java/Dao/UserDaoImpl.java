package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.User;
import Util.DBConnection;

public class UserDaoImpl implements UserDao{
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM Users";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new User(
						rs.getInt("id"),
						rs.getString("email"),
						rs.getString("username"),
						rs.getString("fullname"),
						rs.getString("password"),
						rs.getString("images"),
						rs.getInt("roleid"),
						rs.getString("phone"),
						rs.getDate("createDate")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User findById(int id) {
		String sql = "SELECT * FROM Users WHERE id = ? ";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setPassWord(rs.getString("password"));
				user.setImages(rs.getString("images"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreateDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insert(User user) {
		String sql = "INSERT INTO Users(username,password,images,fullname,email,phone, roleid, createDate) VALUES (?,?,?,?,?,?,?,?)";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			
			//ps.setInt(1, user.getId());
			ps.setString(2,  user.getUserName());
			ps.setString(3, user.getPassWord());
			ps.setString(4, user.getImages());
			ps.setString(5,  user.getFullName());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getPhone());
			ps.setInt(8, user.getRoleid());
			ps.setDate(9, user.getCreateDate());
			
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public User findByUserName(String username) {
		String sql = "SELECT * FROM Users WHERE username = ? ";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setPassWord(rs.getString("password"));
				user.setImages(rs.getString("images"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreateDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			UserDao userDao = new UserDaoImpl();
			System.out.println(userDao.findById(1));
		}catch (Exception e){
			e.printStackTrace();;
		}
	}
}
