package aishwaryaserver;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AishwaryaServer {
    static ServerSocket server;
    static Statement stmt;
    static int port=4024;
    static String nextColumn="\t";
    static String nextRow="\n";
    static Connection con;
    
    public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException{
        //create the socket server object 
        server = new ServerSocket(port);
        //keep listens indefinitely until receives 'exit' call or program terminates
        while(true){
            System.out.println("Waiting for the client request");
            //creating socket and waiting for client connection
            Socket socket = server.accept();
            System.out.println("accepted");
            String data="";
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/network","root","aishu");
                stmt= con.createStatement();
            }
            catch(Exception e){
                //System.exit(0);
                System.out.println(e);
            }
            //read from socket to ObjectInputStream object
            ObjectInputStream read = new ObjectInputStream(socket.getInputStream());
            //convert ObjectInputStream object to String
            data = (String) read.readObject();
            
            ObjectOutputStream write = new ObjectOutputStream(socket.getOutputStream());
            //create ObjectOutputStream object
            System.out.println("Message Received: " + data);
            StringBuilder builder = new StringBuilder(data);
            if (data.charAt(0)=='-') {
                builder.deleteCharAt(0);
                stmt.executeUpdate(builder.toString());
            } else {
                data="";
                ResultSet rs=stmt.executeQuery(builder.toString());
                while(rs.next()){
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++)
                        data+=rs.getString(i)+nextColumn;
                    data+=nextRow;
                }
                System.out.println("---"+data);
                write.writeObject(data);
            }
            con.close();
            read.close();
            write.close();
            socket.close();
            if(data.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("Shutting down Socket server!!");
        //close the ServerSocket object
        server.close();
    }
}
