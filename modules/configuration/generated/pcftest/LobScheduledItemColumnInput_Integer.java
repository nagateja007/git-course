package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.Integer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_Integer extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "797e99bf14a13bde2d6d390eef610fa7";
  
  public LobScheduledItemColumnInput_Integer(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getIntValue() {
    return getOrCreateProperty("IntValue", "IntValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}