package nl.codevs.dictum.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.*;

public class Settings {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static Gson getGSON() {
        return GSON;
    }

    /**
     * Create new settings from a file.
     * @param settingsFile the settings file
     * @return the settings
     */
    public static @Nullable Settings from(@NotNull File settingsFile) {
        try {
            if (!settingsFile.exists()) {
                settingsFile.createNewFile();
            }
            return GSON.fromJson(new BufferedReader(new FileReader(settingsFile)), Settings.class);
        } catch (IOException e) {
            return null;
        }
    }
}
