package join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loginchk {
String id;
String pw;

public Loginchk(String id, String pw) {
	super();
	this.id = id;
	this.pw = pw;
}

@Override
public String toString() {
	return "Loginchk [id=" + id + ", pw=" + pw + "]";
}


}
