package com.tyss.assetmanagement.exception;
public class RemoveAssetException extends RuntimeException {
	public String getMessage()
	{
		return "Asset id You Entered is not in the Database";
	}
}
