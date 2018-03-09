package com.xceder.ctp.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:7066</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcReqTransferField extends StructObject {
	/**
	 * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0434\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0334\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0337\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\u0373\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01bd\u0328\ufffd\ufffd\u03e2\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqTransferField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u01ac\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqTransferField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \ufffd\u1ef0\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqTransferField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public CThostFtdcReqTransferField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public CThostFtdcReqTransferField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(16) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(17) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(18) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(20) 
	public int InstallID() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(20) 
	public CThostFtdcReqTransferField InstallID(int InstallID) {
		this.io.setIntField(this, 20, InstallID);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(21) 
	public int FutureSerial() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\u02ee\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(21) 
	public CThostFtdcReqTransferField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 21, FutureSerial);
		return this;
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\u02b6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(22) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\u037b\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public CThostFtdcReqTransferField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 23, VerifyCertNoFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(24) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(25) 
	public double TradeAmount() {
		return this.io.getDoubleField(this, 25);
	}
	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(25) 
	public CThostFtdcReqTransferField TradeAmount(double TradeAmount) {
		this.io.setDoubleField(this, 25, TradeAmount);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(26) 
	public double FutureFetchAmount() {
		return this.io.getDoubleField(this, 26);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u0221\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeAmountType
	 */
	@Field(26) 
	public CThostFtdcReqTransferField FutureFetchAmount(double FutureFetchAmount) {
		this.io.setDoubleField(this, 26, FutureFetchAmount);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(27) 
	public byte FeePayFlag() {
		return this.io.getByteField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcFeePayFlagType
	 */
	@Field(27) 
	public CThostFtdcReqTransferField FeePayFlag(byte FeePayFlag) {
		this.io.setByteField(this, 27, FeePayFlag);
		return this;
	}
	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(28) 
	public double CustFee() {
		return this.io.getDoubleField(this, 28);
	}
	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustFeeType
	 */
	@Field(28) 
	public CThostFtdcReqTransferField CustFee(double CustFee) {
		this.io.setDoubleField(this, 28, CustFee);
		return this;
	}
	/**
	 * \u04e6\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(29) 
	public double BrokerFee() {
		return this.io.getDoubleField(this, 29);
	}
	/**
	 * \u04e6\ufffd\ufffd\ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureFeeType
	 */
	@Field(29) 
	public CThostFtdcReqTransferField BrokerFee(double BrokerFee) {
		this.io.setDoubleField(this, 29, BrokerFee);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0577\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcAddInfoType
	 */
	@Array({129}) 
	@Field(30) 
	public Pointer<Byte > Message() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \u056a\u04aa<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(31) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(32) 
	public byte BankAccType() {
		return this.io.getByteField(this, 32);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(32) 
	public CThostFtdcReqTransferField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 32, BankAccType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(33) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(34) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 34);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(34) 
	public CThostFtdcReqTransferField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 34, BankSecuAccType);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\u0431\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(35) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u03bb\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(36) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 36);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(37) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 37);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(37) 
	public CThostFtdcReqTransferField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 37, BankPwdFlag);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(38) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 38);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd\ufffd\u02f6\u0531\ufffd\u05be<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(38) 
	public CThostFtdcReqTransferField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 38, SecuPwdFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05f9\ufffd\u0531<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(39) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(40) 
	public int RequestID() {
		return this.io.getIntField(this, 40);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(40) 
	public CThostFtdcReqTransferField RequestID(int RequestID) {
		this.io.setIntField(this, 40, RequestID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(41) 
	public int TID() {
		return this.io.getIntField(this, 41);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(41) 
	public CThostFtdcReqTransferField TID(int TID) {
		this.io.setIntField(this, 41, TID);
		return this;
	}
	/**
	 * \u05ea\ufffd\u02fd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(42) 
	public byte TransferStatus() {
		return this.io.getByteField(this, 42);
	}
	/**
	 * \u05ea\ufffd\u02fd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcTransferStatusType
	 */
	@Field(42) 
	public CThostFtdcReqTransferField TransferStatus(byte TransferStatus) {
		this.io.setByteField(this, 42, TransferStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcLongIndividualNameType
	 */
	@Array({161}) 
	@Field(43) 
	public Pointer<Byte > LongCustomerName() {
		return this.io.getPointerField(this, 43);
	}
	public CThostFtdcReqTransferField() {
		super();
	}
	public CThostFtdcReqTransferField(Pointer pointer) {
		super(pointer);
	}
}
