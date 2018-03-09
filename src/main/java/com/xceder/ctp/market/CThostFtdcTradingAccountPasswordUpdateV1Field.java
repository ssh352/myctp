package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5508</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcTradingAccountPasswordUpdateV1Field extends StructObject {
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
	 * \u052d\ufffd\ufffd\ufffd\u013f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(2) 
	public Pointer<Byte > OldPassword() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u00b5\u013f\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > NewPassword() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcTradingAccountPasswordUpdateV1Field() {
		super();
	}
	public CThostFtdcTradingAccountPasswordUpdateV1Field(Pointer pointer) {
		super(pointer);
	}
}
