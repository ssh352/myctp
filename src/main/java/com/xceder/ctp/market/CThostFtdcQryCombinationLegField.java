package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\u03fa\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5536</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcQryCombinationLegField extends StructObject {
	/**
	 * \ufffd\ufffd\u03fa\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > CombInstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0231\ufffd\ufffd<br>
	 * C type : TThostFtdcLegIDType
	 */
	@Field(1) 
	public int LegID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0231\ufffd\ufffd<br>
	 * C type : TThostFtdcLegIDType
	 */
	@Field(1) 
	public CThostFtdcQryCombinationLegField LegID(int LegID) {
		this.io.setIntField(this, 1, LegID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u023a\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > LegInstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcQryCombinationLegField() {
		super();
	}
	public CThostFtdcQryCombinationLegField(Pointer pointer) {
		super(pointer);
	}
}