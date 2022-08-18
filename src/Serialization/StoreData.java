package Serialization;

import java.io.*;

public class StoreData extends ObjectOutputStream {

	public StoreData(OutputStream f) throws IOException {
		super(f);
	}
	@Override
	
	protected void writeStreamHeader()	{}

}
