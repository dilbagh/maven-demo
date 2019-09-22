package in.dsbakshi.demos.utility;

import java.util.List;

import com.google.common.base.Splitter;

public class NameSplitter {

	public SplitName splitName(String fullName) {
		List<String> nameParts = Splitter.on(" ").omitEmptyStrings().trimResults().splitToList(fullName);
		switch (nameParts.size()) {
		case 1:
			return new SplitName(nameParts.get(0), "", "");
		case 2:
			return new SplitName(nameParts.get(0), "", nameParts.get(1));
		case 3:
			return new SplitName(nameParts.get(0), nameParts.get(1), nameParts.get(2));
		default:
			throw new IllegalArgumentException("Name with more than 3 parts is not supported.");
		}
	}

}
