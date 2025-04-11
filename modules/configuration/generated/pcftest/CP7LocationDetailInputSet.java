package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
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
import pcftest.CP7LocationDetailInputSet.Phone;
import pcftest.CP7LocationDetailInputSet.TaxLocation;
import pcftest.CP7LocationDetailInputSet.TaxLocation.SelectTaxLocation;
import pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet;
import pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.AutofillLink;
import pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry;
import pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode;
import pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode;
import pcftest.CP7LocationDetailInputSet.UnsyncedAddressInputSet;
import pcftest.CP7LocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry;
import typekey.Country;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CP7LocationDetailInputSet extends PCFElement {
  public final static String CHECKSUM = "c05a0f988c0c194f68c09237b945e941";
  
  public CP7LocationDetailInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLocationCode() {
    return getOrCreateProperty("LocationCode", "LocationCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationName() {
    return getOrCreateProperty("LocationName", "LocationName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Phone getPhone() {
    return getOrCreateProperty("Phone", "Phone", null, pcftest.CP7LocationDetailInputSet.Phone.class);
  }
  
  public TaxLocation getTaxLocation() {
    return getOrCreateProperty("TaxLocation", "TaxLocation", null, pcftest.CP7LocationDetailInputSet.TaxLocation.class);
  }
  
  public TerritoryCodeInputSet getTerritoryCodeInputSet() {
    return getOrCreateProperty("TerritoryCodeInputSet", "TerritoryCodeInputSet", null, pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.class);
  }
  
  public UnsyncedAddressInputSet getUnsyncedAddressInputSet() {
    return getOrCreateProperty("UnsyncedAddressInputSet", "UnsyncedAddressInputSet", null, pcftest.CP7LocationDetailInputSet.UnsyncedAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Phone extends PCFElement {
    public Phone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxLocation extends BasePickerValueElement {
    public TaxLocation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectTaxLocation getSelectTaxLocation() {
      return getOrCreateProperty("SelectTaxLocation", "SelectTaxLocation", null, pcftest.CP7LocationDetailInputSet.TaxLocation.SelectTaxLocation.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TerritoryCodeInputSet extends PCFElement {
    public TerritoryCodeInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AutofillLink getAutofillLink() {
      return getOrCreateProperty("AutofillLink", "AutofillLink", null, pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.AutofillLink.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AutofillLink extends ClickableActionElement {
      public AutofillLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TerritoryCode getTerritoryCode() {
        return getOrCreateProperty("TerritoryCode", "TerritoryCode", null, pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TerritoryCode extends BasePickerValueElement {
        public TerritoryCode(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectTerritoryCode getSelectTerritoryCode() {
          return getOrCreateProperty("SelectTerritoryCode", "SelectTerritoryCode", null, pcftest.CP7LocationDetailInputSet.TerritoryCodeInputSet.entry.TerritoryCode.SelectTerritoryCode.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsyncedAddressInputSet extends PCFElement {
    public UnsyncedAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UnsyncedCountry getUnsyncedCountry() {
      return getOrCreateProperty("UnsyncedCountry", "UnsyncedCountry", null, pcftest.CP7LocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry.class);
    }
    
    public ValueElement getUnsyncedCounty() {
      return getOrCreateProperty("UnsyncedCounty", "UnsyncedCounty", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getunsyncedAddressString() {
      return getOrCreateProperty("unsyncedAddressString", "unsyncedAddressString", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/cp7/policy/CP7LocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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