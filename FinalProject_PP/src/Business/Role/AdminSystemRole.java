/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Area.Area;
import Business.Country.Country;
import Business.District.District;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Interface.Admin.System.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jiahuanli
 */
public class AdminSystemRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Area area,District district,Country country, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,account,system);
        //return null;
    }
}
