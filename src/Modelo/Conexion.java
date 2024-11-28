package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //Configuración BD
    private String ip = "localhost"; //Ej: 127.0.0.1
    private String bd = "paises";
    private String url="jdbc:mysql://"+ip+":3306/"+bd;
    private String user="root"; //Acá debes incorporar el user del motor de bases de datos.
    private String pass="alumnos"; //Acá debes incorporar la password del motor de bases de datos.  
    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {            
        }
        return con;
    }
}
