package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LOBCommonLocationDetailInputSet.Phone;
import pcftest.LOBCommonLocationDetailInputSet.TaxLocation;
import pcftest.LOBCommonLocationDetailInputSet.TaxLocation.SelectTaxLocation;
import pcftest.LOBCommonLocationDetailInputSet.UnsyncedAddressInputSet;
import pcftest.LOBCommonLocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry;
import typekey.Country;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LOBCommonLocationDetailInputSet extends PCFElement {
  public final static String CHECKSUM = "5eba37fe7635b5e7fddf3ba5bd81e475";
  
  public LOBCommonLocationDetailInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LOBTerritoryCodeInputSet getLOBTerritoryCodeInputSet() {
    return getOrCreateProperty("LOBTerritoryCodeInputSet", "LOBTerritoryCodeInputSet", null, pcftest.LOBTerritoryCodeInputSet.class);
  }
  
  public ValueElement getLocationCode() {
    return getOrCreateProperty("LocationCode", "LocationCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationName() {
    return getOrCreateProperty("LocationName", "LocationName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Phone getPhone() {
    return getOrCreateProperty("Phone", "Phone", null, pcftest.LOBCommonLocationDetailInputSet.Phone.class);
  }
  
  public TaxLocation getTaxLocation() {
    return getOrCreateProperty("TaxLocation", "TaxLocation", null, pcftest.LOBCommonLocationDetailInputSet.TaxLocation.class);
  }
  
  public UnsyncedAddressInputSet getUnsyncedAddressInputSet() {
    return getOrCreateProperty("UnsyncedAddressInputSet", "UnsyncedAddressInputSet", null, pcftest.LOBCommonLocationDetailInputSet.UnsyncedAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Phone extends PCFElement {
    public Phone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxLocation extends BasePickerValueElement {
    public TaxLocation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectTaxLocation getSelectTaxLocation() {
      return getOrCreateProperty("SelectTaxLocation", "SelectTaxLocation", null, pcftest.LOBCommonLocationDetailInputSet.TaxLocation.SelectTaxLocation.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsyncedAddressInputSet extends PCFElement {
    public UnsyncedAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UnsyncedCountry getUnsyncedCountry() {
      return getOrCreateProperty("UnsyncedCountry", "UnsyncedCountry", null, pcftest.LOBCommonLocationDetailInputSet.UnsyncedAddressInputSet.UnsyncedCountry.class);
    }
    
    public ValueElement getUnsyncedCounty() {
      return getOrCreateProperty("UnsyncedCounty", "UnsyncedCounty", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getunsyncedAddressString() {
      return getOrCreateProperty("unsyncedAddressString", "unsyncedAddressString", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationDetailInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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