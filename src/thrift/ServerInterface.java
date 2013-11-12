package thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created with IntelliJ IDEA.
 * User: Marcelo Gomez
 * Date: 11/10/13
 * Time: 12:20 AM
 */

// 3
public class ServerInterface {
    // Debug variables
    private static final String LOG_TAG = "ServerInterface";
    // Parameters for connecting to the thrift server
    public static final String host = "192.168.0.109";
    public static final int    port = 7911;
    // Communication variables
    private TTransport     transport;
    private TProtocol      protocol;
    private Actions.Client client;

    // Constructor
    public ServerInterface(){
        // Init communication variables
        transport = new TSocket(host,port);
        protocol  = new TBinaryProtocol(transport);
        client    = new Actions.Client(protocol);
    }

    // Open communications with thrift server, returns boolean indicating success
    public boolean connect() {
        boolean ans = false;
        try {
            // Init connection
            transport.open();
            // Set answer to whether the connection started
            ans = transport.isOpen();
        }
        catch (TTransportException e) {
            e.printStackTrace();
        }
        return ans;
    }

    // Close communications with thrift server
    public void disconnect() {
        transport.close();
    }

    public Actions.Client getClient() {
        return this.client;
    }
}
