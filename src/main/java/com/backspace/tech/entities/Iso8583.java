package com.backspace.tech.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.backspace.csv.annotation.CsvColumn;

@Entity(name = "ISO8583")
@Data
public class Iso8583 {

  @Column(name="INSTITUTION_ID")
  @CsvColumn(name = "INSTITUTION_ID")
  private String INSTITUTION_ID;

  @Id
  @Column(name="TRXNSERNO")
  @CsvColumn(name = "TRXNSERNO")
  private String TRXNSERNO;

  @Column(name="PARTITIONKEY")
  @CsvColumn(name = "PARTITIONKEY")
  private String PARTITIONKEY;

  @Column(name="MSGTYPE")
  @CsvColumn(name = "MSGTYPE")
  private String MSGTYPE;

  @Column(name="FORMAT")
  @CsvColumn(name = "FORMAT")
  private String FORMAT;

  @Column(name="SEQUENCE")
  @CsvColumn(name = "SEQUENCE")
  private String SEQUENCE;

  @Column(name="DIRECTION")
  @CsvColumn(name = "DIRECTION")
  private String DIRECTION;

  @Column(name="DE2")
  @CsvColumn(name = "DE2")
  private String DE2;

  @Column(name="DE3")
  @CsvColumn(name = "DE3")
  private String DE3;

  @Column(name="DE4")
  @CsvColumn(name = "DE4")
  private String DE4;

  @Column(name="DE5")
  @CsvColumn(name = "DE5")
  private String DE5;

  @Column(name="DE6")
  @CsvColumn(name = "DE6")
  private String DE6;

  @Column(name="DE7")
  @CsvColumn(name = "DE7")
  private String DE7;

  @Column(name="DE8")
  @CsvColumn(name = "DE8")
  private String DE8;

  @Column(name="DE9")
  @CsvColumn(name = "DE9")
  private String DE9;

  @Column(name="DE10")
  @CsvColumn(name = "DE10")
  private String DE10;

  @Column(name="DE11")
  @CsvColumn(name = "DE11")
  private String DE11;

  @Column(name="DE12")
  @CsvColumn(name = "DE12")
  private String DE12;

  @Column(name="DE13")
  @CsvColumn(name = "DE13")
  private String DE13;

  @Column(name="DE14")
  @CsvColumn(name = "DE14")
  private String DE14;

  @Column(name="DE15")
  @CsvColumn(name = "DE15")
  private String DE15;

  @Column(name="DE16")
  @CsvColumn(name = "DE16")
  private String DE16;

  @Column(name="DE17")
  @CsvColumn(name = "DE17")
  private String DE17;

  @Column(name="DE18")
  @CsvColumn(name = "DE18")
  private String DE18;

  @Column(name="DE19")
  @CsvColumn(name = "DE19")
  private String DE19;

  @Column(name="DE20")
  @CsvColumn(name = "DE20")
  private String DE20;

  @Column(name="DE21")
  @CsvColumn(name = "DE21")
  private String DE21;

  @Column(name="DE22")
  @CsvColumn(name = "DE22")
  private String DE22;

  @Column(name="DE23")
  @CsvColumn(name = "DE23")
  private String DE23;

  @Column(name="DE24")
  @CsvColumn(name = "DE24")
  private String DE24;

  @Column(name="DE25")
  @CsvColumn(name = "DE25")
  private String DE25;

  @Column(name="DE26")
  @CsvColumn(name = "DE26")
  private String DE26;

  @Column(name="DE27")
  @CsvColumn(name = "DE27")
  private String DE27;

  @Column(name="DE28")
  @CsvColumn(name = "DE28")
  private String DE28;

  @Column(name="DE29")
  @CsvColumn(name = "DE29")
  private String DE29;

  @Column(name="DE30")
  @CsvColumn(name = "DE30")
  private String DE30;

  @Column(name="DE31")
  @CsvColumn(name = "DE31")
  private String DE31;

  @Column(name="DE32")
  @CsvColumn(name = "DE32")
  private String DE32;

  @Column(name="DE33")
  @CsvColumn(name = "DE33")
  private String DE33;

  @Column(name="DE34")
  @CsvColumn(name = "DE34")
  private String DE34;

  @Column(name="DE35")
  @CsvColumn(name = "DE35")
  private String DE35;

  @Column(name="DE36")
  @CsvColumn(name = "DE36")
  private String DE36;

