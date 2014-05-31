package com.synature.util;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

public abstract class Ksoap2WebServiceTask extends AsyncTask<String, String, String> {
	
	protected SoapObject mSoapRequest;
	protected SoapSerializationEnvelope mEnvelope;
	protected HttpTransportSE mAndroidHttpTransport;
	protected int mTimeout = 30 * 1000;
	protected String mNameSpace;
	protected String mWebMethod;
	protected Context mContext;
	protected PropertyInfo mProperty;
	protected String mHttpErrMsg;
	
	public Ksoap2WebServiceTask(Context c, String nameSpace, String method){
		mContext = c;
		mNameSpace = nameSpace;
		mWebMethod = method;
		mSoapRequest = new SoapObject(nameSpace, mWebMethod);
		mEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		mEnvelope.dotNet = true;
		mEnvelope.setOutputSoapObject(mSoapRequest);
	}
	
	@Override
	protected String doInBackground(String... uri) {
		String result = "";
		String url = uri[0];
		
		ConnectivityManager connMgr = (ConnectivityManager) mContext
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
			System.setProperty("http.keepAlive", "false");
			mAndroidHttpTransport = new HttpTransportSE(url, mTimeout);
			//androidHttpTransport.debug = true;
			String soapAction = mNameSpace + mWebMethod;
			try {
				mAndroidHttpTransport.call(soapAction, mEnvelope);
				try {
					result = mEnvelope.getResponse().toString();
				} catch (SoapFault e) {
					result = e.getMessage();
					e.printStackTrace();
				}
			} catch (IOException e) {
				result = e.getMessage();
				e.printStackTrace();
			} catch (XmlPullParserException e) {
				result = e.getMessage();
				e.printStackTrace();
			}
			
			if(result == null || result.equals("")){
				result = "Network Error!";
			}
		}else{
			result = "Cannot connect to network!";
		}
		return result;
	}
}
