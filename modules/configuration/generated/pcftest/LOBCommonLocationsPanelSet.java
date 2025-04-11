package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.AddressHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.InSyncHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocationCodeHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocationNameHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.PrimaryLocationHeader;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV._ListPaging;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.Address;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.Loc;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.LocationCode;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.LocationName;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.PrimaryLocation;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry._Select;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry._ViewDetail;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.PreferredCoverageCurrencySelectorRef;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addAllLocationsButton;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton.entry.UnassignedAccountLocation;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.newLocationButton;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.removeLocationButton;
import pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.setToPrimary;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LOBCommonLocationsPanelSet extends PCFElement {
  public final static String CHECKSUM = "4968ff1c13972b8822e9887a19398acd";
  
  public LOBCommonLocationsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LocationsEdit_DP getLocationsEdit_DP() {
    return getOrCreateProperty("LocationsEdit_DP", "LocationsEdit_DP", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.class);
  }
  
  public LocationsEdit_DP_tb getLocationsEdit_DP_tb() {
    return getOrCreateProperty("LocationsEdit_DP_tb", "LocationsEdit_DP_tb", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationsEdit_DP extends PCFElement {
    public LocationsEdit_DP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LOBCommonLocationDetailCV getLOBCommonLocationDetailCV() {
      return getOrCreateProperty("LOBCommonLocationDetailCV", "LOBCommonLocationDetailCV", null, pcftest.LOBCommonLocationDetailCV.class);
    }
    
    public LocationsEdit_LV getLocationsEdit_LV() {
      return getOrCreateProperty("LocationsEdit_LV", "LocationsEdit_LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.class);
    }
    
    public PreferredCoverageCurrencySelectorRef getPreferredCoverageCurrencySelectorRef() {
      return getOrCreateProperty("PreferredCoverageCurrencySelectorRef", "PreferredCoverageCurrencySelectorRef", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.PreferredCoverageCurrencySelectorRef.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationsEdit_LV extends PCFElement {
      public LocationsEdit_LV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressHeader getAddressHeader() {
        return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.AddressHeader.class);
      }
      
      public InSyncHeader getInSyncHeader() {
        return getOrCreateProperty("InSyncHeader", "InSyncHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.InSyncHeader.class);
      }
      
      public LocHeader getLocHeader() {
        return getOrCreateProperty("LocHeader", "LocHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocHeader.class);
      }
      
      public LocationCodeHeader getLocationCodeHeader() {
        return getOrCreateProperty("LocationCodeHeader", "LocationCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocationCodeHeader.class);
      }
      
      public LocationNameHeader getLocationNameHeader() {
        return getOrCreateProperty("LocationNameHeader", "LocationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.LocationNameHeader.class);
      }
      
      public PrimaryLocationHeader getPrimaryLocationHeader() {
        return getOrCreateProperty("PrimaryLocationHeader", "PrimaryLocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.PrimaryLocationHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddressHeader extends ValueElement {
        public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InSyncHeader extends ValueElement {
        public InSyncHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LocHeader extends ValueElement {
        public LocHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LocationCodeHeader extends ValueElement {
        public LocationCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LocationNameHeader extends ValueElement {
        public LocationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PrimaryLocationHeader extends ValueElement {
        public PrimaryLocationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Address getAddress() {
          return getOrCreateProperty("Address", "Address", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.Address.class);
        }
        
        public BooleanValueElement getInSync() {
          return getOrCreateProperty("InSync", "InSync", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public Loc getLoc() {
          return getOrCreateProperty("Loc", "Loc", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.Loc.class);
        }
        
        public LocationCode getLocationCode() {
          return getOrCreateProperty("LocationCode", "LocationCode", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.LocationCode.class);
        }
        
        public LocationName getLocationName() {
          return getOrCreateProperty("LocationName", "LocationName", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.LocationName.class);
        }
        
        public PrimaryLocation getPrimaryLocation() {
          return getOrCreateProperty("PrimaryLocation", "PrimaryLocation", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry.PrimaryLocation.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP.LocationsEdit_LV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Address extends ValueElement {
          public Address(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Loc extends ValueElement {
          public Loc(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class LocationCode extends ValueElement {
          public LocationCode(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class LocationName extends ValueElement {
          public LocationName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PrimaryLocation extends RadioButtonValueElement {
          public PrimaryLocation(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PreferredCoverageCurrencySelectorRef extends PCFElement {
      public PreferredCoverageCurrencySelectorRef(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationsEdit_DP_tb extends PCFElement {
    public LocationsEdit_DP_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public addAllLocationsButton getaddAllLocationsButton() {
      return getOrCreateProperty("addAllLocationsButton", "addAllLocationsButton", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addAllLocationsButton.class);
    }
    
    public addLocationButton getaddLocationButton() {
      return getOrCreateProperty("addLocationButton", "addLocationButton", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton.class);
    }
    
    public newLocationButton getnewLocationButton() {
      return getOrCreateProperty("newLocationButton", "newLocationButton", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.newLocationButton.class);
    }
    
    public removeLocationButton getremoveLocationButton() {
      return getOrCreateProperty("removeLocationButton", "removeLocationButton", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.removeLocationButton.class);
    }
    
    public setToPrimary getsetToPrimary() {
      return getOrCreateProperty("setToPrimary", "setToPrimary", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.setToPrimary.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class addAllLocationsButton extends ClickableActionElement {
      public addAllLocationsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class addLocationButton extends ClickableActionElement {
      public addLocationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UnassignedAccountLocation getUnassignedAccountLocation() {
          return getOrCreateProperty("UnassignedAccountLocation", "UnassignedAccountLocation", null, pcftest.LOBCommonLocationsPanelSet.LocationsEdit_DP_tb.addLocationButton.entry.UnassignedAccountLocation.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class UnassignedAccountLocation extends ClickableActionElement {
          public UnassignedAccountLocation(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class newLocationButton extends ClickableActionElement {
      public newLocationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class removeLocationButton extends ClickableActionElement {
      public removeLocationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class setToPrimary extends ClickableActionElement {
      public setToPrimary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}