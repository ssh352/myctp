package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u05f3\u0271\ufffd\ufffd\ufffd\u046f<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2837</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcQryOptionInstrTradeCostField extends StructObject {
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
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(3) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(3) 
	public CThostFtdcQryOptionInstrTradeCostField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public double InputPrice() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public CThostFtdcQryOptionInstrTradeCostField InputPrice(double InputPrice) {
		this.io.setDoubleField(this, 4, InputPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u013c\u06f8\ufffd,\ufffd\ufffd0\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public double UnderlyingPrice() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u013c\u06f8\ufffd,\ufffd\ufffd0\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public CThostFtdcQryOptionInstrTradeCostField UnderlyingPrice(double UnderlyingPrice) {
		this.io.setDoubleField(this, 5, UnderlyingPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(7) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 7);
	}
	public CThostFtdcQryOptionInstrTradeCostField() {
		super();
	}
	public CThostFtdcQryOptionInstrTradeCostField(Pointer pointer) {
		super(pointer);
	}
}
