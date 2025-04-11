package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.Boolean.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_Boolean extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "00b28735d941d85b973df7de4704f858";
  
  public LobScheduledItemColumnInput_Boolean(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckboxValueElement getBoolValue() {
    return getOrCreateProperty("BoolValue", "BoolValue", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  
}