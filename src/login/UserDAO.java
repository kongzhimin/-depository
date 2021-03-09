package login;

public class UserDAO {
    public DBUtil Con= new DBUtil();
    public boolean findUser(String UserName,String UserPassword)
    {
        UserName = "admin";
        UserPassword = "123";
        System.out.println("UserName="+UserName);
        return true;
    }
}
