package com.nt.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nt.connection.InjectConnection;
import com.nt.dto.Employee;

public class EmpOperation implements EmployeeService {

	public boolean saveEmployee(Employee emp) {
		boolean f = false;

		try (Connection con = InjectConnection.getConnection();
				PreparedStatement pt = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");) {
			// set the query param
			pt.setInt(1, emp.getId());
			pt.setString(2, emp.getName());
			pt.setString(3, emp.getJoiningDate());
			pt.setDouble(4, emp.getSalary());
			pt.setString(5, emp.getEmail());
			pt.setString(6, emp.getPhoneNumber());
			pt.setString(7, emp.getRole());

			int count = pt.executeUpdate();
			if (count != 0) {
				System.out.println("Employee Saved successfully");
				f = true;
				;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public boolean deleteById(int id) {

		boolean f = false;

		try (Connection con = InjectConnection.getConnection();
				PreparedStatement pt = con.prepareStatement("delete from employee where id=?");) {
			// set query param
			pt.setInt(1, id);

			int count = pt.executeUpdate();
			if (count != 0) {
				System.out.println("Employee deleted successfully");
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<Employee> findAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		try (Connection con = InjectConnection.getConnection();
				PreparedStatement pt = con.prepareStatement("select * from employee");
				ResultSet rs = pt.executeQuery();) {

			while (rs.next()) {
				if (rs != null) {

					Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
							rs.getString(5), rs.getString(6), rs.getString(7));
					list.add(emp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Employee findEmployeeById(int id) {

		boolean f = false;
		Employee emp = null;

		try (Connection con = InjectConnection.getConnection();
				PreparedStatement pt = con.prepareStatement("select * from employee where id=?");
				ResultSet rs = pt.executeQuery();) {
			while (rs.next()) {
				if (rs != null) {
					emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5),
							rs.getString(6), rs.getString(7));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	public boolean updateSalary(int id, double sal) {
		boolean f = false;
		try (Connection con = InjectConnection.getConnection();
				PreparedStatement pt = con.prepareStatement("update employee set salary=?where id=?");) {
			// set query param
			pt.setDouble(1, sal);
			pt.setInt(2, id);

			int count = pt.executeUpdate();
			if (count != 0) {
				System.out.println("Employee details updated successfully");
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
