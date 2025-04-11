package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GL7LocationDetailCV.AccountLocationUpToDateDV;
import pcftest.GL7LocationDetailCV.AccountLocationUpToDateDV.SynchronizedLink;
import pcftest.GL7LocationDetailCV.AdditionalCoveragesCardTab;
import pcftest.GL7LocationDetailCV.AdditionalInsuredsCardTab;
import pcftest.GL7LocationDetailCV.DetailsCardTab;
import pcftest.GL7LocationDetailCV.ExclusionsAndConditionsCardTab;
import pcftest.GL7LocationDetailCV.GL7AdditionalInsuredsPanelSet;
import pcftest.GL7LocationDetailCV.LocationDetailDV;
import pcftest.GL7LocationDetailCV.SublineHeader;
import pcftest.GL7LocationDetailCV.SublinePropertiesPanel;
import pcftest.GL7LocationDetailCV.SublineSelectionHeader;
import pcftest.GL7LocationDetailCV._ListPaging;
import pcftest.GL7LocationDetailCV.entry._Select;
import pcftest.GL7LocationDetailCV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GL7LocationDetailCV extends PCFElement {
  public final static String CHECKSUM = "5910a8ab0bd8ef84a8b44a5bdb5ad48a";
  
  public GL7LocationDetailCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountLocationUpToDateDV getAccountLocationUpToDateDV() {
    return getOrCreateProperty("AccountLocationUpToDateDV", "AccountLocationUpToDateDV", null, pcftest.GL7LocationDetailCV.AccountLocationUpToDateDV.class);
  }
  
  public AdditionalCoveragesCardTab getAdditionalCoveragesCardTab() {
    return getOrCreateProperty("AdditionalCoveragesCardTab", "AdditionalCoveragesCardTab", null, pcftest.GL7LocationDetailCV.AdditionalCoveragesCardTab.class);
  }
  
  public AdditionalInsuredsCardTab getAdditionalInsuredsCardTab() {
    return getOrCreateProperty("AdditionalInsuredsCardTab", "AdditionalInsuredsCardTab", null, pcftest.GL7LocationDetailCV.AdditionalInsuredsCardTab.class);
  }
  
  public DetailsCardTab getDetailsCardTab() {
    return getOrCreateProperty("DetailsCardTab", "DetailsCardTab", null, pcftest.GL7LocationDetailCV.DetailsCardTab.class);
  }
  
  public ExclusionsAndConditionsCardTab getExclusionsAndConditionsCardTab() {
    return getOrCreateProperty("ExclusionsAndConditionsCardTab", "ExclusionsAndConditionsCardTab", null, pcftest.GL7LocationDetailCV.ExclusionsAndConditionsCardTab.class);
  }
  
  public GL7AdditionalCoveragesPerSublinePanelSet getGL7AdditionalCoveragesPerSublinePanelSet() {
    return getOrCreateProperty("GL7AdditionalCoveragesPerSublinePanelSet", "GL7AdditionalCoveragesPerSublinePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.GL7AdditionalCoveragesPerSublinePanelSet.class);
  }
  
  public GL7AdditionalInsuredsPanelSet getGL7AdditionalInsuredsPanelSet() {
    return getOrCreateProperty("GL7AdditionalInsuredsPanelSet", "GL7AdditionalInsuredsPanelSet", null, pcftest.GL7LocationDetailCV.GL7AdditionalInsuredsPanelSet.class);
  }
  
  public GL7ExclusionsAndConditionsPerSublinePanelSet getGL7ExclusionsAndConditionsPerSublinePanelSet() {
    return getOrCreateProperty("GL7ExclusionsAndConditionsPerSublinePanelSet", "GL7ExclusionsAndConditionsPerSublinePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.GL7ExclusionsAndConditionsPerSublinePanelSet.class);
  }
  
  public LocationDetailDV getLocationDetailDV() {
    return getOrCreateProperty("LocationDetailDV", "LocationDetailDV", null, pcftest.GL7LocationDetailCV.LocationDetailDV.class);
  }
  
  public SublineHeader getSublineHeader() {
    return getOrCreateProperty("SublineHeader", "SublineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GL7LocationDetailCV.SublineHeader.class);
  }
  
  public SublinePropertiesPanel getSublinePropertiesPanel() {
    return getOrCreateProperty("SublinePropertiesPanel", "SublinePropertiesPanel", null, pcftest.GL7LocationDetailCV.SublinePropertiesPanel.class);
  }
  
  public SublineSelectionHeader getSublineSelectionHeader() {
    return getOrCreateProperty("SublineSelectionHeader", "SublineSelectionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.GL7LocationDetailCV.SublineSelectionHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<pcftest.GL7LocationDetailCV.entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.GL7LocationDetailCV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.GL7LocationDetailCV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountLocationUpToDateDV extends DetailViewElement {
    public AccountLocationUpToDateDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SynchronizedLink getSynchronizedLink() {
      return getOrCreateProperty("SynchronizedLink", "SynchronizedLink", null, pcftest.GL7LocationDetailCV.AccountLocationUpToDateDV.SynchronizedLink.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SynchronizedLink extends ClickableActionElement {
      public SynchronizedLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalCoveragesCardTab extends ClickableActionElement {
    public AdditionalCoveragesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInsuredsCardTab extends ClickableActionElement {
    public AdditionalInsuredsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailsCardTab extends ClickableActionElement {
    public DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExclusionsAndConditionsCardTab extends ClickableActionElement {
    public ExclusionsAndConditionsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GL7AdditionalInsuredsPanelSet extends PCFElement {
    public GL7AdditionalInsuredsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GL7AdditionalCoveragesPerSublinePanelSet getGL7AdditionalCoveragesPerSublinePanelSet() {
      return getOrCreateProperty("GL7AdditionalCoveragesPerSublinePanelSet", "GL7AdditionalCoveragesPerSublinePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.GL7AdditionalCoveragesPerSublinePanelSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationDetailDV extends DetailViewElement {
    public LocationDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GL7LocationDetailInputSet getGL7LocationDetailInputSet() {
      return getOrCreateProperty("GL7LocationDetailInputSet", "GL7LocationDetailInputSet", null, pcftest.GL7LocationDetailInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SublineHeader extends ValueElement {
    public SublineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SublinePropertiesPanel extends PCFElement {
    public SublinePropertiesPanel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.GL7LocationDetailCV.SublinePropertiesPanel.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.GL7LocationDetailCV.SublinePropertiesPanel.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LobEntityDV getLobEntityDV() {
        return getOrCreateProperty("LobEntityDV", "LobEntityDV", null, pcftest.LobEntityDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SublineSelectionHeader extends ValueElement {
    public SublineSelectionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getSubline() {
      return getOrCreateProperty("Subline", "Subline", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getSublineSelection() {
      return getOrCreateProperty("SublineSelection", "SublineSelection", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.GL7LocationDetailCV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.GL7LocationDetailCV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/gl7/policy/GL7LocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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