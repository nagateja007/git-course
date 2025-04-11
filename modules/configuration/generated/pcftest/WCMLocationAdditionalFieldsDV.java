package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton;
import pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.Remove;
import pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.entry;
import pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.entry.ExistingPolicyNamedInsured;
import pcftest.WCMLocationAdditionalFieldsDV.IndustryCode;
import pcftest.WCMLocationAdditionalFieldsDV.IndustryCode.SelectIndustryCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCMLocationAdditionalFieldsDV extends DetailViewElement {
  public final static String CHECKSUM = "39176a75bed8d8bc40845d90a95a1aa4";
  
  public WCMLocationAdditionalFieldsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ChangeLocationNamedInsuredButton getChangeLocationNamedInsuredButton() {
    return getOrCreateProperty("ChangeLocationNamedInsuredButton", "ChangeLocationNamedInsuredButton", null, pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.class);
  }
  
  public ValueElement getChangeLocationNamedInsuredLabel() {
    return getOrCreateProperty("ChangeLocationNamedInsuredLabel", "ChangeLocationNamedInsuredLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IndustryCode getIndustryCode() {
    return getOrCreateProperty("IndustryCode", "IndustryCode", null, pcftest.WCMLocationAdditionalFieldsDV.IndustryCode.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeLocationNamedInsuredButton extends ValueElement {
    public ChangeLocationNamedInsuredButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.Remove.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExistingPolicyNamedInsured getExistingPolicyNamedInsured() {
        return getOrCreateProperty("ExistingPolicyNamedInsured", "ExistingPolicyNamedInsured", null, pcftest.WCMLocationAdditionalFieldsDV.ChangeLocationNamedInsuredButton.entry.ExistingPolicyNamedInsured.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExistingPolicyNamedInsured extends ClickableActionElement {
        public ExistingPolicyNamedInsured(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IndustryCode extends BasePickerValueElement {
    public IndustryCode(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectIndustryCode getSelectIndustryCode() {
      return getOrCreateProperty("SelectIndustryCode", "SelectIndustryCode", null, pcftest.WCMLocationAdditionalFieldsDV.IndustryCode.SelectIndustryCode.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLocationAdditionalFieldsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectIndustryCode extends ClickableActionElement {
      public SelectIndustryCode(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}