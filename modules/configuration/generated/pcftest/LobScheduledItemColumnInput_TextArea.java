package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.TextArea.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_TextArea extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "15f43ea864667d3df6b087ed239010e7";
  
  public LobScheduledItemColumnInput_TextArea(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getTextAreaValue() {
    return getOrCreateProperty("TextAreaValue", "TextAreaValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}