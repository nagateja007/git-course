package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ActionElementWithAJAXMenu;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WCMLobScheduledItemPopup.Add;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.ExistingPolicyContact;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddFromSearch;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.OtherContact;
import pcftest.WCMLobScheduledItemPopup.AddContactsButton.entry.ContactType;
import pcftest.WCMLobScheduledItemPopup.Cancel;
import pcftest.WCMLobScheduledItemPopup.Edit;
import pcftest.WCMLobScheduledItemPopup.Remove;
import pcftest.WCMLobScheduledItemPopup.Update;
import pcftest.WCMLobScheduledItemPopup.WCMLobScheduledItemPopup_UpLink;
import pcftest.WCMLobScheduledItemPopup._Paging;
import pcftest.WCMLobScheduledItemPopup.__crumb__;
import pcftest.WCMLobScheduledItemPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCMLobScheduledItemPopup extends PCFLocation {
  public final static String CHECKSUM = "b3c259109483577f6439fda42b63a9d2";
  
  public WCMLobScheduledItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WCMLobScheduledItemPopup"));
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.WCMLobScheduledItemPopup.Add.class);
  }
  
  public AddContactsButton getAddContactsButton() {
    return getOrCreateProperty("AddContactsButton", "AddContactsButton", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.WCMLobScheduledItemPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.WCMLobScheduledItemPopup.Edit.class);
  }
  
  public LobScheduledItemsLV getLobScheduledItemsLV() {
    return getOrCreateProperty("LobScheduledItemsLV", "LobScheduledItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LobScheduledItemsLV.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.WCMLobScheduledItemPopup.Remove.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.WCMLobScheduledItemPopup.Update.class);
  }
  
  public WCMLobSchedulePopupCV getWCMLobSchedulePopupCV() {
    return getOrCreateProperty("WCMLobSchedulePopupCV", "WCMLobSchedulePopupCV", null, pcftest.WCMLobSchedulePopupCV.class);
  }
  
  public WCMLobScheduledItemPopup_UpLink getWCMLobScheduledItemPopup_UpLink() {
    return getOrCreateProperty("WCMLobScheduledItemPopup_UpLink", "WCMLobScheduledItemPopup_UpLink", null, pcftest.WCMLobScheduledItemPopup.WCMLobScheduledItemPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WCMLobScheduledItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WCMLobScheduledItemPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WCMLobScheduledItemPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddContactsButton extends ActionElementWithAJAXMenu {
    public AddContactsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public AddExistingContact getAddExistingContact() {
      return getOrCreateProperty("AddExistingContact", "AddExistingContact", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact.class);
    }
    
    public AddFromSearch getAddFromSearch() {
      return getOrCreateProperty("AddFromSearch", "AddFromSearch", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddFromSearch.class);
    }
    
    public AddOtherContact getAddOtherContact() {
      return getOrCreateProperty("AddOtherContact", "AddOtherContact", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.WCMLobScheduledItemPopup.AddContactsButton.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddExistingContact extends ClickableActionElement {
      public AddExistingContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ExistingPolicyContact getExistingPolicyContact() {
          return getOrCreateProperty("ExistingPolicyContact", "ExistingPolicyContact", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.ExistingPolicyContact.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExistingPolicyContact extends ClickableActionElement {
          public ExistingPolicyContact(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddFromSearch extends ClickableActionElement {
      public AddFromSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddOtherContact extends ClickableActionElement {
      public AddOtherContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OtherContact getOtherContact() {
          return getOrCreateProperty("OtherContact", "OtherContact", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.OtherContact.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class OtherContact extends ClickableActionElement {
          public OtherContact(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContactType getContactType() {
        return getOrCreateProperty("ContactType", "ContactType", null, pcftest.WCMLobScheduledItemPopup.AddContactsButton.entry.ContactType.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ContactType extends ClickableActionElement {
        public ContactType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCMLobScheduledItemPopup_UpLink extends ClickableActionElement {
    public WCMLobScheduledItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/WCMLobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}