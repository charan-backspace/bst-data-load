package com.backspace.tech.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.backspace.csv.annotation.CsvColumn;

import java.time.LocalDateTime;

@Entity(name = "STATEMENT_RAW")
@Data
public class StatementRaw {

  @Column(name = "INSTITUTION_ID")
  @CsvColumn(name = "INSTITUTION_ID")
  private String INSTITUTION_ID;

  @Id
  @Column(name = "SERNO")
  @CsvColumn(name = "SERNO")
  private String SERNO;

  @Column(name = "PARTITIONKEY")
  @CsvColumn(name = "PARTITIONKEY")
  private String PARTITIONKEY;

  @Column(name = "CACCSERNO")
  @CsvColumn(name = "CACCSERNO")
  private String CACCSERNO;

  @Column(name = "CARDSERNO")
  @CsvColumn(name = "CARDSERNO")
  private String CARDSERNO;

  @Column(name = "DEF_CACCSERNO")
  @CsvColumn(name = "DEF_CACCSERNO")
  private String DEF_CACCSERNO;

  @Column(name = "PRODUCT")
  @CsvColumn(name = "PRODUCT")
  private String PRODUCT;

  @Column(name = "BATCHSERNO")
  @CsvColumn(name = "BATCHSERNO")
  private String BATCHSERNO;

  @Column(name = "TYPESERNO_ALLOC")
  @CsvColumn(name = "TYPESERNO_ALLOC")
  private String TYPESERNO_ALLOC;

  @Column(name = "TYPESERNO_FEES")
  @CsvColumn(name = "TYPESERNO_FEES")
  private String TYPESERNO_FEES;

  @Column(name = "TYPESERNO_REPORTS")
  @CsvColumn(name = "TYPESERNO_REPORTS")
  private String TYPESERNO_REPORTS;

  @Column(name = "TYPESERNO_REWARDS")
  @CsvColumn(name = "TYPESERNO_REWARDS")
  private String TYPESERNO_REWARDS;

  @Column(name = "TYPESERNO_GLEDGER")
  @CsvColumn(name = "TYPESERNO_GLEDGER")
  private String TYPESERNO_GLEDGER;

  @Column(name = "TYPESERNO_DIVERT")
  @CsvColumn(name = "TYPESERNO_DIVERT")
  private String TYPESERNO_DIVERT;

  @Column(name = "TYPESERNO_NOPOST")
  @CsvColumn(name = "TYPESERNO_NOPOST")
  private String TYPESERNO_NOPOST;

  @Column(name = "TYPESERNO_PROBE")
  @CsvColumn(name = "TYPESERNO_PROBE")
  private String TYPESERNO_PROBE;

  @Column(name = "TYPESERNO_TEXT")
  @CsvColumn(name = "TYPESERNO_TEXT")
  private String TYPESERNO_TEXT;

  @Column(name = "MSGCLASS")
  @CsvColumn(name = "MSGCLASS")
  private String MSGCLASS;

  @Column(name = "MSGTYPE")
  @CsvColumn(name = "MSGTYPE")
  private String MSGTYPE;

  @Column(name = "TRXNTYPE")
  @CsvColumn(name = "TRXNTYPE")
  private String TRXNTYPE;

  @Column(name = "ORIG_MSG_TYPE")
  @CsvColumn(name = "ORIG_MSG_TYPE")
  private String ORIG_MSG_TYPE;

  @Column(name = "I000_MSG_TYPE")
  @CsvColumn(name = "I000_MSG_TYPE")
  private String I000_MSG_TYPE;

  @Column(name = "I002_NUMBER")
  @CsvColumn(name = "I002_NUMBER")
  private String I002_NUMBER;

  @Column(name = "I003_PROC_CODE")
  @CsvColumn(name = "I003_PROC_CODE")
  private String I003_PROC_CODE;

  @Column(name = "I004_AMT_TRXN")
  @CsvColumn(name = "I004_AMT_TRXN")
  private String I004_AMT_TRXN;

  @Column(name = "I005_AMT_SETTLE")
  @CsvColumn(name = "I005_AMT_SETTLE")
  private String I005_AMT_SETTLE;

