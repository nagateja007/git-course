package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GL7LocationDetailInputSet.Phone;
import pcftest.GL7LocationDetailInputSet.TaxLocation;
import pcftest.GL7LocationDetailInputSet.TaxLocation.SelectTaxLocation;
import pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet;
import pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.AutofillLink;
import pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry;
import pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode;
import pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode;
import pcftest.GL7LocationDetailInputSet.UnsyncedAddressInputSet;
import pcftest.GL7LocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry;
import typekey.Country;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GL7LocationDetailInputSet extends PCFElement {
  public final static String CHECKSUM = "37c8285f137d09cecfe427ed9f226843";
  
  public GL7LocationDetailInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GL7TargetedAddressInputSet getGL7TargetedAddressInputSet() {
    return getOrCreateProperty("GL7TargetedAddressInputSet", "GL7TargetedAddressInputSet", null, pcftest.GL7TargetedAddressInputSet.class);
  }
  
  public ValueElement getLocationCode() {
    return getOrCreateProperty("LocationCode", "LocationCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationName() {
    return getOrCreateProperty("LocationName", "LocationName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getNonSpecificLocation() {
    return getOrCreateProperty("NonSpecificLocation", "NonSpecificLocation", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Phone getPhone() {
    return getOrCreateProperty("Phone", "Phone", null, pcftest.GL7LocationDetailInputSet.Phone.class);
  }
  
  public TaxLocation getTaxLocation() {
    return getOrCreateProperty("TaxLocation", "TaxLocation", null, pcftest.GL7LocationDetailInputSet.TaxLocation.class);
  }
  
  public TerritoryCodeInputSet getTerritoryCodeInputSet() {
    return getOrCreateProperty("TerritoryCodeInputSet", "TerritoryCodeInputSet", null, pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.class);
  }
  
  public UnsyncedAddressInputSet getUnsyncedAddressInputSet() {
    return getOrCreateProperty("UnsyncedAddressInputSet", "UnsyncedAddressInputSet", null, pcftest.GL7LocationDetailInputSet.UnsyncedAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Phone extends PCFElement {
    public Phone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxLocation extends BasePickerValueElement {
    public TaxLocation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectTaxLocation getSelectTaxLocation() {
      return getOrCreateProperty("SelectTaxLocation", "SelectTaxLocation", null, pcftest.GL7LocationDetailInputSet.TaxLocation.SelectTaxLocation.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectTaxLocation extends ClickableActionElement {
      public SelectTaxLocation(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TerritoryCodeInputSet extends PCFElement {
    public TerritoryCodeInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AutofillLink getAutofillLink() {
      return getOrCreateProperty("AutofillLink", "AutofillLink", null, pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.AutofillLink.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AutofillLink extends ClickableActionElement {
      public AutofillLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TerritoryCode getTerritoryCode() {
        return getOrCreateProperty("TerritoryCode", "TerritoryCode", null, pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TerritoryCode extends BasePickerValueElement {
        public TerritoryCode(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectTerritoryCode getSelectTerritoryCode() {
          return getOrCreateProperty("SelectTerritoryCode", "SelectTerritoryCode", null, pcftest.GL7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsyncedAddressInputSet extends PCFElement {
    public UnsyncedAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UnsyncedCountry getUnsyncedCountry() {
      return getOrCreateProperty("UnsyncedCountry", "UnsyncedCountry", null, pcftest.GL7LocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry.class);
    }
    
    public ValueElement getUnsyncedCounty() {
      return getOrCreateProperty("UnsyncedCounty", "UnsyncedCounty", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getunsyncedAddressString() {
      return getOrCreateProperty("unsyncedAddressString", "unsyncedAddressString", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UnsyncedCountry extends SelectElement {
      public UnsyncedCountry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Country arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Country getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Country.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Country arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  
}