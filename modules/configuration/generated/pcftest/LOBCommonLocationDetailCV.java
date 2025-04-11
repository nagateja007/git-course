package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LOBCommonLocationDetailCV.AccountLocationUpToDateDV;
import pcftest.LOBCommonLocationDetailCV.AccountLocationUpToDateDV.SynchronizedLink;
import pcftest.LOBCommonLocationDetailCV.AdditionalCoveragesCardTab;
import pcftest.LOBCommonLocationDetailCV.GeneralInfoCardTab;
import pcftest.LOBCommonLocationDetailCV.LocationDetailDV;
import pcftest.LOBCommonLocationDetailCV.LocationQuestionsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LOBCommonLocationDetailCV extends PCFElement {
  public final static String CHECKSUM = "980e63fc09bb288f482a8ddb93a90d6e";
  
  public LOBCommonLocationDetailCV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AccountLocationUpToDateDV getAccountLocationUpToDateDV() {
    return getOrCreateProperty("AccountLocationUpToDateDV", "AccountLocationUpToDateDV", null, pcftest.LOBCommonLocationDetailCV.AccountLocationUpToDateDV.class);
  }
  
  public AdditionalCoveragesCardTab getAdditionalCoveragesCardTab() {
    return getOrCreateProperty("AdditionalCoveragesCardTab", "AdditionalCoveragesCardTab", null, pcftest.LOBCommonLocationDetailCV.AdditionalCoveragesCardTab.class);
  }
  
  public GeneralInfoCardTab getGeneralInfoCardTab() {
    return getOrCreateProperty("GeneralInfoCardTab", "GeneralInfoCardTab", null, pcftest.LOBCommonLocationDetailCV.GeneralInfoCardTab.class);
  }
  
  public LocationDetailDV getLocationDetailDV() {
    return getOrCreateProperty("LocationDetailDV", "LocationDetailDV", null, pcftest.LOBCommonLocationDetailCV.LocationDetailDV.class);
  }
  
  public LocationQuestionsCardTab getLocationQuestionsCardTab() {
    return getOrCreateProperty("LocationQuestionsCardTab", "LocationQuestionsCardTab", null, pcftest.LOBCommonLocationDetailCV.LocationQuestionsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountLocationUpToDateDV extends DetailViewElement {
    public AccountLocationUpToDateDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SynchronizedLink getSynchronizedLink() {
      return getOrCreateProperty("SynchronizedLink", "SynchronizedLink", null, pcftest.LOBCommonLocationDetailCV.AccountLocationUpToDateDV.SynchronizedLink.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalCoveragesCardTab extends ClickableActionElement {
    public AdditionalCoveragesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GeneralInfoCardTab extends ClickableActionElement {
    public GeneralInfoCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationDetailDV extends DetailViewElement {
    public LocationDetailDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LOBCommonLocationDetailInputSet getLOBCommonLocationDetailInputSet() {
      return getOrCreateProperty("LOBCommonLocationDetailInputSet", "LOBCommonLocationDetailInputSet", null, pcftest.LOBCommonLocationDetailInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/LOBCommonLocationDetailCV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationQuestionsCardTab extends ClickableActionElement {
    public LocationQuestionsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}