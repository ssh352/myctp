package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:476</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcTraderField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
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
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallCountType
	 */
	@Field(4) 
	public int InstallCount() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallCountType
	 */
	@Field(4) 
	public CThostFtdcTraderField InstallCount(int InstallCount) {
		this.io.setIntField(this, 4, InstallCount);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 5);
	}
	public CThostFtdcTraderField() {
		super();
	}
	public CThostFtdcTraderField(Pointer pointer) {
		super(pointer);
	}
}
