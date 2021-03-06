package struts.request.mapping;

public class MapPair {
	private String key;
	private String value;

	public MapPair(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String str = "";
		str += key + " : " + value;
		return str;
	}
}
