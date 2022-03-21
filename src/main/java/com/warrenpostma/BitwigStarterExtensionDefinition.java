package com.warrenpostma;
import java.util.UUID;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

// This defines the metadata that the plugin exports to the DAW host application.
// The actual controller FooController has FooControllerDefinition
// as its controller extension metadata class.

public class BitwigStarterExtensionDefinition extends ControllerExtensionDefinition
{
   private static final UUID DRIVER_ID = UUID.fromString("942bfb54-82e3-4604-9203-1210a50eee29");
   
   public BitwigStarterExtensionDefinition()
   {
   }

   @Override
   public String getName()
   {
      return "bitwigstarter";
   }
   
   @Override
   public String getAuthor()
   {
      return "wpostma";
   }

   @Override
   public String getVersion()
   {
      return "0.1";
   }

   @Override
   public UUID getId()
   {
      return DRIVER_ID;
   }
   
   @Override
   public String getHardwareVendor()
   {
      return "Warren Postma";
   }
   
   @Override
   public String getHardwareModel()
   {
      return "bitwigstarter";
   }

   @Override
   public int getRequiredAPIVersion()
   {
      return 16;
   }

   @Override
   public int getNumMidiInPorts()
   {
      return 1;
   }

   @Override
   public int getNumMidiOutPorts()
   {
      return 1;
   }

   @Override
   public void listAutoDetectionMidiPortNames(final AutoDetectionMidiPortNamesList list, final PlatformType platformType)
   {
      if (platformType == PlatformType.WINDOWS)
      {
         // TODO: Set the correct names of the ports for auto detection on Windows platform here
         // and uncomment this when port names are correct.
         // list.add(new String[]{"Input Port 0"}, new String[]{"Output Port 0"});
      }
      else if (platformType == PlatformType.MAC)
      {
         // TODO: Set the correct names of the ports for auto detection on Windows platform here
         // and uncomment this when port names are correct.
         // list.add(new String[]{"Input Port 0"}, new String[]{"Output Port 0"});
      }
      else if (platformType == PlatformType.LINUX)
      {
         // TODO: Set the correct names of the ports for auto detection on Windows platform here
         // and uncomment this when port names are correct.
         // list.add(new String[]{"Input Port 0"}, new String[]{"Output Port 0"});
      }
   }

   @Override
   public BitwigStarterExtension createInstance(final ControllerHost host)
   {
      return new BitwigStarterExtension(this, host);
   }
}
