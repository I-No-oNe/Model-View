package net.i_no_am.viewmodel.utils;

import net.i_no_am.viewmodel.client.Global;
import net.i_no_am.viewmodel.client.ModVersionChecker;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

import java.util.Objects;

public class Utils implements Global {
    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static void sendText(Text text) {
        Objects.requireNonNull(mc.player).sendMessage((text), false);
    }
    public static boolean isUpdateAvailable(String latestVersion) {
        return !CURRENT_VERSION.equals(latestVersion);
    }

    public static void setChecked(boolean bool) {
        ModVersionChecker.checked = bool;
    }
}