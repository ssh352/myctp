package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u00fb\ufffd\ufffd\u1ef0<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1883</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcUserSessionField extends StructObject {
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0) 
	public CThostFtdcUserSessionField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1) 
	public int SessionID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1) 
	public CThostFtdcUserSessionField SessionID(int SessionID) {
		this.io.setIntField(this, 1, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(3) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > LoginDate() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u00bc\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > LoginTime() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(6) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\u04ff\u06b6\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(8) 
	public Pointer<Byte > InterfaceProductInfo() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u042d\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProtocolInfoType
	 */
	@Array({11}) 
	@Field(9) 
	public Pointer<Byte > ProtocolInfo() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\u05e2<br>
	 * C type : TThostFtdcLoginRemarkType
	 */
	@Array({36}) 
	@Field(11) 
	public Pointer<Byte > LoginRemark() {
		return this.io.getPointerField(this, 11);
	}
	public CThostFtdcUserSessionField() {
		super();
	}
	public CThostFtdcUserSessionField(Pointer pointer) {
		super(pointer);
	}
}
