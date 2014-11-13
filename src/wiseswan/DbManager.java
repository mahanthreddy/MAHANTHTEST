package wiseswan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DbManager

{
	
		
	
	
	//private static Connection conn = ConnectionManager.getInstance().getConnection();
	
	public static void Insert(CreateSet set) throws ClassNotFoundException , SQLException
	
	{
			Connection conn = ConnectionManager.getInstance().getConnection();
			Class.forName("com.mysql.jdbc.Driver");
			//Connection conn = ConnectionManager.getInstance().getConnection();
			
			String sql	=	"INSERT INTO ws_question_sets (course_id,question_provider_id,question_set_name,question_set_desc,question_set_time_limit,is_free,question_set_total_marks) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			pstmt.setString(3, set.getsetname());
			pstmt.setString(4, set.getsetdesc());
			pstmt.setInt(5,Integer.parseInt(set.getsetlimit()));
			pstmt.setString(6, set.getisfree());
			pstmt.setInt(7,Integer.parseInt(set.getsettotalmarks()));
			
			
			pstmt.executeUpdate();
			
			String sqlcount = "SELECT count(*) FROM ws_question_sets";
			PreparedStatement countstmt = conn.prepareStatement(sqlcount);
			ResultSet rs	=	countstmt.executeQuery();
			
			
			int countrows = 0;
			rs.next(); 
		    countrows = rs.getInt(1);
		    
		    System.out.println(countrows);
				
			String sectionsql = "INSERT INTO ws_question_sections (question_section_id,question_set_id,question_section_name,question_section_description,question_section_time_limit,question_section_total_marks) VALUES (?,?,?,10,20,170)";
			
			PreparedStatement secstmt = conn.prepareStatement(sectionsql);
			
			secstmt.setInt(1, countrows);
			secstmt.setInt(2, countrows);
			secstmt.setString(3, set.getsetname());
		
			secstmt.executeUpdate();
			
			
			
		}
	public static ArrayList<String> Fetch() throws ClassNotFoundException , SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn2 = ConnectionManager.getInstance().getConnection();
			
			String sqlfetch	=	"SELECT * FROM ws_question_sets ORDER BY created_dt DESC LIMIT 1";
			PreparedStatement fetchstmt = conn2.prepareStatement(sqlfetch);
			ResultSet rsfetch	=	fetchstmt.executeQuery();
			ArrayList<String> fetchedval = new ArrayList<String>();
			
			rsfetch.next();
			System.out.println(rsfetch.getString(1)+" "+rsfetch.getInt(2)+" "+rsfetch.getInt(3)+" "+rsfetch.getString(4)+" "+rsfetch.getString(5)+" "+rsfetch.getInt(6)+" "+rsfetch.getString(7)+" "+rsfetch.getInt(8)+" "+rsfetch.getTimestamp(9));
			
			for (int i=1;i<10;i++)
			{
				fetchedval.add(rsfetch.getString(i));
			}
			
			return fetchedval;
		}
	
	public static void Close()
		{
		ConnectionManager.getInstance().close();
		}
	}

