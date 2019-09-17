import java.SQL.*;
import java.sql.DriverManager;

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mukul
 */
public class Mukki1 {
    static final string JDBC-driver="com.mysql.jdbc.Driver";
    static final string DB_URL="jdbc:mysql://Localhost/Emp";
    static final string USER="root";
    static final string pwd="root";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn =null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL,USER,PWD);
            stmt=conn.createStatement();
            string sql="SELECT id,first,last,age,FROM,employees";
            Resultset rs=stmt.executeQuery(SQL);
            while(rs.next())
            {
                int id=rs.getInt("id");
                string first=rs.getString("first");
                string last=rs.getString("last");
                int age=rs.getInt("age");
                system.out.println("ID",+id);
                system.out.println("firstname",+first);
                system.out.println("lastname",+last);
                system.out.println("age",+age);
            }
            rs.close(); stmt.close(); con.close();
        }
        catch(SQL Exception se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
                {
                e.printStackTrace();
                }
        finally{
                try
                {
                if(stmt!=null)
                    stmt.close();
                }
                catch(SQL Exception se2)
                {
                }
                try{
                if(conn!=null)
                    conn.close();
                }
                catch(SQL Exception se2)
                {
                }
                }
                }
                system.out.println("bye good bye");
                }
        }
            }
        }
        // TODO code application logic here
    }
    
}
