package com.tamal.pension.common;

import java.io.File;

public class Path {
	public static String combine (String path1, String path2)
	{
	    File file1 = new File(path1);
	    File file2 = new File(file1, path2);
	    return file2.getPath();
	}
}
