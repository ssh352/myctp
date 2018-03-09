package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4581</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcInputOptionSelfCloseField extends StructObject {
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
	 * \ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OptionSelfCloseRef() {
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
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public int Volume() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public CThostFtdcInputOptionSelfCloseField Volume(int Volume) {
		this.io.setIntField(this, 5, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(6) 
	public int RequestID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(6) 
	public CThostFtdcInputOptionSelfCloseField RequestID(int RequestID) {
		this.io.setIntField(this, 6, RequestID);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public CThostFtdcInputOptionSelfCloseField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 8, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\u0533\ufffd<br>
	 * C type : TThostFtdcOptSelfCloseFlagType
	 */
	@Field(9) 
	public byte OptSelfCloseFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\u0533\ufffd<br>
	 * C type : TThostFtdcOptSelfCloseFlagType
	 */
	@Field(9) 
	public CThostFtdcInputOptionSelfCloseField OptSelfCloseFlag(byte OptSelfCloseFlag) {
		this.io.setByteField(this, 9, OptSelfCloseFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(10) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(11) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fa\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(12) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(13) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(14) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(15) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(16) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 16);
	}
	public CThostFtdcInputOptionSelfCloseField() {
		super();
	}
	public CThostFtdcInputOptionSelfCloseField(Pointer pointer) {
		super(pointer);
	}
}
