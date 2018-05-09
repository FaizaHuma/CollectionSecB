
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Student_Controller {

    public ArrayList<Student>getStudentList()
    {

        ArrayList<Student>std=new ArrayList<>();
        Student st=new Student();
        Student st1=new Student();

        st.setStudentID(1101);
        st.setStudentname("faiza");

        st1.setStudentID(1102);
        st1.setStudentname("Huma");

        std.add(st);
        std.add(st1);

        return std;

    }


    public ArrayList<Computer_Student>retCompStudent()
    {
        ArrayList<Computer_Student>cst=new ArrayList<>();
        Computer_Student st=new Computer_Student();

        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","Oracle_1");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select student_id, sec from computer_student");

            st.setCompStID(rs.getInt(1));
            st.setSec(rs.getString(2));



            while(rs.next())
            {
                String sec=rs.getString(2);
                int id=rs.getInt(1);
                st.setCompStID(id);
                st.setSec(sec);

                cst.add(st);

                return cst;
            }

            con.close();


        }
        catch (Exception e)
        {

e. printStackTrace();
        }
return  cst;
    }


}
