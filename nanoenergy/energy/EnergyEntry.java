package nanoenergy.energy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * EMCEntry
 * 
 * Holds the breakdown of how much, and what kinds, of EMC an object has
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class EnergyEntry {

    private Map<EnergyType, Float> breakdown;


    public EnergyEntry() {

        breakdown = Collections.synchronizedMap(new HashMap<EnergyType, Float>());
    }

    public Map<EnergyType, Float> getEMCBreakDown() {

        return breakdown;
    }

    public float getEMCBreakdownByType(EnergyType EnergyType) {

        if (breakdown.containsKey(EnergyType)) {
            if (breakdown.get(EnergyType) != null) {
                return breakdown.get(EnergyType).floatValue();
            }
        }

        return -1F;
    }
}