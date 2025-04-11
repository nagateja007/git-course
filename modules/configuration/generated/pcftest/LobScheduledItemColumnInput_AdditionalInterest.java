package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LobScheduledItemColumnInput_AdditionalInterest.AddlInterest;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.AdditionalInterest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_AdditionalInterest extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "88af071b6e518a35c49d1ca701593907";
  
  public LobScheduledItemColumnInput_AdditionalInterest(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddlInterest getAddlInterest() {
    return getOrCreateProperty("AddlInterest", "AddlInterest", null, pcftest.LobScheduledItemColumnInput_AdditionalInterest.AddlInterest.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.AdditionalInterest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddlInterest extends ValueElement {
    public AddlInterest(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}