  @Column(name="DE37")
  @CsvColumn(name = "DE37")
  private String DE37;

  @Column(name="DE38")
  @CsvColumn(name = "DE38")
  private String DE38;

  @Column(name="DE39")
  @CsvColumn(name = "DE39")
  private String DE39;

  @Column(name="DE40")
  @CsvColumn(name = "DE40")
  private String DE40;

  @Column(name="DE41")
  @CsvColumn(name = "DE41")
  private String DE41;

  @Column(name="DE42")
  @CsvColumn(name = "DE42")
  private String DE42;

  @Column(name="DE43")
  @CsvColumn(name = "DE43")
  private String DE43;

  @Column(name="DE44")
  @CsvColumn(name = "DE44")
  private String DE44;

  @Column(name="DE45")
  @CsvColumn(name = "DE45")
  private String DE45;

  @Column(name="DE46")
  @CsvColumn(name = "DE46")
  private String DE46;

  @Column(name="DE47")
  @CsvColumn(name = "DE47")
  private String DE47;

  @Column(name="DE48")
  @CsvColumn(name = "DE48")
  private String DE48;

  @Column(name="DE49")
  @CsvColumn(name = "DE49")
  private String DE49;

  @Column(name="DE50")
  @CsvColumn(name = "DE50")
  private String DE50;

  @Column(name="DE51")
  @CsvColumn(name = "DE51")
  private String DE51;

  @Column(name="DE52")
  @CsvColumn(name = "DE52")
  private String DE52;

  @Column(name="DE53")
  @CsvColumn(name = "DE53")
  private String DE53;

  @Column(name="DE54")
  @CsvColumn(name = "DE54")
  private String DE54;

  @Column(name="DE55")
  @CsvColumn(name = "DE55")
  private String DE55;

  @Column(name="DE56")
  @CsvColumn(name = "DE56")
  private String DE56;

  @Column(name="DE57")
  @CsvColumn(name = "DE57")
  private String DE57;

  @Column(name="DE58")
  @CsvColumn(name = "DE58")
  private String DE58;

  @Column(name="DE59")
  @CsvColumn(name = "DE59")
  private String DE59;

  @Column(name="DE60")
  @CsvColumn(name = "DE60")
  private String DE60;

  @Column(name="DE61")
  @CsvColumn(name = "DE61")
  private String DE61;

  @Column(name="DE62")
  @CsvColumn(name = "DE62")
  private String DE62;

  @Column(name="DE63")
  @CsvColumn(name = "DE63")
  private String DE63;

  @Column(name="DE64")
  @CsvColumn(name = "DE64")
  private String DE64;

  @Column(name="DE65")
  @CsvColumn(name = "DE65")
  private String DE65;

  @Column(name="DE66")
  @CsvColumn(name = "DE66")
  private String DE66;

  @Column(name="DE67")
  @CsvColumn(name = "DE67")
  private String DE67;

  @Column(name="DE68")
  @CsvColumn(name = "DE68")
  private String DE68;

  @Column(name="DE69")
  @CsvColumn(name = "DE69")
  private String DE69;

  @Column(name="DE70")
  @CsvColumn(name = "DE70")
  private String DE70;

  @Column(name="DE71")
  @CsvColumn(name = "DE71")
  private String DE71;

  @Column(name="DE72")
  @CsvColumn(name = "DE72")
  private String DE72;

  @Column(name="DE73")
  @CsvColumn(name = "DE73")
  private String DE73;

  @Column(name="DE74")
  @CsvColumn(name = "DE74")
  private String DE74;

  @Column(name="DE75")
  @CsvColumn(name = "DE75")
  private String DE75;

  @Column(name="DE76")
  @CsvColumn(name = "DE76")
  private String DE76;

  @Column(name="DE77")
  @CsvColumn(name = "DE77")
  private String DE77;

  @Column(name="DE78")
  @CsvColumn(name = "DE78")
  private String DE78;

  @Column(name="DE79")
  @CsvColumn(name = "DE79")
  private String DE79;

  @Column(name="DE80")
  @CsvColumn(name = "DE80")
  private String DE80;

  @Column(name="DE81")
  @CsvColumn(name = "DE81")
  private String DE81;

  @Column(name="DE82")
  @CsvColumn(name = "DE82")
  private String DE82;

  @Column(name="DE83")
  @CsvColumn(name = "DE83")
  private String DE83;

