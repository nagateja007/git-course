package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.IntegerRange.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_IntegerRange extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "8de81eaff5ff378030272416d560e7f7";
  
  public LobScheduledItemColumnInput_IntegerRange(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getIntRangeValue() {
    return getOrCreateProperty("IntRangeValue", "IntRangeValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}