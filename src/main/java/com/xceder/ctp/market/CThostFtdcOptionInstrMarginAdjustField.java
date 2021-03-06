package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u01f0\ufffd\ufffd\u0228\ufffd\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:2746</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcOptionInstrMarginAdjustField extends StructObject {
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcOptionInstrMarginAdjustField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double SShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByMoney(double SShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 4, SShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double SShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcOptionInstrMarginAdjustField SShortMarginRatioByVolume(double SShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 5, SShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05b5\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public double HShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u05b5\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByMoney(double HShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 6, HShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05b5\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double HShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u05b5\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcOptionInstrMarginAdjustField HShortMarginRatioByVolume(double HShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 7, HShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double AShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByMoney(double AShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 8, AShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public double AShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public CThostFtdcOptionInstrMarginAdjustField AShortMarginRatioByVolume(double AShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 9, AShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0221<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(10) 
	public int IsRelative() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\u6f7b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0221<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(10) 
	public CThostFtdcOptionInstrMarginAdjustField IsRelative(int IsRelative) {
		this.io.setIntField(this, 10, IsRelative);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u033f\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public double MShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u033f\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(11) 
	public CThostFtdcOptionInstrMarginAdjustField MShortMarginRatioByMoney(double MShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 11, MShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u033f\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double MShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u033f\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcOptionInstrMarginAdjustField MShortMarginRatioByVolume(double MShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 12, MShortMarginRatioByVolume);
		return this;
	}
	public CThostFtdcOptionInstrMarginAdjustField() {
		super();
	}
	public CThostFtdcOptionInstrMarginAdjustField(Pointer pointer) {
		super(pointer);
	}
}
