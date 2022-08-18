package Serialization;

import java.io.*;

public class Appendable extends ObjectOutputStream {

	public Appendable(OutputStream f) throws IOException {
		super(f);
	}
	@Override
	
	protected void writeStreamHeader()	{}

}

