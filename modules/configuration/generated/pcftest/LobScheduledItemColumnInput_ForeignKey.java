package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.ForeignKey.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_ForeignKey extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "c06f08219ee9fbd86bb4a586744de0b5";
  
  public LobScheduledItemColumnInput_ForeignKey(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getRangeValue() {
    return getOrCreateProperty("RangeValue", "RangeValue", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}