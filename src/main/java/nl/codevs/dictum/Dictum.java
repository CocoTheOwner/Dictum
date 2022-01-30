package nl.codevs.dictum;

import nl.codevs.dictum.api.Settings;
import nl.codevs.dictum.cmd.Dictus;

import java.io.File;
import java.io.FileNotFoundException;

public class Dictum {

    private final Dictus[] roots;
    private Settings settings;

    /**
     * Create a new dictum.
     * @param settingsFile the settings file for the dictum.
     * @param roots the root Dictus'
     */
    public Dictum(File settingsFile, Dictus... roots) {
        this.settings = Settings.from(settingsFile);
        this.roots = roots;
    }

    /**
     * Create a new dictum.
     * @param programName the name for your program. Will be used to define the settings file name
     * @param roots the root Dictus'
     */
    public Dictum(String programName, Dictus... roots) {
        this.settings = Settings.from(new File("Dictum/" + programName + "/config.json"));
        this.roots = roots;
    }




}