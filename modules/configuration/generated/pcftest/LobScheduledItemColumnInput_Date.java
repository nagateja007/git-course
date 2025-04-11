package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.Date.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_Date extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "3fd512ebc7e4bf71907b916259a53384";
  
  public LobScheduledItemColumnInput_Date(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getDateValue() {
    return getOrCreateProperty("DateValue", "DateValue", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  
}