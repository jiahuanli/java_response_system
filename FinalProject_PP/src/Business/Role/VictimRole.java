/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Area.Area;
import Business.Country.Country;
import Business.District.District;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Interface.Victim.VictimWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author jiahuanli
 */
public class VictimRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Area area,District district,Country country, EcoSystem system) {
        return new VictimWorkAreaJPanel(userProcessContainer,account,area,district);
    }
    
}
