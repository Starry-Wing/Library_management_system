package library;

import java.util.ArrayList;
import java.util.List;

public class ReaderShelf {
	private List<Reader> readers=new ArrayList<Reader>();
	
	public boolean isHaveReader(String ID) {
		for(int i=0;i<readers.size();i++) {
			if (readers.get(i).getID()==ID) {
				return true;
			}
		}
		return false;
	}
	
	public void addReader(Reader reader) {
		readers.add(reader);
	}
	
	
}
