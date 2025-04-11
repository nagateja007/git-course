package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LOBTerritoryCodeInputSet.AutofillLink;
import pcftest.LOBTerritoryCodeInputSet.entry;
import pcftest.LOBTerritoryCodeInputSet.entry.TerritoryCode;
import pcftest.LOBTerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/LOBTerritoryCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LOBTerritoryCodeInputSet extends PCFElement {
  public final static String CHECKSUM = "fb003486a84acd9ea093d83835cc9fa7";
  
  public LOBTerritoryCodeInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AutofillLink getAutofillLink() {
    return getOrCreateProperty("AutofillLink", "AutofillLink", null, pcftest.LOBTerritoryCodeInputSet.AutofillLink.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.LOBTerritoryCodeInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBTerritoryCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutofillLink extends ClickableActionElement {
    public AutofillLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBTerritoryCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TerritoryCode getTerritoryCode() {
      return getOrCreateProperty("TerritoryCode", "TerritoryCode", null, pcftest.LOBTerritoryCodeInputSet.entry.TerritoryCode.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBTerritoryCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TerritoryCode extends BasePickerValueElement {
      public TerritoryCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SelectTerritoryCode getSelectTerritoryCode() {
        return getOrCreateProperty("SelectTerritoryCode", "SelectTerritoryCode", null, pcftest.LOBTerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBTerritoryCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SelectTerritoryCode extends ClickableActionElement {
        public SelectTerritoryCode(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}