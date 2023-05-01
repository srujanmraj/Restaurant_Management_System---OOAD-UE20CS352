package com.javatpoint.dao;  
import java.sql.ResultSet;
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Res;
  
public class ResDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Res p){  
    String sql="insert into reservation(customername,customerID,mealType) values('"+p.getName()+"',"+p.getcustID()+",'"+p.getmealType()+"')";  
    return template.update(sql);  
}  
public int update(Res p){  
	System.out.print(p);
    String sql="update reservation set customername='"+p.getName()+"', customerID="+p.getcustID()+",mealType='"+p.getmealType()+"' where reservationID="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from reservation where reservationID="+id+"";  
    return template.update(sql);  
}  
public Res getResById(int id){  
   	String sql="select * from reservation where reservationID=?";
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Res>(Res.class));  
}  
public List<Res> getReservations(){  
    return template.query("select * from reservation",new RowMapper<Res>(){  
        public Res mapRow(ResultSet rs, int row) throws SQLException {  
            Res e=new Res();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setcustID(rs.getInt(3));  
            e.setmealType(rs.getString(4));  
            return e;  
        }
    });  
}  
}  