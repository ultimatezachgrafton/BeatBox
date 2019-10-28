package learningcurve.zachg.beatbox;

public class Sound {
    private String assetPath;
    private String name;
    private Integer mSoundId;


    public Sound(String sAssetPath) {
        assetPath = sAssetPath;
        String[]components =  assetPath.split("/");
        String fileName = components[components.length -1];
        name = fileName.replace(".wav", "");
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }
}
