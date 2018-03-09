package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u00fb\ufffd\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcReqUserLoginField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\u04ff\u06b6\u02f2\ufffd\u01b7\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > InterfaceProductInfo() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u042d\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcProtocolInfoType
	 */
	@Array({11}) 
	@Field(6) 
	public Pointer<Byte > ProtocolInfo() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(7) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(8) 
	public Pointer<Byte > OneTimePassword() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\u0576\ufffdIP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(9) 
	public Pointer<Byte > ClientIPAddress() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u00bc\ufffd\ufffd\u05e2<br>
	 * C type : TThostFtdcLoginRemarkType
	 */
	@Array({36}) 
	@Field(10) 
	public Pointer<Byte > LoginRemark() {
		return this.io.getPointerField(this, 10);
	}
	public CThostFtdcReqUserLoginField() {
		super();
	}
	public CThostFtdcReqUserLoginField(Pointer pointer) {
		super(pointer);
	}
}