  @Column(name="DE84")
  @CsvColumn(name = "DE84")
  private String DE84;

  @Column(name="DE85")
  @CsvColumn(name = "DE85")
  private String DE85;

  @Column(name="DE86")
  @CsvColumn(name = "DE86")
  private String DE86;

  @Column(name="DE87")
  @CsvColumn(name = "DE87")
  private String DE87;

  @Column(name="DE88")
  @CsvColumn(name = "DE88")
  private String DE88;

  @Column(name="DE89")
  @CsvColumn(name = "DE89")
  private String DE89;

  @Column(name="DE90")
  @CsvColumn(name = "DE90")
  private String DE90;

  @Column(name="DE91")
  @CsvColumn(name = "DE91")
  private String DE91;

  @Column(name="DE92")
  @CsvColumn(name = "DE92")
  private String DE92;

  @Column(name="DE93")
  @CsvColumn(name = "DE93")
  private String DE93;

  @Column(name="DE94")
  @CsvColumn(name = "DE94")
  private String DE94;

  @Column(name="DE95")
  @CsvColumn(name = "DE95")
  private String DE95;

  @Column(name="DE96")
  @CsvColumn(name = "DE96")
  private String DE96;

  @Column(name="DE97")
  @CsvColumn(name = "DE97")
  private String DE97;

  @Column(name="DE98")
  @CsvColumn(name = "DE98")
  private String DE98;

  @Column(name="DE99")
  @CsvColumn(name = "DE99")
  private String DE99;

  @Column(name="DE100")
  @CsvColumn(name = "DE100")
  private String DE100;

  @Column(name="DE101")
  @CsvColumn(name = "DE101")
  private String DE101;

  @Column(name="DE102")
  @CsvColumn(name = "DE102")
  private String DE102;

  @Column(name="DE103")
  @CsvColumn(name = "DE103")
  private String DE103;

  @Column(name="DE104")
  @CsvColumn(name = "DE104")
  private String DE104;

  @Column(name="DE105")
  @CsvColumn(name = "DE105")
  private String DE105;

  @Column(name="DE106")
  @CsvColumn(name = "DE106")
  private String DE106;

  @Column(name="DE107")
  @CsvColumn(name = "DE107")
  private String DE107;

  @Column(name="DE108")
  @CsvColumn(name = "DE108")
  private String DE108;

  @Column(name="DE109")
  @CsvColumn(name = "DE109")
  private String DE109;

  @Column(name="DE110")
  @CsvColumn(name = "DE110")
  private String DE110;

  @Column(name="DE111")
  @CsvColumn(name = "DE111")
  private String DE111;

  @Column(name="DE112")
  @CsvColumn(name = "DE112")
  private String DE112;

  @Column(name="DE113")
  @CsvColumn(name = "DE113")
  private String DE113;

  @Column(name="DE114")
  @CsvColumn(name = "DE114")
  private String DE114;

  @Column(name="DE115")
  @CsvColumn(name = "DE115")
  private String DE115;

  @Column(name="DE116")
  @CsvColumn(name = "DE116")
  private String DE116;

  @Column(name="DE117")
  @CsvColumn(name = "DE117")
  private String DE117;

  @Column(name="DE118")
  @CsvColumn(name = "DE118")
  private String DE118;

  @Column(name="DE119")
  @CsvColumn(name = "DE119")
  private String DE119;

  @Column(name="DE120")
  @CsvColumn(name = "DE120")
  private String DE120;

  @Column(name="DE121")
  @CsvColumn(name = "DE121")
  private String DE121;

  @Column(name="DE122")
  @CsvColumn(name = "DE122")
  private String DE122;

  @Column(name="DE123")
  @CsvColumn(name = "DE123")
  private String DE123;

  @Column(name="DE124")
  @CsvColumn(name = "DE124")
  private String DE124;

  @Column(name="DE125")
  @CsvColumn(name = "DE125")
  private String DE125;

  @Column(name="DE126")
  @CsvColumn(name = "DE126")
  private String DE126;

  @Column(name="DE127")
  @CsvColumn(name = "DE127")
  private String DE127;

  @Column(name="DE128")
  @CsvColumn(name = "DE128")
  private String DE128;

  @Column(name="CONVERTED")
  @CsvColumn(name = "CONVERTED")
  private String CONVERTED;

}
