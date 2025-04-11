package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ActionElementWithAJAXMenu;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.Add;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact.entry.ExistingPolicyContact;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddFromSearch;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact.entry.OtherContact;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.entry.ContactType;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.Remove;
import pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.ToolbarButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LobScheduledItemsLVInputSet_WCMLine extends LobScheduledItemsLVInputSet {
  public final static String CHECKSUM = "116f695bbf9c5424b924c13e3ed55f4a";
  
  public LobScheduledItemsLVInputSet_WCMLine(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LobScheduledItemsLV getLobScheduledItemsLV() {
    return getOrCreateProperty("LobScheduledItemsLV", "LobScheduledItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LobScheduledItemsLV.class);
  }
  
  public LobScheduledItemsLV_tb getLobScheduledItemsLV_tb() {
    return getOrCreateProperty("LobScheduledItemsLV_tb", "LobScheduledItemsLV_tb", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LobScheduledItemsLV_tb extends PCFElement {
    public LobScheduledItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.Add.class);
    }
    
    public AddContactsButton getAddContactsButton() {
      return getOrCreateProperty("AddContactsButton", "AddContactsButton", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.Remove.class);
    }
    
    public ToolbarButton getToolbarButton() {
      return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.ToolbarButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddContactsButton extends ActionElementWithAJAXMenu {
      public AddContactsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public AddExistingContact getAddExistingContact() {
        return getOrCreateProperty("AddExistingContact", "AddExistingContact", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact.class);
      }
      
      public AddFromSearch getAddFromSearch() {
        return getOrCreateProperty("AddFromSearch", "AddFromSearch", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddFromSearch.class);
      }
      
      public AddOtherContact getAddOtherContact() {
        return getOrCreateProperty("AddOtherContact", "AddOtherContact", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddExistingContact extends ClickableActionElement {
        public AddExistingContact(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ExistingPolicyContact getExistingPolicyContact() {
            return getOrCreateProperty("ExistingPolicyContact", "ExistingPolicyContact", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddExistingContact.entry.ExistingPolicyContact.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddFromSearch extends ClickableActionElement {
        public AddFromSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddOtherContact extends ClickableActionElement {
        public AddOtherContact(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OtherContact getOtherContact() {
            return getOrCreateProperty("OtherContact", "OtherContact", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.AddOtherContact.entry.OtherContact.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContactType getContactType() {
          return getOrCreateProperty("ContactType", "ContactType", null, pcftest.LobScheduledItemsLVInputSet_WCMLine.LobScheduledItemsLV_tb.AddContactsButton.entry.ContactType.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/line/wcm/policy/LobScheduledItemsLVInputSet.WCMLine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ToolbarButton extends ClickableActionElement {
      public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WCMLobScheduledItemPopup click() {
        return clickThis(pcftest.WCMLobScheduledItemPopup.class);
      }
      
      
    }
    
    
  }
  
  
}