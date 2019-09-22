/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author anish
 */
import java.util.ArrayList;
public class VitalSignHistory {
    private ArrayList<VitalSigns>vitalSignHistory;
    public VitalSignHistory()
    {
        vitalSignHistory=new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalsignhistory() {
        return vitalSignHistory;
    }

    public void setVitalsignhistory(ArrayList<VitalSigns> vitalsignhistory) {
        this.vitalSignHistory = vitalsignhistory;
    }
   public VitalSigns addVitals(){
       VitalSigns vs=new VitalSigns();
       vitalSignHistory.add(vs);
       return vs;  
   }  
   
   public void deleteVitals(VitalSigns v)
   {
       vitalSignHistory.remove(v);
   }
}
