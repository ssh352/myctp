package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u046f\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3445</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcForQuoteField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u046f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > ForQuoteRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u046f\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > ForQuoteLocalID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(8) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(9) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(11) 
	public int InstallID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(11) 
	public CThostFtdcForQuoteField InstallID(int InstallID) {
		this.io.setIntField(this, 11, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u046f\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcForQuoteStatusType
	 */
	@Field(14) 
	public byte ForQuoteStatus() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \u046f\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcForQuoteStatusType
	 */
	@Field(14) 
	public CThostFtdcForQuoteField ForQuoteStatus(byte ForQuoteStatus) {
		this.io.setByteField(this, 14, ForQuoteStatus);
		return this;
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(15) 
	public int FrontID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(15) 
	public CThostFtdcForQuoteField FrontID(int FrontID) {
		this.io.setIntField(this, 15, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(16) 
	public int SessionID() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(16) 
	public CThostFtdcForQuoteField SessionID(int SessionID) {
		this.io.setIntField(this, 16, SessionID);
		return this;
	}
	/**
	 * \u05f4\u032c\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(17) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(18) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\u046f\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(19) 
	public int BrokerForQutoSeq() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\u046f\ufffd\u06f1\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(19) 
	public CThostFtdcForQuoteField BrokerForQutoSeq(int BrokerForQutoSeq) {
		this.io.setIntField(this, 19, BrokerForQutoSeq);
		return this;
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(20) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(21) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(22) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 22);
	}
	public CThostFtdcForQuoteField() {
		super();
	}
	public CThostFtdcForQuoteField(Pointer pointer) {
		super(pointer);
	}
}
