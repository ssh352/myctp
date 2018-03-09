package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:999</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcBrokerUserFunctionField extends StructObject {
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
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u0734\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerFunctionCodeType
	 */
	@Field(2) 
	public byte BrokerFunctionCode() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u0734\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerFunctionCodeType
	 */
	@Field(2) 
	public CThostFtdcBrokerUserFunctionField BrokerFunctionCode(byte BrokerFunctionCode) {
		this.io.setByteField(this, 2, BrokerFunctionCode);
		return this;
	}
	public CThostFtdcBrokerUserFunctionField() {
		super();
	}
	public CThostFtdcBrokerUserFunctionField(Pointer pointer) {
		super(pointer);
	}
}
