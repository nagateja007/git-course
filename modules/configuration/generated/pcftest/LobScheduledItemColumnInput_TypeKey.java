package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.TypeKey.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_TypeKey extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "e5ed0d9f08a8b37a806c692b9c5e523e";
  
  public LobScheduledItemColumnInput_TypeKey(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getRangeValue() {
    return getOrCreateProperty("RangeValue", "RangeValue", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}