/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccountpkg;

import business.personpkg.Person;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author shiba
 */
public class UserAcDirect {
    
    private ArrayList<UserAc> userAccountList;
    
    public UserAcDirect()
    {
      userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAc> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAc authenticateUser(String username, String password){
        for (UserAc ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAc addUserAccount(String username, String password, Person person, Role role){
        UserAc userAccount = new UserAc();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
         System.out.println(username);
        return userAccount;
       
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAc ua : userAccountList){
            if (ua.getUserName().equals(username))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUserAccount(UserAc userAccount)
    {
        userAccountList.remove(userAccount);
    }
    
}
