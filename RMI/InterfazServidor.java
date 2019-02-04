import java.rmi.Remote;
import java.rmi.RemoteException;

//Interfaz que contiene los métodos del servidor que podrán ser invocados de forma remota por el cliente

public interface InterfazServidor extends Remote {
    
    
    public String registrar (String login)  throws RemoteException;
    
    public void difundirMensaje (String mensaje) throws RemoteException;
    
    public boolean desconectar (String login) throws RemoteException;
    
    
}
