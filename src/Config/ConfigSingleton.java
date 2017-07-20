package Config;

public class ConfigSingleton {

    private static ConfigSingleton instance;

    private static ConfigFileReader config;
    private static ConfigValues configValues;
    private static String file = "input.txt";
    private static boolean init = false;

    private static String exclamation;
    private static boolean isSpain = false;

    private static int length;

    private ConfigSingleton(String excl, int len) {
        configValues = new ConfigValues(excl, len);
        exclamation = new String(excl);
        length = len;
    }

    public static ConfigSingleton getInstance() {

        if (instance != null) {
            return instance;
        } else {
            config = new ConfigFileReader(file);
            initConfig(config);

            instance = new ConfigSingleton(exclamation, length);

            return instance;
        }
    }

    private static void initConfig(ConfigFileReader config) {
        isSpain = config.isSpain();
        exclamation = isSpain ? "!" : "";
        length = config.getLength();
        init = true;
    }

    // return '!' or ''
    protected String exclamation() {
        return exclamation;
    }

    // return true or false
    protected boolean getIfSpain() {
        return isSpain;
    }

    // return length
    protected int getLength() {
        return length;
    }

    private class ConfigValues{
        String exclamation;
        int length;

        ConfigValues(String exclamation, int length) {
            this.exclamation = exclamation;
            this.length = length;
        }
    }
}
