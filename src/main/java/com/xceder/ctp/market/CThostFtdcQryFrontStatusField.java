package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\u01f0\ufffd\ufffd\u05f4\u032c<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2514</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcQryFrontStatusField extends StructObject {
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
	public CThostFtdcQryFrontStatusField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}
	public CThostFtdcQryFrontStatusField() {
		super();
	}
	public CThostFtdcQryFrontStatusField(Pointer pointer) {
		super(pointer);
	}
}
