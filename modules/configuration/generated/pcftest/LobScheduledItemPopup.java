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
import pcftest.LobScheduledItemPopup.Add;
import pcftest.LobScheduledItemPopup.AddContactsButton;
import pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact;
import pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.ExistingAdditionalInsured;
import pcftest.LobScheduledItemPopup.AddContactsButton.AddFromSearch;
import pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact;
import pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.OtherContact;
import pcftest.LobScheduledItemPopup.AddContactsButton.entry.ContactType;
import pcftest.LobScheduledItemPopup.Cancel;
import pcftest.LobScheduledItemPopup.Edit;
import pcftest.LobScheduledItemPopup.LobScheduledItemPopup_UpLink;
import pcftest.LobScheduledItemPopup.Remove;
import pcftest.LobScheduledItemPopup.Update;
import pcftest.LobScheduledItemPopup._Paging;
import pcftest.LobScheduledItemPopup.__crumb__;
import pcftest.LobScheduledItemPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemPopup extends PCFLocation {
  public final static String CHECKSUM = "56a49df61b90f4c2dfd87b253b0e13b6";
  
  public LobScheduledItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LobScheduledItemPopup"));
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.LobScheduledItemPopup.Add.class);
  }
  
  public AddContactsButton getAddContactsButton() {
    return getOrCreateProperty("AddContactsButton", "AddContactsButton", null, pcftest.LobScheduledItemPopup.AddContactsButton.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.LobScheduledItemPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.LobScheduledItemPopup.Edit.class);
  }
  
  public LobSchedulePopupCV getLobSchedulePopupCV() {
    return getOrCreateProperty("LobSchedulePopupCV", "LobSchedulePopupCV", null, pcftest.LobSchedulePopupCV.class);
  }
  
  public LobScheduledItemPopup_UpLink getLobScheduledItemPopup_UpLink() {
    return getOrCreateProperty("LobScheduledItemPopup_UpLink", "LobScheduledItemPopup_UpLink", null, pcftest.LobScheduledItemPopup.LobScheduledItemPopup_UpLink.class);
  }
  
  public LobScheduledItemsLV getLobScheduledItemsLV() {
    return getOrCreateProperty("LobScheduledItemsLV", "LobScheduledItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LobScheduledItemsLV.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.LobScheduledItemPopup.Remove.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.LobScheduledItemPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LobScheduledItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LobScheduledItemPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LobScheduledItemPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddContactsButton extends ActionElementWithAJAXMenu {
    public AddContactsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public AddExistingContact getAddExistingContact() {
      return getOrCreateProperty("AddExistingContact", "AddExistingContact", null, pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact.class);
    }
    
    public AddFromSearch getAddFromSearch() {
      return getOrCreateProperty("AddFromSearch", "AddFromSearch", null, pcftest.LobScheduledItemPopup.AddContactsButton.AddFromSearch.class);
    }
    
    public AddOtherContact getAddOtherContact() {
      return getOrCreateProperty("AddOtherContact", "AddOtherContact", null, pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.LobScheduledItemPopup.AddContactsButton.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.LobScheduledItemPopup.AddContactsButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddExistingContact extends ClickableActionElement {
      public AddExistingContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ExistingAdditionalInsured getExistingAdditionalInsured() {
          return getOrCreateProperty("ExistingAdditionalInsured", "ExistingAdditionalInsured", null, pcftest.LobScheduledItemPopup.AddContactsButton.AddExistingContact.entry.ExistingAdditionalInsured.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExistingAdditionalInsured extends ClickableActionElement {
          public ExistingAdditionalInsured(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddFromSearch extends ClickableActionElement {
      public AddFromSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddOtherContact extends ClickableActionElement {
      public AddOtherContact(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OtherContact getOtherContact() {
          return getOrCreateProperty("OtherContact", "OtherContact", null, pcftest.LobScheduledItemPopup.AddContactsButton.AddOtherContact.entry.OtherContact.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ContactType getContactType() {
        return getOrCreateProperty("ContactType", "ContactType", null, pcftest.LobScheduledItemPopup.AddContactsButton.entry.ContactType.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LobScheduledItemPopup_UpLink extends ClickableActionElement {
    public LobScheduledItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/coverage/LobScheduledItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}