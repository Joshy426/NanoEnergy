package nanoenergy.common.core;

public class Settings {
	
	public static boolean isModPartEnabled(int i1)
	  {
		
	    int[] list1 = getSettingsInt("modPartsDisabled");
	    for (int i = 0; i < list1.length; i++)
	    {
	      if ((list1[i] == i1) && (i1 != -1))
	      {
	        return false;
	      }
	    }
	    return true;
	  }
	public static int[] getSettingsInt(String s)
	  {
	    try
	    {
	    }
	    catch (NullPointerException e)
	    {
	    }
	    return new int[0];
	  }
}
