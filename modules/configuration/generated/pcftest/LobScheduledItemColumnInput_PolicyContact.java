package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LobScheduledItemColumnInput_PolicyContact.PolicyContact;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.PolicyContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_PolicyContact extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "ea217b105770c5c1e3c5bc83c65b046c";
  
  public LobScheduledItemColumnInput_PolicyContact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyContact getPolicyContact() {
    return getOrCreateProperty("PolicyContact", "PolicyContact", null, pcftest.LobScheduledItemColumnInput_PolicyContact.PolicyContact.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.PolicyContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyContact extends ValueElement {
    public PolicyContact(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}