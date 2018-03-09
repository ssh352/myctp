package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\ufffd\u03e2<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:4818</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcExchangeOptionSelfCloseField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public int Volume() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public CThostFtdcExchangeOptionSelfCloseField Volume(int Volume) {
		this.io.setIntField(this, 0, Volume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public int RequestID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public CThostFtdcExchangeOptionSelfCloseField RequestID(int RequestID) {
		this.io.setIntField(this, 1, RequestID);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > BusinessUnit() {
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
	public CThostFtdcExchangeOptionSelfCloseField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\u0533\ufffd<br>
	 * C type : TThostFtdcOptSelfCloseFlagType
	 */
	@Field(4) 
	public byte OptSelfCloseFlag() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\ufffd\u0228\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u0536\u0533\ufffd<br>
	 * C type : TThostFtdcOptSelfCloseFlagType
	 */
	@Field(4) 
	public CThostFtdcExchangeOptionSelfCloseField OptSelfCloseFlag(byte OptSelfCloseFlag) {
		this.io.setByteField(this, 4, OptSelfCloseFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(5) 
	public Pointer<Byte > OptionSelfCloseLocalID() {
		return this.io.getPointerField(this, 5);
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
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(7) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(8) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(9) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(10) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(11) 
	public int InstallID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(11) 
	public CThostFtdcExchangeOptionSelfCloseField InstallID(int InstallID) {
		this.io.setIntField(this, 11, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(12) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(12) 
	public CThostFtdcExchangeOptionSelfCloseField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 12, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(13) 
	public int NotifySequence() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(13) 
	public CThostFtdcExchangeOptionSelfCloseField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 13, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(14) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(15) 
	public int SettlementID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(15) 
	public CThostFtdcExchangeOptionSelfCloseField SettlementID(int SettlementID) {
		this.io.setIntField(this, 15, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0228\ufffd\u0536\u0533\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(16) 
	public Pointer<Byte > OptionSelfCloseSysID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(19) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\u0536\u0533\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(20) 
	public byte ExecResult() {
		return this.io.getByteField(this, 20);
	}
	/**
	 * \ufffd\u0536\u0533\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(20) 
	public CThostFtdcExchangeOptionSelfCloseField ExecResult(byte ExecResult) {
		this.io.setByteField(this, 20, ExecResult);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(21) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public int SequenceNo() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(22) 
	public CThostFtdcExchangeOptionSelfCloseField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 22, SequenceNo);
		return this;
	}
	/**
	 * \u04ea\u04b5\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * IP\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(24) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * Mac\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(25) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 25);
	}
	public CThostFtdcExchangeOptionSelfCloseField() {
		super();
	}
	public CThostFtdcExchangeOptionSelfCloseField(Pointer pointer) {
		super(pointer);
	}
}
