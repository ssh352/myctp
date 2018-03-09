package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ubc68\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1291</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcInputOrderField extends StructObject {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(5) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(5) 
	public CThostFtdcInputOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 5, OrderPriceType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(6) 
	public byte Direction() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(6) 
	public CThostFtdcInputOrderField Direction(byte Direction) {
		this.io.setByteField(this, 6, Direction);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03ff\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcCombOffsetFlagType
	 */
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcCombHedgeFlagType
	 */
	@Array({5}) 
	@Field(8) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public CThostFtdcInputOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 9, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public CThostFtdcInputOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 10, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(11) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(11) 
	public CThostFtdcInputOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 11, TimeCondition);
		return this;
	}
	/**
	 * GTD\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(13) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(13) 
	public CThostFtdcInputOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 13, VolumeCondition);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u027d\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(14) 
	public int MinVolume() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u027d\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(14) 
	public CThostFtdcInputOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 14, MinVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(15) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(15) 
	public CThostFtdcInputOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 15, ContingentCondition);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(16) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(16) 
	public CThostFtdcInputOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 16, StopPrice);
		return this;
	}
	/**
	 * \u01ff\u01bd\u052d\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(17) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \u01ff\u01bd\u052d\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(17) 
	public CThostFtdcInputOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 17, ForceCloseReason);
		return this;
	}
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(18) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(18) 
	public CThostFtdcInputOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 18, IsAutoSuspend);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(20) 
	public int RequestID() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(20) 
	public CThostFtdcInputOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 20, RequestID);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\u01ff\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(21) 
	public int UserForceClose() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\u00fb\ufffd\u01ff\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(21) 
	public CThostFtdcInputOrderField UserForceClose(int UserForceClose) {
		this.io.setIntField(this, 21, UserForceClose);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(22) 
	public int IsSwapOrder() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(22) 
	public CThostFtdcInputOrderField IsSwapOrder(int IsSwapOrder) {
		this.io.setIntField(this, 22, IsSwapOrder);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u0376\ufffd\u02b5\ufffd\u052a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(24) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fa\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(25) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(26) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(27) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(28) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(29) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 29);
	}
	public CThostFtdcInputOrderField() {
		super();
	}
	public CThostFtdcInputOrderField(Pointer pointer) {
		super(pointer);
	}
}
