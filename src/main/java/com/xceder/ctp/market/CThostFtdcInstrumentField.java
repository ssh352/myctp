package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u053c<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:396</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcInstrumentField extends StructObject {
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
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentNameType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > InstrumentName() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(3) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductClassType
	 */
	@Field(5) 
	public byte ProductClass() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductClassType
	 */
	@Field(5) 
	public CThostFtdcInstrumentField ProductClass(byte ProductClass) {
		this.io.setByteField(this, 5, ProductClass);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcYearType
	 */
	@Field(6) 
	public int DeliveryYear() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcYearType
	 */
	@Field(6) 
	public CThostFtdcInstrumentField DeliveryYear(int DeliveryYear) {
		this.io.setIntField(this, 6, DeliveryYear);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMonthType
	 */
	@Field(7) 
	public int DeliveryMonth() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMonthType
	 */
	@Field(7) 
	public CThostFtdcInstrumentField DeliveryMonth(int DeliveryMonth) {
		this.io.setIntField(this, 7, DeliveryMonth);
		return this;
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public int MaxMarketOrderVolume() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public CThostFtdcInstrumentField MaxMarketOrderVolume(int MaxMarketOrderVolume) {
		this.io.setIntField(this, 8, MaxMarketOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int MinMarketOrderVolume() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CThostFtdcInstrumentField MinMarketOrderVolume(int MinMarketOrderVolume) {
		this.io.setIntField(this, 9, MinMarketOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public int MaxLimitOrderVolume() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public CThostFtdcInstrumentField MaxLimitOrderVolume(int MaxLimitOrderVolume) {
		this.io.setIntField(this, 10, MaxLimitOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public int MinLimitOrderVolume() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(11) 
	public CThostFtdcInstrumentField MinLimitOrderVolume(int MinLimitOrderVolume) {
		this.io.setIntField(this, 11, MinLimitOrderVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeMultipleType
	 */
	@Field(12) 
	public int VolumeMultiple() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeMultipleType
	 */
	@Field(12) 
	public CThostFtdcInstrumentField VolumeMultiple(int VolumeMultiple) {
		this.io.setIntField(this, 12, VolumeMultiple);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u4daf\ufffd\ufffd\u03bb<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(13) 
	public double PriceTick() {
		return this.io.getDoubleField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u4daf\ufffd\ufffd\u03bb<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(13) 
	public CThostFtdcInstrumentField PriceTick(double PriceTick) {
		this.io.setDoubleField(this, 13, PriceTick);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > CreateDate() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(15) 
	public Pointer<Byte > OpenDate() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(16) 
	public Pointer<Byte > ExpireDate() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\u02bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > StartDelivDate() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > EndDelivDate() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcInstLifePhaseType
	 */
	@Field(19) 
	public byte InstLifePhase() {
		return this.io.getByteField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcInstLifePhaseType
	 */
	@Field(19) 
	public CThostFtdcInstrumentField InstLifePhase(byte InstLifePhase) {
		this.io.setByteField(this, 19, InstLifePhase);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\u01f7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(20) 
	public int IsTrading() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\u01f7\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(20) 
	public CThostFtdcInstrumentField IsTrading(int IsTrading) {
		this.io.setIntField(this, 20, IsTrading);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionTypeType
	 */
	@Field(21) 
	public byte PositionType() {
		return this.io.getByteField(this, 21);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionTypeType
	 */
	@Field(21) 
	public CThostFtdcInstrumentField PositionType(byte PositionType) {
		this.io.setByteField(this, 21, PositionType);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateTypeType
	 */
	@Field(22) 
	public byte PositionDateType() {
		return this.io.getByteField(this, 22);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateTypeType
	 */
	@Field(22) 
	public CThostFtdcInstrumentField PositionDateType(byte PositionDateType) {
		this.io.setByteField(this, 22, PositionDateType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(23) 
	public double LongMarginRatio() {
		return this.io.getDoubleField(this, 23);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(23) 
	public CThostFtdcInstrumentField LongMarginRatio(double LongMarginRatio) {
		this.io.setDoubleField(this, 23, LongMarginRatio);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(24) 
	public double ShortMarginRatio() {
		return this.io.getDoubleField(this, 24);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(24) 
	public CThostFtdcInstrumentField ShortMarginRatio(double ShortMarginRatio) {
		this.io.setDoubleField(this, 24, ShortMarginRatio);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\u02b9\ufffd\u00f4\ufffd\ued65\ufffd\u07f1\ufffd\u05a4\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcMaxMarginSideAlgorithmType
	 */
	@Field(25) 
	public byte MaxMarginSideAlgorithm() {
		return this.io.getByteField(this, 25);
	}
	/**
	 * \ufffd\u01f7\ufffd\u02b9\ufffd\u00f4\ufffd\ued65\ufffd\u07f1\ufffd\u05a4\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcMaxMarginSideAlgorithmType
	 */
	@Field(25) 
	public CThostFtdcInstrumentField MaxMarginSideAlgorithm(byte MaxMarginSideAlgorithm) {
		this.io.setByteField(this, 25, MaxMarginSideAlgorithm);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(26) 
	public Pointer<Byte > UnderlyingInstrID() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \u05b4\ufffd\u043c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public double StrikePrice() {
		return this.io.getDoubleField(this, 27);
	}
	/**
	 * \u05b4\ufffd\u043c\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27) 
	public CThostFtdcInstrumentField StrikePrice(double StrikePrice) {
		this.io.setDoubleField(this, 27, StrikePrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(28) 
	public byte OptionsType() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOptionsTypeType
	 */
	@Field(28) 
	public CThostFtdcInstrumentField OptionsType(byte OptionsType) {
		this.io.setByteField(this, 28, OptionsType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUnderlyingMultipleType
	 */
	@Field(29) 
	public double UnderlyingMultiple() {
		return this.io.getDoubleField(this, 29);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUnderlyingMultipleType
	 */
	@Field(29) 
	public CThostFtdcInstrumentField UnderlyingMultiple(double UnderlyingMultiple) {
		this.io.setDoubleField(this, 29, UnderlyingMultiple);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombinationTypeType
	 */
	@Field(30) 
	public byte CombinationType() {
		return this.io.getByteField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombinationTypeType
	 */
	@Field(30) 
	public CThostFtdcInstrumentField CombinationType(byte CombinationType) {
		this.io.setByteField(this, 30, CombinationType);
		return this;
	}
	public CThostFtdcInstrumentField() {
		super();
	}
	public CThostFtdcInstrumentField(Pointer pointer) {
		super(pointer);
	}
}
