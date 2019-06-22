/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mercadolibre.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Status
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Status {
  @JsonProperty("billing")
  private Billing billing = null;

  @JsonProperty("buy")
  private Buy buy = null;

  @JsonProperty("confirmed_email")
  private Boolean confirmedEmail = null;

  @JsonProperty("shopping_cart")
  private ShoppingCart shoppingCart = null;

  @JsonProperty("immediate_payment")
  private Boolean immediatePayment = null;

  @JsonProperty("list")
  private List list = null;

  @JsonProperty("mercadoenvios")
  private String mercadoenvios = null;

  @JsonProperty("mercadopago_account_type")
  private String mercadopagoAccountType = null;

  @JsonProperty("mercadopago_tc_accepted")
  private Boolean mercadopagoTcAccepted = null;

  @JsonProperty("required_action")
  private String requiredAction = null;

  @JsonProperty("sell")
  private Sell sell = null;

  @JsonProperty("site_status")
  private String siteStatus = null;

  @JsonProperty("user_type")
  private String userType = null;

  public Status billing(Billing billing) {
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @ApiModelProperty(value = "")
  public Billing getBilling() {
    return billing;
  }

  public void setBilling(Billing billing) {
    this.billing = billing;
  }

  public Status buy(Buy buy) {
    this.buy = buy;
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @ApiModelProperty(value = "")
  public Buy getBuy() {
    return buy;
  }

  public void setBuy(Buy buy) {
    this.buy = buy;
  }

  public Status confirmedEmail(Boolean confirmedEmail) {
    this.confirmedEmail = confirmedEmail;
    return this;
  }

   /**
   * Get confirmedEmail
   * @return confirmedEmail
  **/
  @ApiModelProperty(value = "")
  public Boolean isConfirmedEmail() {
    return confirmedEmail;
  }

  public void setConfirmedEmail(Boolean confirmedEmail) {
    this.confirmedEmail = confirmedEmail;
  }

  public Status shoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
    return this;
  }

   /**
   * Get shoppingCart
   * @return shoppingCart
  **/
  @ApiModelProperty(value = "")
  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public void setShoppingCart(ShoppingCart shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public Status immediatePayment(Boolean immediatePayment) {
    this.immediatePayment = immediatePayment;
    return this;
  }

   /**
   * Get immediatePayment
   * @return immediatePayment
  **/
  @ApiModelProperty(value = "")
  public Boolean isImmediatePayment() {
    return immediatePayment;
  }

  public void setImmediatePayment(Boolean immediatePayment) {
    this.immediatePayment = immediatePayment;
  }

  public Status list(List list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }

  public Status mercadoenvios(String mercadoenvios) {
    this.mercadoenvios = mercadoenvios;
    return this;
  }

   /**
   * Get mercadoenvios
   * @return mercadoenvios
  **/
  @ApiModelProperty(value = "")
  public String getMercadoenvios() {
    return mercadoenvios;
  }

  public void setMercadoenvios(String mercadoenvios) {
    this.mercadoenvios = mercadoenvios;
  }

  public Status mercadopagoAccountType(String mercadopagoAccountType) {
    this.mercadopagoAccountType = mercadopagoAccountType;
    return this;
  }

   /**
   * Get mercadopagoAccountType
   * @return mercadopagoAccountType
  **/
  @ApiModelProperty(value = "")
  public String getMercadopagoAccountType() {
    return mercadopagoAccountType;
  }

  public void setMercadopagoAccountType(String mercadopagoAccountType) {
    this.mercadopagoAccountType = mercadopagoAccountType;
  }

  public Status mercadopagoTcAccepted(Boolean mercadopagoTcAccepted) {
    this.mercadopagoTcAccepted = mercadopagoTcAccepted;
    return this;
  }

   /**
   * Get mercadopagoTcAccepted
   * @return mercadopagoTcAccepted
  **/
  @ApiModelProperty(value = "")
  public Boolean isMercadopagoTcAccepted() {
    return mercadopagoTcAccepted;
  }

  public void setMercadopagoTcAccepted(Boolean mercadopagoTcAccepted) {
    this.mercadopagoTcAccepted = mercadopagoTcAccepted;
  }

  public Status requiredAction(String requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

   /**
   * Get requiredAction
   * @return requiredAction
  **/
  @ApiModelProperty(value = "")
  public String getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(String requiredAction) {
    this.requiredAction = requiredAction;
  }

  public Status sell(Sell sell) {
    this.sell = sell;
    return this;
  }

   /**
   * Get sell
   * @return sell
  **/
  @ApiModelProperty(value = "")
  public Sell getSell() {
    return sell;
  }

  public void setSell(Sell sell) {
    this.sell = sell;
  }

  public Status siteStatus(String siteStatus) {
    this.siteStatus = siteStatus;
    return this;
  }

   /**
   * Get siteStatus
   * @return siteStatus
  **/
  @ApiModelProperty(value = "")
  public String getSiteStatus() {
    return siteStatus;
  }

  public void setSiteStatus(String siteStatus) {
    this.siteStatus = siteStatus;
  }

  public Status userType(String userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @ApiModelProperty(value = "")
  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.billing, status.billing) &&
        Objects.equals(this.buy, status.buy) &&
        Objects.equals(this.confirmedEmail, status.confirmedEmail) &&
        Objects.equals(this.shoppingCart, status.shoppingCart) &&
        Objects.equals(this.immediatePayment, status.immediatePayment) &&
        Objects.equals(this.list, status.list) &&
        Objects.equals(this.mercadoenvios, status.mercadoenvios) &&
        Objects.equals(this.mercadopagoAccountType, status.mercadopagoAccountType) &&
        Objects.equals(this.mercadopagoTcAccepted, status.mercadopagoTcAccepted) &&
        Objects.equals(this.requiredAction, status.requiredAction) &&
        Objects.equals(this.sell, status.sell) &&
        Objects.equals(this.siteStatus, status.siteStatus) &&
        Objects.equals(this.userType, status.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billing, buy, confirmedEmail, shoppingCart, immediatePayment, list, mercadoenvios, mercadopagoAccountType, mercadopagoTcAccepted, requiredAction, sell, siteStatus, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    confirmedEmail: ").append(toIndentedString(confirmedEmail)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    immediatePayment: ").append(toIndentedString(immediatePayment)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    mercadoenvios: ").append(toIndentedString(mercadoenvios)).append("\n");
    sb.append("    mercadopagoAccountType: ").append(toIndentedString(mercadopagoAccountType)).append("\n");
    sb.append("    mercadopagoTcAccepted: ").append(toIndentedString(mercadopagoTcAccepted)).append("\n");
    sb.append("    requiredAction: ").append(toIndentedString(requiredAction)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
    sb.append("    siteStatus: ").append(toIndentedString(siteStatus)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
