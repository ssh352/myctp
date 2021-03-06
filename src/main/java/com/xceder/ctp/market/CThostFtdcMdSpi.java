package com.xceder.ctp.market;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : ThostFtdcMdApi.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcMdSpi extends CPPObject {
	static {
		BridJ.register();
	}
	/**
	 * \ufffd\ufffd\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ubf7b\ufffd\u05fa\ufffd\u0328\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd\ufffd\u03b4\ufffd\ufffd\u00bc\u01f0\ufffd\ufffd\ufffd\ufffd\ufffd\u00f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u00e1\ufffd<br>
	 * Original signature : <code>void OnFrontConnected()</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:22</i>
	 */
	@Virtual(0) 
	native public void OnFrontConnected();
	/**
	 * 0x2003 \ufffd\u0575\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * Original signature : <code>void OnFrontDisconnected(int)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:31</i>
	 */
	@Virtual(1) 
	native public void OnFrontDisconnected(int nReason);
	/**
	 * @param nTimeLapse \ufffd\ufffd\ufffd\ufffd\ufffd\u03f4\u03bd\ufffd\ufffd\u0571\ufffd\ufffd\u0135\ufffd\u02b1\ufffd\ufffd<br>
	 * Original signature : <code>void OnHeartBeatWarning(int)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:35</i>
	 */
	@Virtual(2) 
	native public void OnHeartBeatWarning(int nTimeLapse);
	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspUserLogin(CThostFtdcRspUserLoginField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:39</i>
	 */
	@Virtual(3) 
	public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField > pRspUserLogin, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogin(Pointer.getPeer(pRspUserLogin), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(3) 
	protected native void OnRspUserLogin(@Ptr long pRspUserLogin, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\u01f3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
	 * Original signature : <code>void OnRspUserLogout(CThostFtdcUserLogoutField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:42</i>
	 */
	@Virtual(4) 
	public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField > pUserLogout, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUserLogout(Pointer.getPeer(pUserLogout), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(4) 
	protected native void OnRspUserLogout(@Ptr long pUserLogout, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspError(CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:45</i>
	 */
	@Virtual(5) 
	public void OnRspError(Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspError(Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(5) 
	protected native void OnRspError(@Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:48</i>
	 */
	@Virtual(6) 
	public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(6) 
	protected native void OnRspSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u0221\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:51</i>
	 */
	@Virtual(7) 
	public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubMarketData(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(7) 
	protected native void OnRspUnSubMarketData(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:54</i>
	 */
	@Virtual(8) 
	public void OnRspSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(8) 
	protected native void OnRspSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \u0221\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u046f\ufffd\ufffd\u04e6\ufffd\ufffd<br>
	 * Original signature : <code>void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField*, CThostFtdcRspInfoField*, int, bool)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:57</i>
	 */
	@Virtual(9) 
	public void OnRspUnSubForQuoteRsp(Pointer<CThostFtdcSpecificInstrumentField > pSpecificInstrument, Pointer<CThostFtdcRspInfoField > pRspInfo, int nRequestID, boolean bIsLast) {
		OnRspUnSubForQuoteRsp(Pointer.getPeer(pSpecificInstrument), Pointer.getPeer(pRspInfo), nRequestID, bIsLast);
	}
	@Virtual(9) 
	protected native void OnRspUnSubForQuoteRsp(@Ptr long pSpecificInstrument, @Ptr long pRspInfo, int nRequestID, boolean bIsLast);
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField*)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:60</i>
	 */
	@Virtual(10) 
	public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField > pDepthMarketData) {
		OnRtnDepthMarketData(Pointer.getPeer(pDepthMarketData));
	}
	@Virtual(10) 
	protected native void OnRtnDepthMarketData(@Ptr long pDepthMarketData);
	/**
	 * \u046f\ufffd\ufffd\u0368\u05aa<br>
	 * Original signature : <code>void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField*)</code><br>
	 * <i>native declaration : ThostFtdcMdApi.h:63</i>
	 */
	@Virtual(11) 
	public void OnRtnForQuoteRsp(Pointer<CThostFtdcForQuoteRspField > pForQuoteRsp) {
		OnRtnForQuoteRsp(Pointer.getPeer(pForQuoteRsp));
	}
	@Virtual(11) 
	protected native void OnRtnForQuoteRsp(@Ptr long pForQuoteRsp);
	public CThostFtdcMdSpi() {
		super();
	}
	public CThostFtdcMdSpi(Pointer pointer) {
		super(pointer);
	}
}
