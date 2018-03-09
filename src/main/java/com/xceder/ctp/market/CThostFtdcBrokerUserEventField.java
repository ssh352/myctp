package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u00fb\ufffd\ufffd\u00bc\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5629</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcBrokerUserEventField extends StructObject {
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
	 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	@Field(2) 
	public byte UserEventType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserEventTypeType
	 */
	@Field(2) 
	public CThostFtdcBrokerUserEventField UserEventType(byte UserEventType) {
		this.io.setByteField(this, 2, UserEventType);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public int EventSequenceNo() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(3) 
	public CThostFtdcBrokerUserEventField EventSequenceNo(int EventSequenceNo) {
		this.io.setIntField(this, 3, EventSequenceNo);
		return this;
	}
	/**
	 * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(4) 
	public Pointer<Byte > EventDate() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > EventTime() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcUserEventInfoType
	 */
	@Array({1025}) 
	@Field(6) 
	public Pointer<Byte > UserEventInfo() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(8) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 8);
	}
	public CThostFtdcBrokerUserEventField() {
		super();
	}
	public CThostFtdcBrokerUserEventField(Pointer pointer) {
		super(pointer);
	}
}
