package com.tsy.myokhttp.response;

/**
 * Created by tsy on 16/8/15.
 */
public interface IResponseHandler {

    void onFailure(int statusCode, String error_msg);

    public void onProgress(long currentBytes, long totalBytes);
}