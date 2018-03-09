package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u05fa\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06b1\ufffd\ufffd\u0337\ufffd\ufffd\ufffd\ufffd\ufffd\u053f\u036c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:8092</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcReqSyncKeyField extends StructObject {
	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0434\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0334\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0337\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqSyncKeyField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqSyncKeyField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqSyncKeyField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(12) 
	public int InstallID() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(12) 
	public CThostFtdcReqSyncKeyField InstallID(int InstallID) {
		this.io.setIntField(this, 12, InstallID);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\u02b6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(13) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05fa\ufffd\ufffd\u0138\ufffd\ufffd\ufffd\ufffd\u06b1\ufffd\ufffd\u0335\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcAddInfoType
	 */
	@Array({129}) 
	@Field(14) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(15) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\u0431\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(16) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f9\ufffd\u0531<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(17) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(18) 
	public int RequestID() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(18) 
	public CThostFtdcReqSyncKeyField RequestID(int RequestID) {
		this.io.setIntField(this, 18, RequestID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(19) 
	public int TID() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(19) 
	public CThostFtdcReqSyncKeyField TID(int TID) {
		this.io.setIntField(this, 19, TID);
		return this;
	}
	public CThostFtdcReqSyncKeyField() {
		super();
	}
	public CThostFtdcReqSyncKeyField(Pointer pointer) {
		super(pointer);
	}
}
