import java.net.*;
import java.rmi.*;
public class AddServer {
public static void main(String args[]) {
try {
AddServerImpl addServerImpl = new AddServerImpl(); //Servelimpl obj
Naming.rebind("AddServer", addServerImpl); //calling obj ..stub
}
catch(Exception e) {
System.out.println("Exception: " + e);
}
}
}
