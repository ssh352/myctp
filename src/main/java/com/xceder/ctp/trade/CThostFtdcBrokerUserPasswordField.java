package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:980</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcBrokerUserPasswordField extends StructObject {
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
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(2) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u03f4\ufffd\ufffd\u07b8\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcDateTimeType
	 */
	@Array({17}) 
	@Field(3) 
	public Pointer<Byte > LastUpdateTime() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u03f4\u03b5\ufffd\u00bd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcDateTimeType
	 */
	@Array({17}) 
	@Field(4) 
	public Pointer<Byte > LastLoginTime() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ExpireDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > WeakExpireDate() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcBrokerUserPasswordField() {
		super();
	}
	public CThostFtdcBrokerUserPasswordField(Pointer pointer) {
		super(pointer);
	}
}
