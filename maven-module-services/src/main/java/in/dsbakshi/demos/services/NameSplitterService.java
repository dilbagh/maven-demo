package in.dsbakshi.demos.services;

import in.dsbakshi.demos.utility.NameSplitter;
import in.dsbakshi.demos.utility.SplitName;

public class NameSplitterService {
	
	private NameSplitter nameSplitter = new NameSplitter();
	
	public SplitName getSplittedName(String fullName) {
		return nameSplitter.splitName(fullName);
	}

}
