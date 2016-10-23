package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesUtil {
	public Properties getProperties() {
		Properties props = null;
		String path = this.getClass().getResource("").getPath();
		path = path.replaceFirst("/", "");
		path = path.replaceAll("/classes/utils/", "");
		path = path + "/config.properties";
		props = new Properties();
		File file = new File(path);
		FileInputStream inStream;
		try {
			inStream = new FileInputStream(file);
			props.load(inStream);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return props;
	}
}
