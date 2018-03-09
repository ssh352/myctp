package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4292</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcExchangeCombActionField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(0) 
	public byte Direction() {
		return this.io.getByteField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(0) 
	public CThostFtdcExchangeCombActionField Direction(byte Direction) {
		this.io.setByteField(this, 0, Direction);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(1) 
	public int Volume() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(1) 
	public CThostFtdcExchangeCombActionField Volume(int Volume) {
		this.io.setIntField(this, 1, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b8\ufffd\uedfd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(2) 
	public byte CombDirection() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b8\ufffd\uedfd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(2) 
	public CThostFtdcExchangeCombActionField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 2, CombDirection);
		return this;
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
	public CThostFtdcExchangeCombActionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(4) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(6) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(8) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(9) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(10) 
	public int InstallID() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(10) 
	public CThostFtdcExchangeCombActionField InstallID(int InstallID) {
		this.io.setIntField(this, 10, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(11) 
	public byte ActionStatus() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(11) 
	public CThostFtdcExchangeCombActionField ActionStatus(byte ActionStatus) {
		this.io.setByteField(this, 11, ActionStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(12) 
	public int NotifySequence() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(12) 
	public CThostFtdcExchangeCombActionField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 12, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(14) 
	public int SettlementID() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(14) 
	public CThostFtdcExchangeCombActionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 14, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(15) 
	public int SequenceNo() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(15) 
	public CThostFtdcExchangeCombActionField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 15, SequenceNo);
		return this;
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(16) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(17) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u03f1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeIDType
	 */
	@Array({21}) 
	@Field(18) 
	public Pointer<Byte > ComTradeID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(19) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 19);
	}
	public CThostFtdcExchangeCombActionField() {
		super();
	}
	public CThostFtdcExchangeCombActionField(Pointer pointer) {
		super(pointer);
	}
}
