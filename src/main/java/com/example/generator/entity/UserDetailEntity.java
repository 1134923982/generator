package com.example.generator.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * Author Liumq
 * Date  2019-10-14
 */
public class UserDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

       private Long id;
       private Long userid;
       private String name;
       private Integer sex;
       private Integer type;
       private String headurl;
       private String introduction;
       private String majorintroduct;
       private Integer usertypeid;
       private String idcard;
       private String documenttype;
       private String idcardfaceurl;
       private String idcardbackurl;
       private String usercerfaceurl;
       private String usercerbackurl;
       private String userpic;
       private String city;
       private String professionname;
       private String hospitalname;
       private String firstworkposition;
       private String firstworklnglat;
       private String secondworklnglat;
       private String secondworkposition;
       private String thirdworklnglat;
       private String thirdworkposition;
       private Integer status;
       private Integer allowjb;
       private Integer allowbuy;
       private Integer allowchat;
       private String checkcomment;
       private String bank;
       private String banknum;
       private Double feerate;
       private Date feeratestarttime;
       private Date feerateendtime;
       private Double convertrate;
       private Date ratevalidatestarttime;
       private Date ratevalidateendtime;
       private Date createtime;
       private Date modifytime;
       private Date birthday;

       public void setId(Long id) {
          this.id = id;
       }
       public Long getId() {
          return id;
       }
       public void setUserid(Long userid) {
          this.userid = userid;
       }
       public Long getUserid() {
          return userid;
       }
       public void setName(String name) {
          this.name = name;
       }
       public String getName() {
          return name;
       }
       public void setSex(Integer sex) {
          this.sex = sex;
       }
       public Integer getSex() {
          return sex;
       }
       public void setType(Integer type) {
          this.type = type;
       }
       public Integer getType() {
          return type;
       }
       public void setHeadurl(String headurl) {
          this.headurl = headurl;
       }
       public String getHeadurl() {
          return headurl;
       }
       public void setIntroduction(String introduction) {
          this.introduction = introduction;
       }
       public String getIntroduction() {
          return introduction;
       }
       public void setMajorintroduct(String majorintroduct) {
          this.majorintroduct = majorintroduct;
       }
       public String getMajorintroduct() {
          return majorintroduct;
       }
       public void setUsertypeid(Integer usertypeid) {
          this.usertypeid = usertypeid;
       }
       public Integer getUsertypeid() {
          return usertypeid;
       }
       public void setIdcard(String idcard) {
          this.idcard = idcard;
       }
       public String getIdcard() {
          return idcard;
       }
       public void setDocumenttype(String documenttype) {
          this.documenttype = documenttype;
       }
       public String getDocumenttype() {
          return documenttype;
       }
       public void setIdcardfaceurl(String idcardfaceurl) {
          this.idcardfaceurl = idcardfaceurl;
       }
       public String getIdcardfaceurl() {
          return idcardfaceurl;
       }
       public void setIdcardbackurl(String idcardbackurl) {
          this.idcardbackurl = idcardbackurl;
       }
       public String getIdcardbackurl() {
          return idcardbackurl;
       }
       public void setUsercerfaceurl(String usercerfaceurl) {
          this.usercerfaceurl = usercerfaceurl;
       }
       public String getUsercerfaceurl() {
          return usercerfaceurl;
       }
       public void setUsercerbackurl(String usercerbackurl) {
          this.usercerbackurl = usercerbackurl;
       }
       public String getUsercerbackurl() {
          return usercerbackurl;
       }
       public void setUserpic(String userpic) {
          this.userpic = userpic;
       }
       public String getUserpic() {
          return userpic;
       }
       public void setCity(String city) {
          this.city = city;
       }
       public String getCity() {
          return city;
       }
       public void setProfessionname(String professionname) {
          this.professionname = professionname;
       }
       public String getProfessionname() {
          return professionname;
       }
       public void setHospitalname(String hospitalname) {
          this.hospitalname = hospitalname;
       }
       public String getHospitalname() {
          return hospitalname;
       }
       public void setFirstworkposition(String firstworkposition) {
          this.firstworkposition = firstworkposition;
       }
       public String getFirstworkposition() {
          return firstworkposition;
       }
       public void setFirstworklnglat(String firstworklnglat) {
          this.firstworklnglat = firstworklnglat;
       }
       public String getFirstworklnglat() {
          return firstworklnglat;
       }
       public void setSecondworklnglat(String secondworklnglat) {
          this.secondworklnglat = secondworklnglat;
       }
       public String getSecondworklnglat() {
          return secondworklnglat;
       }
       public void setSecondworkposition(String secondworkposition) {
          this.secondworkposition = secondworkposition;
       }
       public String getSecondworkposition() {
          return secondworkposition;
       }
       public void setThirdworklnglat(String thirdworklnglat) {
          this.thirdworklnglat = thirdworklnglat;
       }
       public String getThirdworklnglat() {
          return thirdworklnglat;
       }
       public void setThirdworkposition(String thirdworkposition) {
          this.thirdworkposition = thirdworkposition;
       }
       public String getThirdworkposition() {
          return thirdworkposition;
       }
       public void setStatus(Integer status) {
          this.status = status;
       }
       public Integer getStatus() {
          return status;
       }
       public void setAllowjb(Integer allowjb) {
          this.allowjb = allowjb;
       }
       public Integer getAllowjb() {
          return allowjb;
       }
       public void setAllowbuy(Integer allowbuy) {
          this.allowbuy = allowbuy;
       }
       public Integer getAllowbuy() {
          return allowbuy;
       }
       public void setAllowchat(Integer allowchat) {
          this.allowchat = allowchat;
       }
       public Integer getAllowchat() {
          return allowchat;
       }
       public void setCheckcomment(String checkcomment) {
          this.checkcomment = checkcomment;
       }
       public String getCheckcomment() {
          return checkcomment;
       }
       public void setBank(String bank) {
          this.bank = bank;
       }
       public String getBank() {
          return bank;
       }
       public void setBanknum(String banknum) {
          this.banknum = banknum;
       }
       public String getBanknum() {
          return banknum;
       }
       public void setFeerate(Double feerate) {
          this.feerate = feerate;
       }
       public Double getFeerate() {
          return feerate;
       }
       public void setFeeratestarttime(Date feeratestarttime) {
          this.feeratestarttime = feeratestarttime;
       }
       public Date getFeeratestarttime() {
          return feeratestarttime;
       }
       public void setFeerateendtime(Date feerateendtime) {
          this.feerateendtime = feerateendtime;
       }
       public Date getFeerateendtime() {
          return feerateendtime;
       }
       public void setConvertrate(Double convertrate) {
          this.convertrate = convertrate;
       }
       public Double getConvertrate() {
          return convertrate;
       }
       public void setRatevalidatestarttime(Date ratevalidatestarttime) {
          this.ratevalidatestarttime = ratevalidatestarttime;
       }
       public Date getRatevalidatestarttime() {
          return ratevalidatestarttime;
       }
       public void setRatevalidateendtime(Date ratevalidateendtime) {
          this.ratevalidateendtime = ratevalidateendtime;
       }
       public Date getRatevalidateendtime() {
          return ratevalidateendtime;
       }
       public void setCreatetime(Date createtime) {
          this.createtime = createtime;
       }
       public Date getCreatetime() {
          return createtime;
       }
       public void setModifytime(Date modifytime) {
          this.modifytime = modifytime;
       }
       public Date getModifytime() {
          return modifytime;
       }
       public void setBirthday(Date birthday) {
          this.birthday = birthday;
       }
       public Date getBirthday() {
          return birthday;
       }
}