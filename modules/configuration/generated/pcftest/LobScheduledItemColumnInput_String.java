package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.String.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_String extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "fb3412008d317797659336c3c4cc1b0f";
  
  public LobScheduledItemColumnInput_String(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getStringValue() {
    return getOrCreateProperty("StringValue", "StringValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}