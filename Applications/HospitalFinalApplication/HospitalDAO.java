package com.Evergent.CoreJAVA.Basava.HospitalFinalApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class HospitalDAO {

	Connection con=null;
	PreparedStatement pstmt=null;
	public int createPatient(HospitalBean obj)
	{
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=HospitalDBConnection.getConnection(); 
			  
			  String ins_str ="insert into hospital values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,obj.getpId());
			  pstmt.setString(2,obj.getpName());
			  pstmt.setString(3, obj.getProblem());
			  pstmt.setInt(4,obj.getAge());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	}
	public void showPatient(int pId)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=HospitalDBConnection.getConnection();
			String ins_str="select * from hospital where pId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, pId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	public void updatePatient(int pId, String uName)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=HospitalDBConnection.getConnection();
			String ins_str="update hospital set pName = ? where pId=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setString(1, uName);
			pstmt.setInt(2, pId);
			int rs=pstmt.executeUpdate();
			System.out.println(rs+" rows updated");
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	
	public void deletePatient(int pId)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=HospitalDBConnection.getConnection();
			String query1="delete from hospital where pId = ?";
			//PreparedStatement pstmt1=(PreparedStatement)con.prepareStatement(query1);
			pstmt=con.prepareStatement(query1);	
			pstmt.setInt(1,pId);
			int a=pstmt.executeUpdate();
			System.out.println(a+" row deleted");
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	
	public void showAllPatientDetails() {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			
			con=HospitalDBConnection.getConnection();
			String ins_str="select * from hospital";
			pstmt=con.prepareStatement(ins_str);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""+rs.getInt(4));
				}
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
}
