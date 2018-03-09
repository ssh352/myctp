package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u01b7<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:357</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcProductField extends StructObject {
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > ProductID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductNameType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > ProductName() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(2) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductClassType
	 */
	@Field(3) 
	public byte ProductClass() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductClassType
	 */
	@Field(3) 
	public CThostFtdcProductField ProductClass(byte ProductClass) {
		this.io.setByteField(this, 3, ProductClass);
		return this;
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeMultipleType
	 */
	@Field(4) 
	public int VolumeMultiple() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeMultipleType
	 */
	@Field(4) 
	public CThostFtdcProductField VolumeMultiple(int VolumeMultiple) {
		this.io.setIntField(this, 4, VolumeMultiple);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u4daf\ufffd\ufffd\u03bb<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public double PriceTick() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u4daf\ufffd\ufffd\u03bb<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(5) 
	public CThostFtdcProductField PriceTick(double PriceTick) {
		this.io.setDoubleField(this, 5, PriceTick);
		return this;
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public int MaxMarketOrderVolume() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public CThostFtdcProductField MaxMarketOrderVolume(int MaxMarketOrderVolume) {
		this.io.setIntField(this, 6, MaxMarketOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public int MinMarketOrderVolume() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * \ufffd\u043c\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7) 
	public CThostFtdcProductField MinMarketOrderVolume(int MinMarketOrderVolume) {
		this.io.setIntField(this, 7, MinMarketOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public int MaxLimitOrderVolume() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\ufffd\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8) 
	public CThostFtdcProductField MaxLimitOrderVolume(int MaxLimitOrderVolume) {
		this.io.setIntField(this, 8, MaxLimitOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int MinLimitOrderVolume() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\u07bc\u06f5\ufffd\ufffd\ufffd\u0421\ufffd\u00b5\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CThostFtdcProductField MinLimitOrderVolume(int MinLimitOrderVolume) {
		this.io.setIntField(this, 9, MinLimitOrderVolume);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionTypeType
	 */
	@Field(10) 
	public byte PositionType() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionTypeType
	 */
	@Field(10) 
	public CThostFtdcProductField PositionType(byte PositionType) {
		this.io.setByteField(this, 10, PositionType);
		return this;
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateTypeType
	 */
	@Field(11) 
	public byte PositionDateType() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateTypeType
	 */
	@Field(11) 
	public CThostFtdcProductField PositionDateType(byte PositionDateType) {
		this.io.setByteField(this, 11, PositionDateType);
		return this;
	}
	/**
	 * \u01bd\ufffd\u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCloseDealTypeType
	 */
	@Field(12) 
	public byte CloseDealType() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \u01bd\ufffd\u05b4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCloseDealTypeType
	 */
	@Field(12) 
	public CThostFtdcProductField CloseDealType(byte CloseDealType) {
		this.io.setByteField(this, 12, CloseDealType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(13) 
	public Pointer<Byte > TradeCurrencyID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\u047a\ufffd\u02bd\ufffd\ufffd\ufffd\u00f7\ufffd\u03a7<br>
	 * C type : TThostFtdcMortgageFundUseRangeType
	 */
	@Field(14) 
	public byte MortgageFundUseRange() {
		return this.io.getByteField(this, 14);
	}
	/**
	 * \ufffd\ufffd\u047a\ufffd\u02bd\ufffd\ufffd\ufffd\u00f7\ufffd\u03a7<br>
	 * C type : TThostFtdcMortgageFundUseRangeType
	 */
	@Field(14) 
	public CThostFtdcProductField MortgageFundUseRange(byte MortgageFundUseRange) {
		this.io.setByteField(this, 14, MortgageFundUseRange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(15) 
	public Pointer<Byte > ExchangeProductID() {
		return this.io.getPointerField(this, 15);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUnderlyingMultipleType
	 */
	@Field(16) 
	public double UnderlyingMultiple() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01b7\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUnderlyingMultipleType
	 */
	@Field(16) 
	public CThostFtdcProductField UnderlyingMultiple(double UnderlyingMultiple) {
		this.io.setDoubleField(this, 16, UnderlyingMultiple);
		return this;
	}
	public CThostFtdcProductField() {
		super();
	}
	public CThostFtdcProductField(Pointer pointer) {
		super(pointer);
	}
}
