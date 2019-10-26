package learningcurve.zachg.beatbox;

public class Sound {
    private String assetPath;
    private String name;


    public Sound(String sAssetPath) {
        assetPath = sAssetPath;
        String[]components =  assetPath.split("/");
        String fileName = components[components.length -1];
        name = fileName.replace(".wav", "");
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }
}
