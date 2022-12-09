/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business1;


import Business.Org.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author tejageetla
 */
public class Ecosystem extends Organization{
 
   private ArrayList<Network> networkList;
   private static Ecosystem ecoSystem;
   private ArrayList<NeedHelp> helpList;
    
   public Ecosystem()
   {
       super(null);
       networkList = new ArrayList<>();
       helpList = new ArrayList<>();
      
   }
   
   public static Ecosystem getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new Ecosystem();
    }
    return ecoSystem;
   }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
    public NeedHelp addNeedHelp()
    {
        NeedHelp needHelp = new NeedHelp();
        helpList.add(needHelp);
        return needHelp;
    }
    
    public void deleteHelp(NeedHelp needHelp)
    {
        helpList.remove(needHelp);
    }

    public ArrayList<NeedHelp> getHelpList() {
        return helpList;
    }
    
    
    
}
