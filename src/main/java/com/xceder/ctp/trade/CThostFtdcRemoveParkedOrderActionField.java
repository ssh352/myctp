package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u027e\ufffd\ufffd\u0524\ufffd\ud98f\uddf5\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5890</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcRemoveParkedOrderActionField extends StructObject {
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
	 * \u0524\ufffd\ud98f\uddf5\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParkedOrderActionIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > ParkedOrderActionID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(3) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcRemoveParkedOrderActionField() {
		super();
	}
	public CThostFtdcRemoveParkedOrderActionField(Pointer pointer) {
		super(pointer);
	}
}
