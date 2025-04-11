package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.AutoNumber.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_AutoNumber extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "882732099dc4ee3b43133c0490344076";
  
  public LobScheduledItemColumnInput_AutoNumber(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAutoNumber() {
    return getOrCreateProperty("AutoNumber", "AutoNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}