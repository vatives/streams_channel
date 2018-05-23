package io.intheloup.streamschannelexample;

import io.flutter.plugin.common.PluginRegistry;

public final class DemoPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    DemoStreamsChannelPlugin.registerWith(registry.registrarFor("io.intheloup.streamschannelexample.DemoStreamsChannelPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = DemoPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}