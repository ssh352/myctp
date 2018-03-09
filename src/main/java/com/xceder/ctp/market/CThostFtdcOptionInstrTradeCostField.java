package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\u05f3\u0271\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2810</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcOptionInstrTradeCostField extends StructObject {
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
	public CThostFtdcOptionInstrTradeCostField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ud88b\udef1\u4cbf\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double FixedMargin() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ud88b\udef1\u4cbf\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcOptionInstrTradeCostField FixedMargin(double FixedMargin) {
		this.io.setDoubleField(this, 4, FixedMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u0421\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double MiniMargin() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u0421\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcOptionInstrTradeCostField MiniMargin(double MiniMargin) {
		this.io.setDoubleField(this, 5, MiniMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double Royalty() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u053c\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcOptionInstrTradeCostField Royalty(double Royalty) {
		this.io.setDoubleField(this, 6, Royalty);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ud88b\udef1\u4cbf\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double ExchFixedMargin() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ud88b\udef1\u4cbf\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcOptionInstrTradeCostField ExchFixedMargin(double ExchFixedMargin) {
		this.io.setDoubleField(this, 7, ExchFixedMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u0421\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double ExchMiniMargin() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u0421\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcOptionInstrTradeCostField ExchMiniMargin(double ExchMiniMargin) {
		this.io.setDoubleField(this, 8, ExchMiniMargin);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(9) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(10) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 10);
	}
	public CThostFtdcOptionInstrTradeCostField() {
		super();
	}
	public CThostFtdcOptionInstrTradeCostField(Pointer pointer) {
		super(pointer);
	}
}
