import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.56.1",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("C:\\WINDOWS");
        dout.flush();
        dout.close();
        s.close();
       
    }
}
