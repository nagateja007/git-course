package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemColumnInput.ForeignKeyWithOptionLabels.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemColumnInput_ForeignKeyWithOptionLabels extends LobScheduledItemColumnInput {
  public final static String CHECKSUM = "59ddf02620181f6b07a4abf47df1c468";
  
  public LobScheduledItemColumnInput_ForeignKeyWithOptionLabels(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getRangeValue() {
    return getOrCreateProperty("RangeValue", "RangeValue", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}