package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.Option.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_Option extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "be85c54a35ed306a55888606475bb8f3";
  
  public LobScheduledItemColumnInput_Option(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getRangeValue() {
    return getOrCreateProperty("RangeValue", "RangeValue", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}