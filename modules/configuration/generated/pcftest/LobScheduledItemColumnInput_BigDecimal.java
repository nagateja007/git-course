package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.BigDecimal.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_BigDecimal extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "a79d7f2b53ad43742f75674646ff7aaa";
  
  public LobScheduledItemColumnInput_BigDecimal(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDecimalValue() {
    return getOrCreateProperty("DecimalValue", "DecimalValue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}