package library;

import java.util.ArrayList;
import java.util.List;

public class ReaderShelf {
	private List<Reader> readers=new ArrayList<Reader>();
	
	public boolean isHaveReader(String ID) {
		for(int i=0;i<readers.size();i++) {
			if (readers.get(i).getID().equals(ID)) {
				return true;
			}
		}
		return false;
	}
	
	public Reader getReaderFromID(String ID) {
		if (isHaveReader(ID)) {
			for(int i=0;i<readers.size();i++) {
				if(readers.get(i).getID().equals(ID)) {
					return readers.get(i);
				}
			}
		}
		return null;
	}
	
	public void addReader(Reader reader) {
		readers.add(reader);
	}
	
	
}
