package com.backspace.tech.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.backspace.csv.annotation.CsvColumn;

import java.time.LocalDateTime;

@Entity(name = "AUTH_RAW")
@Data
public class AuthRaw {
  
  @Id
  @Column(name="SERNO")
  @CsvColumn(name = "SERNO")
  private String SERNO;

  @Column(name="INSTITUTION_ID")
  @CsvColumn(name = "INSTITUTION_ID")
  private String INSTITUTION_ID;

  @Column(name="PARTITIONKEY")
  @CsvColumn(name = "PARTITIONKEY")
  private String PARTITIONKEY;

  @Column(name="LTIMESTAMP")
  @CsvColumn(name = "LTIMESTAMP",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime LTIMESTAMP;

  @Column(name="PROCESSTIMEMS")
  @CsvColumn(name = "PROCESSTIMEMS")
  private String PROCESSTIMEMS;

  @Column(name="FGPROCESSTIMEMS")
  @CsvColumn(name = "FGPROCESSTIMEMS")
  private String FGPROCESSTIMEMS;

  @Column(name="FSPROCESSTIMEMS")
  @CsvColumn(name = "FSPROCESSTIMEMS")
  private String FSPROCESSTIMEMS;

  @Column(name="GROUPFROMSERIAL")
  @CsvColumn(name = "GROUPFROMSERIAL")
  private String GROUPFROMSERIAL;

  @Column(name="GROUPTOSERIAL")
  @CsvColumn(name = "GROUPTOSERIAL")
  private String GROUPTOSERIAL;

  @Column(name="EDCSERNO")
  @CsvColumn(name = "EDCSERNO")
  private String EDCSERNO;

  @Column(name="CARDSERNO")
  @CsvColumn(name = "CARDSERNO")
  private String CARDSERNO;

  @Column(name="PRIMECARDSERNO")
  @CsvColumn(name = "PRIMECARDSERNO")
  private String PRIMECARDSERNO;

  @Column(name="CARDPRODUCTSERNO")
  @CsvColumn(name = "CARDPRODUCTSERNO")
  private String CARDPRODUCTSERNO;

  @Column(name="CARDCURRENCY")
  @CsvColumn(name = "CARDCURRENCY")
  private String CARDCURRENCY;

  @Column(name="EODSERNO")
  @CsvColumn(name = "EODSERNO")
  private String EODSERNO;

  @Column(name="ORIGSERNO")
  @CsvColumn(name = "ORIGSERNO")
  private String ORIGSERNO;

  @Column(name="ISOLOGSERNO")
  @CsvColumn(name = "ISOLOGSERNO")
  private String ISOLOGSERNO;

  @Column(name="ACQLOGSERNO")
  @CsvColumn(name = "ACQLOGSERNO")
  private String ACQLOGSERNO;

  @Column(name="EXTSERNO")
  @CsvColumn(name = "EXTSERNO")
  private String EXTSERNO;

  @Column(name="SOURCE")
  @CsvColumn(name = "SOURCE")
  private String SOURCE;

  @Column(name="SOURCEFULLNAME")
  @CsvColumn(name = "SOURCEFULLNAME")
  private String SOURCEFULLNAME;

  @Column(name="MSGSOURCENAME")
  @CsvColumn(name = "MSGSOURCENAME")
  private String MSGSOURCENAME;

  @Column(name="NODENUMBER")
  @CsvColumn(name = "NODENUMBER")
  private String NODENUMBER;

  @Column(name="FORMAT")
  @CsvColumn(name = "FORMAT")
  private String FORMAT;

  @Column(name="REASONCODE")
  @CsvColumn(name = "REASONCODE")
  private String REASONCODE;

  @Column(name="OTB_AMT_CENTER")
  @CsvColumn(name = "OTB_AMT_CENTER")
  private String OTB_AMT_CENTER;

  @Column(name="OTB_AMT_CARD")
  @CsvColumn(name = "OTB_AMT_CARD")
  private String OTB_AMT_CARD;

  @Column(name="AMT_CENTER")
  @CsvColumn(name = "AMT_CENTER")
  private String AMT_CENTER;

  @Column(name="AMT_CARD")
  @CsvColumn(name = "AMT_CARD")
  private String AMT_CARD;

  @Column(name="AMT_CARD_MATCHED")
  @CsvColumn(name = "AMT_CARD_MATCHED")
  private String AMT_CARD_MATCHED;

  @Column(name="ORIG_AMT_CENTER")
  @CsvColumn(name = "ORIG_AMT_CENTER")
  private String ORIG_AMT_CENTER;

  @Column(name="ORIG_AMT_CARD")
  @CsvColumn(name = "ORIG_AMT_CARD")
  private String ORIG_AMT_CARD;

  @Column(name="FEE_AMT_CARD")
  @CsvColumn(name = "FEE_AMT_CARD")
  private String FEE_AMT_CARD;

  @Column(name="FEE_AMT_CENTER")
  @CsvColumn(name = "FEE_AMT_CENTER")
  private String FEE_AMT_CENTER;

  @Column(name="FEE_VAT_AMT_CARD")
  @CsvColumn(name = "FEE_VAT_AMT_CARD")
  private String FEE_VAT_AMT_CARD;

  @Column(name="FEE_VAT_AMT_CENTER")
  @CsvColumn(name = "FEE_VAT_AMT_CENTER")
  private String FEE_VAT_AMT_CENTER;

  @Column(name="AUTH_APR")
  @CsvColumn(name = "AUTH_APR")
  private String AUTH_APR;

  @Column(name="REDEEMAMOUNT")
  @CsvColumn(name = "REDEEMAMOUNT")
  private String REDEEMAMOUNT;

  @Column(name="DISCOUNTAMOUNT")
  @CsvColumn(name = "DISCOUNTAMOUNT")
  private String DISCOUNTAMOUNT;

  @Column(name="SAFFLAG")
  @CsvColumn(name = "SAFFLAG")
  private String SAFFLAG;

  @Column(name="DEBITPORT")
  @CsvColumn(name = "DEBITPORT")
  private String DEBITPORT;

  @Column(name="SAFTIMESTAMP")
  @CsvColumn(name = "SAFTIMESTAMP")
  private String SAFTIMESTAMP;

  @Column(name="SAFRETRYCOUNT")
  @CsvColumn(name = "SAFRETRYCOUNT")
  private String SAFRETRYCOUNT;

  @Column(name="BATCHNO")
  @CsvColumn(name = "BATCHNO")
  private String BATCHNO;

  @Column(name="MSGFLAGS")
  @CsvColumn(name = "MSGFLAGS")
  private String MSGFLAGS;

  @Column(name="ADDITIONALFLAGS")
  @CsvColumn(name = "ADDITIONALFLAGS")
  private String ADDITIONALFLAGS;

  @Column(name="AFFECTEDOTBS")
  @CsvColumn(name = "AFFECTEDOTBS")
  private String AFFECTEDOTBS;

  @Column(name="EXTERNALLOGSERNO")
  @CsvColumn(name = "EXTERNALLOGSERNO")
  private String EXTERNALLOGSERNO;

  @Column(name="TRXNSERNO")
  @CsvColumn(name = "TRXNSERNO")
  private String TRXNSERNO;

  @Column(name="TRXNDATE")
  @CsvColumn(name = "TRXNDATE")
  private String TRXNDATE;

  @Column(name="ISSUER_FEESERNO")
  @CsvColumn(name = "ISSUER_FEESERNO")
  private String ISSUER_FEESERNO;

  @Column(name="AUTH_FEESERNO")
  @CsvColumn(name = "AUTH_FEESERNO")
  private String AUTH_FEESERNO;

  @Column(name="MATCHTIME")
  @CsvColumn(name = "MATCHTIME",dateFormat = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime MATCHTIME;

  @Column(name="DROPDATE")
  @CsvColumn(name = "DROPDATE")
  private String DROPDATE;

  @Column(name="ACTION_RESCODE")
  @CsvColumn(name = "ACTION_RESCODE")
  private String ACTION_RESCODE;

  @Column(name="WORKERID")
  @CsvColumn(name = "WORKERID")
  private String WORKERID;

  @Column(name="MSGTRXNTYPE")
  @CsvColumn(name = "MSGTRXNTYPE")
  private String MSGTRXNTYPE;

  @Column(name="MSGTRXNMODE")
  @CsvColumn(name = "MSGTRXNMODE")
  private String MSGTRXNMODE;

  @Column(name="MSGTRXNCOUNTRY")
  @CsvColumn(name = "MSGTRXNCOUNTRY")
  private String MSGTRXNCOUNTRY;

  @Column(name="MSGTRXNSPECIFICS")
  @CsvColumn(name = "MSGTRXNSPECIFICS")
  private String MSGTRXNSPECIFICS;

  @Column(name="MSGTRXNPINDETAILS")
  @CsvColumn(name = "MSGTRXNPINDETAILS")
  private String MSGTRXNPINDETAILS;

  @Column(name="MSGCLASS")
  @CsvColumn(name = "MSGCLASS")
  private String MSGCLASS;

  @Column(name="MSGTYPE")
  @CsvColumn(name = "MSGTYPE")
  private String MSGTYPE;

  @Column(name="MSGTRXNSTATE")
  @CsvColumn(name = "MSGTRXNSTATE")
  private String MSGTRXNSTATE;

  @Column(name="MSGTRXNPOSTALCODE")
  @CsvColumn(name = "MSGTRXNPOSTALCODE")
  private String MSGTRXNPOSTALCODE;

  @Column(name="TRXNTYPE")
  @CsvColumn(name = "TRXNTYPE")
  private String TRXNTYPE;

  @Column(name="TRXNSUBTYPE")
  @CsvColumn(name = "TRXNSUBTYPE")
  private String TRXNSUBTYPE;

  @Column(name="TRXNENTRY")
  @CsvColumn(name = "TRXNENTRY")
  private String TRXNENTRY;

  @Column(name="TRANSACTION_ID")
  @CsvColumn(name = "TRANSACTION_ID")
  private String TRANSACTION_ID;

  @Column(name="ORIGINATORSREASON")
  @CsvColumn(name = "ORIGINATORSREASON")
  private String ORIGINATORSREASON;

  @Column(name="LINEITEMS")
  @CsvColumn(name = "LINEITEMS")
  private String LINEITEMS;

  @Column(name="CARDBIN")
  @CsvColumn(name = "CARDBIN")
  private String CARDBIN;

  @Column(name="PCARDSERNO")
  @CsvColumn(name = "PCARDSERNO")
  private String PCARDSERNO;

  @Column(name="REPAYMENTSNUMBER")
  @CsvColumn(name = "REPAYMENTSNUMBER")
  private String REPAYMENTSNUMBER;

  @Column(name="INSTALLMENT_DATA")
  @CsvColumn(name = "INSTALLMENT_DATA")
  private String INSTALLMENT_DATA;

  @Column(name="MATCHCOUNT")
  @CsvColumn(name = "MATCHCOUNT")
  private String MATCHCOUNT;

  @Column(name="AUTHLIMITEXTSERNO")
  @CsvColumn(name = "AUTHLIMITEXTSERNO")
  private String AUTHLIMITEXTSERNO;

  @Column(name="GPCREDITAFFECTOTB")
  @CsvColumn(name = "GPCREDITAFFECTOTB")
  private String GPCREDITAFFECTOTB;

  @Column(name="FGRESOLUTIONSTATUS")
  @CsvColumn(name = "FGRESOLUTIONSTATUS")
  private String FGRESOLUTIONSTATUS;

  @Column(name="PAYMENTSCHEMEREASONCODE")
  @CsvColumn(name = "PAYMENTSCHEMEREASONCODE")
  private String PAYMENTSCHEMEREASONCODE;

  @Column(name="EXTERNALFSSENTMODE")
  @CsvColumn(name = "EXTERNALFSSENTMODE")
  private String EXTERNALFSSENTMODE;

  @Column(name="EXTERNALFSPREMODERESPONSE")
  @CsvColumn(name = "EXTERNALFSPREMODERESPONSE")
  private String EXTERNALFSPREMODERESPONSE;

  @Column(name="PANTYPE")
  @CsvColumn(name = "PANTYPE")
  private String PANTYPE;

  @Column(name="OTP")
  @CsvColumn(name = "OTP")
  private String OTP;

  @Column(name="TOKENSERNO")
  @CsvColumn(name = "TOKENSERNO")
  private String TOKENSERNO;

  @Column(name="INSTALMENTTYPE")
  @CsvColumn(name = "INSTALMENTTYPE")
  private String INSTALMENTTYPE;

  @Column(name="I000_MSG_TYPE")
  @CsvColumn(name = "I000_MSG_TYPE")
  private String I000_MSG_TYPE;

  @Column(name="I002_NUMBER")
  @CsvColumn(name = "I002_NUMBER")
  private String I002_NUMBER;

  @Column(name="I003_PROC_CODE")
  @CsvColumn(name = "I003_PROC_CODE")
  private String I003_PROC_CODE;

  @Column(name="I004_AMT_TRXN")
  @CsvColumn(name = "I004_AMT_TRXN")
  private String I004_AMT_TRXN;

  @Column(name="I005_AMT_SETTLE")
  @CsvColumn(name = "I005_AMT_SETTLE")
  private String I005_AMT_SETTLE;

  @Column(name="I006_AMT_BILL")
  @CsvColumn(name = "I006_AMT_BILL")
  private String I006_AMT_BILL;

  @Column(name="I007_TRANS_DT")
  @CsvColumn(name = "I007_TRANS_DT")
  private String I007_TRANS_DT;

  @Column(name="I009_SETL_CONV")
  @CsvColumn(name = "I009_SETL_CONV")
  private String I009_SETL_CONV;

  @Column(name="I011_TRACE_NUM")
  @CsvColumn(name = "I011_TRACE_NUM")
  private String I011_TRACE_NUM;

  @Column(name="I012_LCL_TIME")
  @CsvColumn(name = "I012_LCL_TIME")
  private String I012_LCL_TIME;

  @Column(name="I013_LCL_DT")
  @CsvColumn(name = "I013_LCL_DT")
  private String I013_LCL_DT;

  @Column(name="I014_EXP_DATE")
  @CsvColumn(name = "I014_EXP_DATE")
  private String I014_EXP_DATE;

  @Column(name="I015_SETL_DT")
  @CsvColumn(name = "I015_SETL_DT")
  private String I015_SETL_DT;

  @Column(name="I016_CONV_DT")
  @CsvColumn(name = "I016_CONV_DT")
  private String I016_CONV_DT;

  @Column(name="I017_CAP_DT")
  @CsvColumn(name = "I017_CAP_DT")
  private String I017_CAP_DT;

  @Column(name="I018_MERCH_TYPE")
  @CsvColumn(name = "I018_MERCH_TYPE")
  private String I018_MERCH_TYPE;

  @Column(name="I019_ACQ_COUNTRY")
  @CsvColumn(name = "I019_ACQ_COUNTRY")
  private String I019_ACQ_COUNTRY;

  @Column(name="I021_FWD_CNTRY")
  @CsvColumn(name = "I021_FWD_CNTRY")
  private String I021_FWD_CNTRY;

  @Column(name="I022_POS_ENTRY")
  @CsvColumn(name = "I022_POS_ENTRY")
  private String I022_POS_ENTRY;

  @Column(name="I023_CARD_SEQ_NUM")
  @CsvColumn(name = "I023_CARD_SEQ_NUM")
  private String I023_CARD_SEQ_NUM;

  @Column(name="I024_INT_NETWK_ID")
  @CsvColumn(name = "I024_INT_NETWK_ID")
  private String I024_INT_NETWK_ID;

  @Column(name="I025_POS_COND")
  @CsvColumn(name = "I025_POS_COND")
  private String I025_POS_COND;

  @Column(name="I026_ACCPTR_BUSCD")
  @CsvColumn(name = "I026_ACCPTR_BUSCD")
  private String I026_ACCPTR_BUSCD;

  @Column(name="I028_TRANSFER_FEE")
  @CsvColumn(name = "I028_TRANSFER_FEE")
  private String I028_TRANSFER_FEE;

  @Column(name="I029_SETL_FEE")
  @CsvColumn(name = "I029_SETL_FEE")
  private String I029_SETL_FEE;

  @Column(name="I030_TRSF_PRC_FEE")
  @CsvColumn(name = "I030_TRSF_PRC_FEE")
  private String I030_TRSF_PRC_FEE;

  @Column(name="I031_SETL_PROC_FEE")
  @CsvColumn(name = "I031_SETL_PROC_FEE")
  private String I031_SETL_PROC_FEE;

  @Column(name="I032_ACQUIRER_ID")
  @CsvColumn(name = "I032_ACQUIRER_ID")
  private String I032_ACQUIRER_ID;

  @Column(name="I033_FORWARDER_ID")
  @CsvColumn(name = "I033_FORWARDER_ID")
  private String I033_FORWARDER_ID;

  @Column(name="I035_TRK_2")
  @CsvColumn(name = "I035_TRK_2")
  private String I035_TRK_2;

  @Column(name="I036_TRK_3")
  @CsvColumn(name = "I036_TRK_3")
  private String I036_TRK_3;

  @Column(name="I037_RET_REF_NUM")
  @CsvColumn(name = "I037_RET_REF_NUM")
  private String I037_RET_REF_NUM;

  @Column(name="I038_AUTH_ID")
  @CsvColumn(name = "I038_AUTH_ID")
  private String I038_AUTH_ID;

  @Column(name="I039_RSP_CD")
  @CsvColumn(name = "I039_RSP_CD")
  private String I039_RSP_CD;

  @Column(name="I040_SVC_RSTR_CD")
  @CsvColumn(name = "I040_SVC_RSTR_CD")
  private String I040_SVC_RSTR_CD;

  @Column(name="I041_POS_ID")
  @CsvColumn(name = "I041_POS_ID")
  private String I041_POS_ID;

  @Column(name="I042_MERCH_ID")
  @CsvColumn(name = "I042_MERCH_ID")
  private String I042_MERCH_ID;

  @Column(name="I043A_MERCH_NAME")
  @CsvColumn(name = "I043A_MERCH_NAME")
  private String I043A_MERCH_NAME;

  @Column(name="I043B_MERCH_CITY")
  @CsvColumn(name = "I043B_MERCH_CITY")
  private String I043B_MERCH_CITY;

  @Column(name="I043C_MERCH_CNT")
  @CsvColumn(name = "I043C_MERCH_CNT")
  private String I043C_MERCH_CNT;

  @Column(name="I044_ADDTNL_RSP")
  @CsvColumn(name = "I044_ADDTNL_RSP")
  private String I044_ADDTNL_RSP;

  @Column(name="I045_TRK_1")
  @CsvColumn(name = "I045_TRK_1")
  private String I045_TRK_1;

  @Column(name="I046_SURCHARGE_FEE")
  @CsvColumn(name = "I046_SURCHARGE_FEE")
  private String I046_SURCHARGE_FEE;

  @Column(name="I047_NAT_ADDTNL_DT")
  @CsvColumn(name = "I047_NAT_ADDTNL_DT")
  private String I047_NAT_ADDTNL_DT;

  @Column(name="I048_TEXT_DATA")
  @CsvColumn(name = "I048_TEXT_DATA")
  private String I048_TEXT_DATA;

  @Column(name="I049_CUR_TRXN")
  @CsvColumn(name = "I049_CUR_TRXN")
  private String I049_CUR_TRXN;

  @Column(name="I050_CUR_SETTLE")
  @CsvColumn(name = "I050_CUR_SETTLE")
  private String I050_CUR_SETTLE;

  @Column(name="I051_CUR_BILL")
  @CsvColumn(name = "I051_CUR_BILL")
  private String I051_CUR_BILL;

  @Column(name="I052_PIN")
  @CsvColumn(name = "I052_PIN")
  private String I052_PIN;

  @Column(name="I053_SEC_CNTRL")
  @CsvColumn(name = "I053_SEC_CNTRL")
  private String I053_SEC_CNTRL;

  @Column(name="I054_ADDTNL_AMT")
  @CsvColumn(name = "I054_ADDTNL_AMT")
  private String I054_ADDTNL_AMT;

  @Column(name="I055_ICC_DATA")
  @CsvColumn(name = "I055_ICC_DATA")
  private String I055_ICC_DATA;

  @Column(name="I056_ORG_DATA")
  @CsvColumn(name = "I056_ORG_DATA")
  private String I056_ORG_DATA;

  @Column(name="I057_ADDTNL_DATA")
  @CsvColumn(name = "I057_ADDTNL_DATA")
  private String I057_ADDTNL_DATA;

  @Column(name="I058_AUTH_AGENT")
  @CsvColumn(name = "I058_AUTH_AGENT")
  private String I058_AUTH_AGENT;

  @Column(name="I059_POS_GEO_DATA")
  @CsvColumn(name = "I059_POS_GEO_DATA")
  private String I059_POS_GEO_DATA;

  @Column(name="I060_POS_CAP")
  @CsvColumn(name = "I060_POS_CAP")
  private String I060_POS_CAP;

  @Column(name="I061V1_OTH_AMT_TXN")
  @CsvColumn(name = "I061V1_OTH_AMT_TXN")
  private String I061V1_OTH_AMT_TXN;

  @Column(name="I061V2_OTH_AMT_BIL")
  @CsvColumn(name = "I061V2_OTH_AMT_BIL")
  private String I061V2_OTH_AMT_BIL;

  @Column(name="I061V3_REP_AMT_BIL")
  @CsvColumn(name = "I061V3_REP_AMT_BIL")
  private String I061V3_REP_AMT_BIL;

  @Column(name="I062V1_AUTH_CHAR")
  @CsvColumn(name = "I062V1_AUTH_CHAR")
  private String I062V1_AUTH_CHAR;

  @Column(name="I062V2_TRANS_ID")
  @CsvColumn(name = "I062V2_TRANS_ID")
  private String I062V2_TRANS_ID;

  @Column(name="I062V3_VALIDAT_CD")
  @CsvColumn(name = "I062V3_VALIDAT_CD")
  private String I062V3_VALIDAT_CD;

  @Column(name="I062V4_MRKT_DATA")
  @CsvColumn(name = "I062V4_MRKT_DATA")
  private String I062V4_MRKT_DATA;

  @Column(name="I062V5_DURATION")
  @CsvColumn(name = "I062V5_DURATION")
  private String I062V5_DURATION;

  @Column(name="I062V6_PRSTG_PROP")
  @CsvColumn(name = "I062V6_PRSTG_PROP")
  private String I062V6_PRSTG_PROP;

  @Column(name="I062V7_PURCHASE_IDENTIFIER")
  @CsvColumn(name = "I062V7_PURCHASE_IDENTIFIER")
  private String I062V7_PURCHASE_IDENTIFIER;

  @Column(name="I062V21_RISK_SCORE_RS")
  @CsvColumn(name = "I062V21_RISK_SCORE_RS")
  private String I062V21_RISK_SCORE_RS;

  @Column(name="I062V22_RISK_COND_CD")
  @CsvColumn(name = "I062V22_RISK_COND_CD")
  private String I062V22_RISK_COND_CD;

  @Column(name="I063_BANKNET_DATA")
  @CsvColumn(name = "I063_BANKNET_DATA")
  private String I063_BANKNET_DATA;

  @Column(name="I063V1_NETWORK_ID")
  @CsvColumn(name = "I063V1_NETWORK_ID")
  private String I063V1_NETWORK_ID;

  @Column(name="I063V2_TIME_LIMIT")
  @CsvColumn(name = "I063V2_TIME_LIMIT")
  private String I063V2_TIME_LIMIT;

  @Column(name="I063V3_MIS_CAS_RD")
  @CsvColumn(name = "I063V3_MIS_CAS_RD")
  private String I063V3_MIS_CAS_RD;

  @Column(name="I063V4_STIP_RS")
  @CsvColumn(name = "I063V4_STIP_RS")
  private String I063V4_STIP_RS;

  @Column(name="I063V5_PMC_ID")
  @CsvColumn(name = "I063V5_PMC_ID")
  private String I063V5_PMC_ID;

  @Column(name="I063V19_FEE_PROG_IND")
  @CsvColumn(name = "I063V19_FEE_PROG_IND")
  private String I063V19_FEE_PROG_IND;

  @Column(name="I068_RCV_CNTRY")
  @CsvColumn(name = "I068_RCV_CNTRY")
  private String I068_RCV_CNTRY;

  @Column(name="I072_MSG_NUM_LST")
  @CsvColumn(name = "I072_MSG_NUM_LST")
  private String I072_MSG_NUM_LST;

  @Column(name="I090_ORIG_DATA")
  @CsvColumn(name = "I090_ORIG_DATA")
  private String I090_ORIG_DATA;

  @Column(name="I092_FILE_SEC_CD")
  @CsvColumn(name = "I092_FILE_SEC_CD")
  private String I092_FILE_SEC_CD;

  @Column(name="I093_RSP_IND")
  @CsvColumn(name = "I093_RSP_IND")
  private String I093_RSP_IND;

  @Column(name="I094_SVC_IND")
  @CsvColumn(name = "I094_SVC_IND")
  private String I094_SVC_IND;

  @Column(name="I095_ACT_TRAN_AMT")
  @CsvColumn(name = "I095_ACT_TRAN_AMT")
  private String I095_ACT_TRAN_AMT;

  @Column(name="I100_RCV_INST")
  @CsvColumn(name = "I100_RCV_INST")
  private String I100_RCV_INST;

  @Column(name="I101_FILE_NAME")
  @CsvColumn(name = "I101_FILE_NAME")
  private String I101_FILE_NAME;

  @Column(name="I102_ACCT_ID1")
  @CsvColumn(name = "I102_ACCT_ID1")
  private String I102_ACCT_ID1;

  @Column(name="I103_ACCT_ID2")
  @CsvColumn(name = "I103_ACCT_ID2")
  private String I103_ACCT_ID2;

  @Column(name="I104_TRAN_DESC")
  @CsvColumn(name = "I104_TRAN_DESC")
  private String I104_TRAN_DESC;

  @Column(name="I108_REFERENCE_DATA")
  @CsvColumn(name = "I108_REFERENCE_DATA")
  private String I108_REFERENCE_DATA;

  @Column(name="I112_NATIONAL_USE")
  @CsvColumn(name = "I112_NATIONAL_USE")
  private String I112_NATIONAL_USE;

  @Column(name="I116_CARD_ISSER_REF_DATA")
  @CsvColumn(name = "I116_CARD_ISSER_REF_DATA")
  private String I116_CARD_ISSER_REF_DATA;

  @Column(name="I117_NATIONAL_USE")
  @CsvColumn(name = "I117_NATIONAL_USE")
  private String I117_NATIONAL_USE;

  @Column(name="I118_INTRA_COUNTRY")
  @CsvColumn(name = "I118_INTRA_COUNTRY")
  private String I118_INTRA_COUNTRY;

  @Column(name="I120_ORIG_MSG_TYP")
  @CsvColumn(name = "I120_ORIG_MSG_TYP")
  private String I120_ORIG_MSG_TYP;

  @Column(name="I120_ORIG_MSG_TYP_RESPONSE")
  @CsvColumn(name = "I120_ORIG_MSG_TYP_RESPONSE")
  private String I120_ORIG_MSG_TYP_RESPONSE;

  @Column(name="I121_ISS_INST")
  @CsvColumn(name = "I121_ISS_INST")
  private String I121_ISS_INST;

  @Column(name="I121_ISS_INST_RESPONSE")
  @CsvColumn(name = "I121_ISS_INST_RESPONSE")
  private String I121_ISS_INST_RESPONSE;

  @Column(name="I122_REMAIN_OTU")
  @CsvColumn(name = "I122_REMAIN_OTU")
  private String I122_REMAIN_OTU;

  @Column(name="I123_ADR_VER")
  @CsvColumn(name = "I123_ADR_VER")
  private String I123_ADR_VER;

  @Column(name="I124_GOODS_CODE")
  @CsvColumn(name = "I124_GOODS_CODE")
  private String I124_GOODS_CODE;

  @Column(name="I124_GOODS_CODE_RESPONSE")
  @CsvColumn(name = "I124_GOODS_CODE_RESPONSE")
  private String I124_GOODS_CODE_RESPONSE;

  @Column(name="I125_SUPP_INFO")
  @CsvColumn(name = "I125_SUPP_INFO")
  private String I125_SUPP_INFO;

  @Column(name="I126V6_CH_CSERIAL")
  @CsvColumn(name = "I126V6_CH_CSERIAL")
  private String I126V6_CH_CSERIAL;

  @Column(name="I126V7_ME_CSERIAL")
  @CsvColumn(name = "I126V7_ME_CSERIAL")
  private String I126V7_ME_CSERIAL;

  @Column(name="I126V8_TRXN_ID")
  @CsvColumn(name = "I126V8_TRXN_ID")
  private String I126V8_TRXN_ID;

  @Column(name="I126V9_STAIN")
  @CsvColumn(name = "I126V9_STAIN")
  private String I126V9_STAIN;

  @Column(name="I126V10_CVV2")
  @CsvColumn(name = "I126V10_CVV2")
  private String I126V10_CVV2;

  @Column(name="I126V13_POS_ENV")
  @CsvColumn(name = "I126V13_POS_ENV")
  private String I126V13_POS_ENV;

  @Column(name="I126V18_AGENT_UNIQ_ACC_RSLT")
  @CsvColumn(name = "I126V18_AGENT_UNIQ_ACC_RSLT")
  private String I126V18_AGENT_UNIQ_ACC_RSLT;

  @Column(name="I126V20_ADD_AUTH_METHOD")
  @CsvColumn(name = "I126V20_ADD_AUTH_METHOD")
  private String I126V20_ADD_AUTH_METHOD;

  @Column(name="I126V21_ADD_AUTH_RSN_CD")
  @CsvColumn(name = "I126V21_ADD_AUTH_RSN_CD")
  private String I126V21_ADD_AUTH_RSN_CD;

  @Column(name="I127_FIL_RCD")
  @CsvColumn(name = "I127_FIL_RCD")
  private String I127_FIL_RCD;

  @Column(name="I130_TERM_CAPA")
  @CsvColumn(name = "I130_TERM_CAPA")
  private String I130_TERM_CAPA;

  @Column(name="I131_TVR")
  @CsvColumn(name = "I131_TVR")
  private String I131_TVR;

  @Column(name="I132_UNPREDICT")
  @CsvColumn(name = "I132_UNPREDICT")
  private String I132_UNPREDICT;

  @Column(name="I133_TERM_SERIAL")
  @CsvColumn(name = "I133_TERM_SERIAL")
  private String I133_TERM_SERIAL;

  @Column(name="I134_VISA_DISCR")
  @CsvColumn(name = "I134_VISA_DISCR")
  private String I134_VISA_DISCR;

  @Column(name="I135A_PREAUTHTRACE")
  @CsvColumn(name = "I135A_PREAUTHTRACE")
  private String I135A_PREAUTHTRACE;

  @Column(name="I135B_PURCHTRACE")
  @CsvColumn(name = "I135B_PURCHTRACE")
  private String I135B_PURCHTRACE;

  @Column(name="I135C_CRYPTTRACE")
  @CsvColumn(name = "I135C_CRYPTTRACE")
  private String I135C_CRYPTTRACE;

  @Column(name="I135D_KEYVERSION")
  @CsvColumn(name = "I135D_KEYVERSION")
  private String I135D_KEYVERSION;

  @Column(name="I136_CRYPTOGRAM")
  @CsvColumn(name = "I136_CRYPTOGRAM")
  private String I136_CRYPTOGRAM;

  @Column(name="I137_ATC")
  @CsvColumn(name = "I137_ATC")
  private String I137_ATC;

  @Column(name="I138_APL")
  @CsvColumn(name = "I138_APL")
  private String I138_APL;

  @Column(name="I139_1_ARPC")
  @CsvColumn(name = "I139_1_ARPC")
  private String I139_1_ARPC;

  @Column(name="I139_2_ARPC_RESCD")
  @CsvColumn(name = "I139_2_ARPC_RESCD")
  private String I139_2_ARPC_RESCD;

  @Column(name="I142_SCRIPTSEND")
  @CsvColumn(name = "I142_SCRIPTSEND")
  private String I142_SCRIPTSEND;

  @Column(name="I143_SCRIPT_RES")
  @CsvColumn(name = "I143_SCRIPT_RES")
  private String I143_SCRIPT_RES;

  @Column(name="I144_CRYP_TR")
  @CsvColumn(name = "I144_CRYP_TR")
  private String I144_CRYP_TR;

  @Column(name="I145_TRM_CNTRY")
  @CsvColumn(name = "I145_TRM_CNTRY")
  private String I145_TRM_CNTRY;

  @Column(name="I146_TRM_DATE")
  @CsvColumn(name = "I146_TRM_DATE")
  private String I146_TRM_DATE;

  @Column(name="I147_CRYPT_AMT")
  @CsvColumn(name = "I147_CRYPT_AMT")
  private String I147_CRYPT_AMT;

  @Column(name="I148_CRYPT_CURR")
  @CsvColumn(name = "I148_CRYPT_CURR")
  private String I148_CRYPT_CURR;

  @Column(name="I149_CRYPT_CSBK")
  @CsvColumn(name = "I149_CRYPT_CSBK")
  private String I149_CRYPT_CSBK;

  @Column(name="I061M_POS_DATA")
  @CsvColumn(name = "I061M_POS_DATA")
  private String I061M_POS_DATA;

  @Column(name="I105_MSG_SEC")
  @CsvColumn(name = "I105_MSG_SEC")
  private String I105_MSG_SEC;

  @Column(name="I034_ACCT_X")
  @CsvColumn(name = "I034_ACCT_X")
  private String I034_ACCT_X;

  @Column(name="I062M_INF_DATA")
  @CsvColumn(name = "I062M_INF_DATA")
  private String I062M_INF_DATA;
}
