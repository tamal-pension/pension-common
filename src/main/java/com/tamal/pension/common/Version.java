package com.tamal.pension.common;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.google.common.base.MoreObjects;

public class Version implements Comparable<Version> {

    private String version;

    public final String get() {
	   return this.version;
    }

    public Version(String version) {
	   if(version == null)
		  throw new IllegalArgumentException("Version can not be null");
	   if(!version.matches("[0-9]+(\\.[0-9]+)*"))
		  throw new IllegalArgumentException("Invalid version format");
	   this.version = normalize(version);
    }

    @Override
    public int compareTo(Version that) {
	   if(that == null)
		  return 1;
	   String[] thisParts = this.get().split("\\.");
	   String[] thatParts = that.get().split("\\.");
	   int length = Math.max(thisParts.length, thatParts.length);
	   for(int i = 0; i < length; i++) {
		  int thisPart = i < thisParts.length ?
			 Integer.parseInt(thisParts[i]) : 0;
		  int thatPart = i < thatParts.length ?
			 Integer.parseInt(thatParts[i]) : 0;
		  if(thisPart < thatPart)
			 return -1;
		  if(thisPart > thatPart)
			 return 1;
	   }
	   return 0;
    }

    private static String normalize(String str){
    	return Arrays.stream(str.split("\\.")).map(Integer::parseInt).map(String::valueOf).collect(Collectors.joining("."));
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

    @Override
    public boolean equals(Object that) {
	   if(this == that)
		  return true;
	   if(that == null)
		  return false;
	   if(this.getClass() != that.getClass())
		  return false;
	   return this.compareTo((Version) that) == 0;
    }
    
    public static Version of(String version){
    	return new Version(version);
    }
    
    public static Version of(int magor){
    	return new Version(String.valueOf(magor));
    }
    
    public static Version[] array(String... versions){
    	return Arrays.stream(versions).map(Version::of).toArray(Version[]::new);
    }
    
    public static Version max(Version v1, Version v2){
    	return v1.compareTo(v2) > 0 ? v1 : v2;
    }
    
    @Override
    public String toString() {
    	return MoreObjects.toStringHelper(this).addValue(version).toString();
    }
}