  @Column(name = "I006_AMT_BILL")
  @CsvColumn(name = "I006_AMT_BILL")
  private String I006_AMT_BILL;

  @Column(name = "I007_LOAD_DATE")
  @CsvColumn(name = "I007_LOAD_DATE", dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime I007_LOAD_DATE;

  @Column(name = "I008_BILLING_FEE")
  @CsvColumn(name = "I008_BILLING_FEE")
  private String I008_BILLING_FEE;

  @Column(name = "I013_TRXN_DATE")
  @CsvColumn(name = "I013_TRXN_DATE",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime I013_TRXN_DATE;

  @Column(name = "I044_REASON_CODE")
  @CsvColumn(name = "I044_REASON_CODE")
  private String I044_REASON_CODE;

  @Column(name = "I048_TEXT_DATA")
  @CsvColumn(name = "I048_TEXT_DATA")
  private String I048_TEXT_DATA;

  @Column(name = "I049_CUR_TRXN")
  @CsvColumn(name = "I049_CUR_TRXN")
  private String I049_CUR_TRXN;

  @Column(name = "I050_CUR_SETTLE")
  @CsvColumn(name = "I050_CUR_SETTLE")
  private String I050_CUR_SETTLE;

  @Column(name = "I051_CUR_BILL")
  @CsvColumn(name = "I051_CUR_BILL")
  private String I051_CUR_BILL;

  @Column(name = "CENTERCURRENCY")
  @CsvColumn(name = "CENTERCURRENCY")
  private String CENTERCURRENCY;

  @Column(name = "CENTERAMOUNT")
  @CsvColumn(name = "CENTERAMOUNT")
  private String CENTERAMOUNT;

  @Column(name = "INSTALMENTTYPE")
  @CsvColumn(name = "INSTALMENTTYPE")
  private String INSTALMENTTYPE;

  @Column(name = "INSTALMENTINDEPFLAG")
  @CsvColumn(name = "INSTALMENTINDEPFLAG")
  private String INSTALMENTINDEPFLAG;

  @Column(name = "INSTALMENTSNUMBER")
  @CsvColumn(name = "INSTALMENTSNUMBER")
  private String INSTALMENTSNUMBER;

  @Column(name = "INSTALMENTSEQ")
  @CsvColumn(name = "INSTALMENTSEQ")
  private String INSTALMENTSEQ;

  @Column(name = "INSTALMENTREPAYMENTTYPE")
  @CsvColumn(name = "INSTALMENTREPAYMENTTYPE")
  private String INSTALMENTREPAYMENTTYPE;

  @Column(name = "INSTALMENTOFFSET")
  @CsvColumn(name = "INSTALMENTOFFSET")
  private String INSTALMENTOFFSET;

  @Column(name = "INSTALMENTORIGAMOUNT")
  @CsvColumn(name = "INSTALMENTORIGAMOUNT")
  private String INSTALMENTORIGAMOUNT;

  @Column(name = "INSTALMENTTOTALAMOUNT")
  @CsvColumn(name = "INSTALMENTTOTALAMOUNT")
  private String INSTALMENTTOTALAMOUNT;

  @Column(name = "INSTALMENTPLANSERNO")
  @CsvColumn(name = "INSTALMENTPLANSERNO")
  private String INSTALMENTPLANSERNO;

  @Column(name = "INSTALMENTINTERESTANCHORDATE")
  @CsvColumn(name = "INSTALMENTINTERESTANCHORDATE")
  private String INSTALMENTINTERESTANCHORDATE;

  @Column(name = "INSTALMENTSERNO")
  @CsvColumn(name = "INSTALMENTSERNO")
  private String INSTALMENTSERNO;

  @Column(name = "INSTALMENTPARTITIONKEY")
  @CsvColumn(name = "INSTALMENTPARTITIONKEY")
  private String INSTALMENTPARTITIONKEY;

  @Column(name = "INSTALMENTAMRTPRINCIPALAMOUNT")
  @CsvColumn(name = "INSTALMENTAMRTPRINCIPALAMOUNT")
  private String INSTALMENTAMRTPRINCIPALAMOUNT;

  @Column(name = "INSTALMENTPAYMENTALLOCATION")
  @CsvColumn(name = "INSTALMENTPAYMENTALLOCATION")
  private String INSTALMENTPAYMENTALLOCATION;

  @Column(name = "MBHAGREEMENTSERNO")
  @CsvColumn(name = "MBHAGREEMENTSERNO")
  private String MBHAGREEMENTSERNO;

  @Column(name = "CONSOLIDATIONKEY")
  @CsvColumn(name = "CONSOLIDATIONKEY")
  private String CONSOLIDATIONKEY;

  @Column(name = "OFSTMTORINVOICESERNO")
  @CsvColumn(name = "OFSTMTORINVOICESERNO")
  private String OFSTMTORINVOICESERNO;

  @Column(name = "OFSTMTORINVOICEPARTITIONKEY")
  @CsvColumn(name = "OFSTMTORINVOICEPARTITIONKEY")
  private String OFSTMTORINVOICEPARTITIONKEY;

  @Column(name = "OFSTMTDATE")
  @CsvColumn(name = "OFSTMTDATE")
  private String OFSTMTDATE;

  @Column(name = "OFDUEDATE")
  @CsvColumn(name = "OFDUEDATE")
  private String OFDUEDATE;

  @Column(name = "OFOVERDUESTMTDATE")
  @CsvColumn(name = "OFOVERDUESTMTDATE")
  private String OFOVERDUESTMTDATE;

  @Column(name = "OFRECTYPE")
  @CsvColumn(name = "OFRECTYPE")
  private String OFRECTYPE;

  @Column(name = "OFTRXNTYPE")
  @CsvColumn(name = "OFTRXNTYPE")
  private String OFTRXNTYPE;

  @Column(name = "REWARDSFLAG")
  @CsvColumn(name = "REWARDSFLAG")
  private String REWARDSFLAG;

  @Column(name = "REWARDBALANCEREASONCODE")
  @CsvColumn(name = "REWARDBALANCEREASONCODE")
  private String REWARDBALANCEREASONCODE;

  @Column(name = "SINGLE_MSG_FLAG")
  @CsvColumn(name = "SINGLE_MSG_FLAG")
  private String SINGLE_MSG_FLAG;

  @Column(name = "AUTHIMMEDIATEPOSTING")
  @CsvColumn(name = "AUTHIMMEDIATEPOSTING")
  private String AUTHIMMEDIATEPOSTING;

  @Column(name = "AUTHACCOUNTTYPE")
  @CsvColumn(name = "AUTHACCOUNTTYPE")
  private String AUTHACCOUNTTYPE;

  @Column(name = "AUTHAMOUNT")
  @CsvColumn(name = "AUTHAMOUNT")
  private String AUTHAMOUNT;

  @Column(name = "ORIGINATOR")
  @CsvColumn(name = "ORIGINATOR")
  private String ORIGINATOR;

  @Column(name = "ORIGINATORREASONCODE")
  @CsvColumn(name = "ORIGINATORREASONCODE")
  private String ORIGINATORREASONCODE;

  @Column(name = "PROXYCARDNUMBER")
  @CsvColumn(name = "PROXYCARDNUMBER")
  private String PROXYCARDNUMBER;

  @Column(name = "INVOICENUMBER")
  @CsvColumn(name = "INVOICENUMBER")
  private String INVOICENUMBER;

  @Column(name = "AMOUNT")
  @CsvColumn(name = "AMOUNT")
  private String AMOUNT;

  @Column(name = "EMBEDDEDFEE")
  @CsvColumn(name = "EMBEDDEDFEE")
  private String EMBEDDEDFEE;

  @Column(name = "TOTALPOINTS")
  @CsvColumn(name = "TOTALPOINTS")
  private String TOTALPOINTS;

  @Column(name = "TOTALREBATES")
  @CsvColumn(name = "TOTALREBATES")
  private String TOTALREBATES;

  @Column(name = "TAXFLAG")
  @CsvColumn(name = "TAXFLAG")
  private String TAXFLAG;

  @Column(name = "TAXBASEAMOUNT")
  @CsvColumn(name = "TAXBASEAMOUNT")
  private String TAXBASEAMOUNT;

  @Column(name = "VALUEDATE")
  @CsvColumn(name = "VALUEDATE",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime VALUEDATE;

  @Column(name = "STARTOFINTEREST")
  @CsvColumn(name = "STARTOFINTEREST")
  private String STARTOFINTEREST;

  @Column(name = "MINDUEVALUEDATE")
  @CsvColumn(name = "MINDUEVALUEDATE")
  private String MINDUEVALUEDATE;

  @Column(name = "POSTDATE")
  @CsvColumn(name = "POSTDATE")
  private String POSTDATE;

  @Column(name = "POSTTIMESTAMP")
  @CsvColumn(name = "POSTTIMESTAMP",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime POSTTIMESTAMP;

  @Column(name = "TEXTDESCRIPTION")
  @CsvColumn(name = "TEXTDESCRIPTION")
  private String TEXTDESCRIPTION;

  @Column(name = "FGRESOLUTIONSTATUS")
  @CsvColumn(name = "FGRESOLUTIONSTATUS")
  private String FGRESOLUTIONSTATUS;

  @Column(name = "STGENERAL")
  @CsvColumn(name = "STGENERAL")
  private String STGENERAL;

  @Column(name = "LOGACTION")
  @CsvColumn(name = "LOGACTION")
  private String LOGACTION;

  @Column(name = "RECALCULATED")
  @CsvColumn(name = "RECALCULATED")
  private String RECALCULATED;

  @Column(name = "CONVERTED")
  @CsvColumn(name = "CONVERTED")
  private String CONVERTED;

  @Column(name = "INSTITUTION_ID_1")
  @CsvColumn(name = "INSTITUTION_ID_1")
  private String INSTITUTION_ID_1;

  @Column(name = "SERNO_1")
  @CsvColumn(name = "SERNO_1")
  private String SERNO_1;

  @Column(name = "PARTITIONKEY_1")
  @CsvColumn(name = "PARTITIONKEY_1")
  private String PARTITIONKEY_1;

  @Column(name = "SOURCE")
  @CsvColumn(name = "SOURCE")
  private String SOURCE;

  @Column(name = "I011_TRACE_NUM")
  @CsvColumn(name = "I011_TRACE_NUM")
  private String I011_TRACE_NUM;

  @Column(name = "I012_TRXN_TIME")
  @CsvColumn(name = "I012_TRXN_TIME")
  private String I012_TRXN_TIME;

  @Column(name = "I015_SETTLE_DATE")
  @CsvColumn(name = "I015_SETTLE_DATE",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime I015_SETTLE_DATE;

  @Column(name = "I016_CONVERS_DATE")
  @CsvColumn(name = "I016_CONVERS_DATE",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime I016_CONVERS_DATE;

  @Column(name = "I018_MERCH_TYPE")
  @CsvColumn(name = "I018_MERCH_TYPE")
  private String I018_MERCH_TYPE;

  @Column(name = "I019_ACQ_COUNTRY")
  @CsvColumn(name = "I019_ACQ_COUNTRY")
  private String I019_ACQ_COUNTRY;

  @Column(name = "I022_POS_ENTRY")
  @CsvColumn(name = "I022_POS_ENTRY")
  private String I022_POS_ENTRY;

  @Column(name = "I023_SEQUENCE")
  @CsvColumn(name = "I023_SEQUENCE")
  private String I023_SEQUENCE;

  @Column(name = "I024_FUNCT_CODE")
  @CsvColumn(name = "I024_FUNCT_CODE")
  private String I024_FUNCT_CODE;

  @Column(name = "I025_POS_COND")
  @CsvColumn(name = "I025_POS_COND")
  private String I025_POS_COND;

  @Column(name = "I028_TRXN_FEE")
  @CsvColumn(name = "I028_TRXN_FEE")
  private String I028_TRXN_FEE;

  @Column(name = "I031_ARN")
  @CsvColumn(name = "I031_ARN")
  private String I031_ARN;

  @Column(name = "I032_ACQUIRER_ID")
  @CsvColumn(name = "I032_ACQUIRER_ID")
  private String I032_ACQUIRER_ID;

  @Column(name = "I037_RET_REF_NUM")
  @CsvColumn(name = "I037_RET_REF_NUM")
  private String I037_RET_REF_NUM;

  @Column(name = "I038_AUTH_ID")
  @CsvColumn(name = "I038_AUTH_ID")
  private String I038_AUTH_ID;

  @Column(name = "I039_RESP_CD")
  @CsvColumn(name = "I039_RESP_CD")
  private String I039_RESP_CD;

  @Column(name = "I041_POS_ID")
  @CsvColumn(name = "I041_POS_ID")
  private String I041_POS_ID;

  @Column(name = "I042_MERCH_ID")
  @CsvColumn(name = "I042_MERCH_ID")
  private String I042_MERCH_ID;

  @Column(name = "I043A_MERCH_NAME")
  @CsvColumn(name = "I043A_MERCH_NAME")
  private String I043A_MERCH_NAME;

  @Column(name = "I043B_MERCH_CITY")
  @CsvColumn(name = "I043B_MERCH_CITY")
  private String I043B_MERCH_CITY;

  @Column(name = "I043C_MERCH_CNT")
  @CsvColumn(name = "I043C_MERCH_CNT")
  private String I043C_MERCH_CNT;

  @Column(name = "I059_POS_GEO_DATA")
  @CsvColumn(name = "I059_POS_GEO_DATA")
  private String I059_POS_GEO_DATA;

  @Column(name = "I060_POS_CAP")
  @CsvColumn(name = "I060_POS_CAP")
  private String I060_POS_CAP;

  @Column(name = "I062V2_TRANS_ID")
  @CsvColumn(name = "I062V2_TRANS_ID")
  private String I062V2_TRANS_ID;

  @Column(name = "I062M_INF_DATA")
  @CsvColumn(name = "I062M_INF_DATA")
  private String I062M_INF_DATA;

  @Column(name = "CASHBACKAMOUNT")
  @CsvColumn(name = "CASHBACKAMOUNT")
  private String CASHBACKAMOUNT;

  @Column(name = "PSVATAMOUNT")
  @CsvColumn(name = "PSVATAMOUNT")
  private String PSVATAMOUNT;

  @Column(name = "TRXNENTRY")
  @CsvColumn(name = "TRXNENTRY")
  private String TRXNENTRY;

  @Column(name = "TRXNQUALIFIER")
  @CsvColumn(name = "TRXNQUALIFIER")
  private String TRXNQUALIFIER;

  @Column(name = "TRXNMSGIDENTIFIER")
  @CsvColumn(name = "TRXNMSGIDENTIFIER")
  private String TRXNMSGIDENTIFIER;

  @Column(name = "SUMMCOMCODE")
  @CsvColumn(name = "SUMMCOMCODE")
  private String SUMMCOMCODE;

  @Column(name = "PAYMENTMODE")
  @CsvColumn(name = "PAYMENTMODE")
  private String PAYMENTMODE;

  @Column(name = "OFFLINEAUTHFLAG")
  @CsvColumn(name = "OFFLINEAUTHFLAG")
  private String OFFLINEAUTHFLAG;

  @Column(name = "AUTHTRXNTYPE")
  @CsvColumn(name = "AUTHTRXNTYPE")
  private String AUTHTRXNTYPE;

  @Column(name = "AUTHSERNO")
  @CsvColumn(name = "AUTHSERNO")
  private String AUTHSERNO;

  @Column(name = "AUTHPARTITIONKEY")
  @CsvColumn(name = "AUTHPARTITIONKEY")
  private String AUTHPARTITIONKEY;

  @Column(name = "AUTHREASONCODE")
  @CsvColumn(name = "AUTHREASONCODE")
  private String AUTHREASONCODE;

  @Column(name = "AUTHRESPONSEDESCRIPTION")
  @CsvColumn(name = "AUTHRESPONSEDESCRIPTION")
  private String AUTHRESPONSEDESCRIPTION;

  @Column(name = "AUTHREASONDESCRIPTION")
  @CsvColumn(name = "AUTHREASONDESCRIPTION")
  private String AUTHREASONDESCRIPTION;

  @Column(name = "ACQCOUNTRYCODE")
  @CsvColumn(name = "ACQCOUNTRYCODE")
  private String ACQCOUNTRYCODE;

  @Column(name = "ACQREGION")
  @CsvColumn(name = "ACQREGION")
  private String ACQREGION;

  @Column(name = "PRODUCTCODE")
  @CsvColumn(name = "PRODUCTCODE")
  private String PRODUCTCODE;

  @Column(name = "FUELACCEPTANCEMODE")
  @CsvColumn(name = "FUELACCEPTANCEMODE")
  private String FUELACCEPTANCEMODE;

  @Column(name = "UNITS")
  @CsvColumn(name = "UNITS")
  private String UNITS;

  @Column(name = "UNITOFMEASURE")
  @CsvColumn(name = "UNITOFMEASURE")
  private String UNITOFMEASURE;

  @Column(name = "UNITPRICE")
  @CsvColumn(name = "UNITPRICE")
  private String UNITPRICE;

  @Column(name = "FLEETNUMBER")
  @CsvColumn(name = "FLEETNUMBER")
  private String FLEETNUMBER;

  @Column(name = "FLEETBRAND")
  @CsvColumn(name = "FLEETBRAND")
  private String FLEETBRAND;

  @Column(name = "LINEITEMIND")
  @CsvColumn(name = "LINEITEMIND")
  private String LINEITEMIND;

  @Column(name = "FINALLINEITEMIND")
  @CsvColumn(name = "FINALLINEITEMIND")
  private String FINALLINEITEMIND;

  @Column(name = "LIORIGTRXNAMOUNT")
  @CsvColumn(name = "LIORIGTRXNAMOUNT")
  private String LIORIGTRXNAMOUNT;

  @Column(name = "FEEPROGRAMIND")
  @CsvColumn(name = "FEEPROGRAMIND")
  private String FEEPROGRAMIND;

  @Column(name = "INTERCHANGEFEEIND")
  @CsvColumn(name = "INTERCHANGEFEEIND")
  private String INTERCHANGEFEEIND;

  @Column(name = "INTERCHANGEFEEAMOUNT")
  @CsvColumn(name = "INTERCHANGEFEEAMOUNT")
  private String INTERCHANGEFEEAMOUNT;

  @Column(name = "SOURCETOBASEEXRATE")
  @CsvColumn(name = "SOURCETOBASEEXRATE")
  private String SOURCETOBASEEXRATE;

  @Column(name = "BASETODESTEXRATE")
  @CsvColumn(name = "BASETODESTEXRATE")
  private String BASETODESTEXRATE;

  @Column(name = "INTERCHANGEFEECURRENCY")
  @CsvColumn(name = "INTERCHANGEFEECURRENCY")
  private String INTERCHANGEFEECURRENCY;

  @Column(name = "MULTIPLECLEARINGIND")
  @CsvColumn(name = "MULTIPLECLEARINGIND")
  private String MULTIPLECLEARINGIND;

  @Column(name = "TOKEN")
  @CsvColumn(name = "TOKEN")
  private String TOKEN;

  @Column(name = "TOKENASSURANCELEVEL")
  @CsvColumn(name = "TOKENASSURANCELEVEL")
  private String TOKENASSURANCELEVEL;

  @Column(name = "TOKENREQUESTORID")
  @CsvColumn(name = "TOKENREQUESTORID")
  private String TOKENREQUESTORID;

  @Column(name = "WALLETIDENTIFIER")
  @CsvColumn(name = "WALLETIDENTIFIER")
  private String WALLETIDENTIFIER;

  @Column(name = "CONVERTED_1")
  @CsvColumn(name = "CONVERTED_1")
  private String CONVERTED_1;

}
