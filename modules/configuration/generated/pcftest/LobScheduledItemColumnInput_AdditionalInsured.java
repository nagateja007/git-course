package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LobScheduledItemColumnInput_AdditionalInsured.AddlInsured;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.AdditionalInsured.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_AdditionalInsured extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "c5976a69bce6daca9554caccc7ddbed2";
  
  public LobScheduledItemColumnInput_AdditionalInsured(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddlInsured getAddlInsured() {
    return getOrCreateProperty("AddlInsured", "AddlInsured", null, pcftest.LobScheduledItemColumnInput_AdditionalInsured.AddlInsured.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.AdditionalInsured.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddlInsured extends ValueElement {
    public AddlInsured(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}