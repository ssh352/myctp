package com.xceder.ctp.trade;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\u3de8\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:5903</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thosttraderapi") 
public class CThostFtdcInvestorWithdrawAlgorithmField extends StructObject {
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
	public CThostFtdcInvestorWithdrawAlgorithmField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public double UsingRatio() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(3) 
	public CThostFtdcInvestorWithdrawAlgorithmField UsingRatio(double UsingRatio) {
		this.io.setDoubleField(this, 3, UsingRatio);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(4) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double FundMortgageRatio() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u047a\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CThostFtdcInvestorWithdrawAlgorithmField FundMortgageRatio(double FundMortgageRatio) {
		this.io.setDoubleField(this, 5, FundMortgageRatio);
		return this;
	}
	public CThostFtdcInvestorWithdrawAlgorithmField() {
		super();
	}
	public CThostFtdcInvestorWithdrawAlgorithmField(Pointer pointer) {
		super(pointer);
	}
}
