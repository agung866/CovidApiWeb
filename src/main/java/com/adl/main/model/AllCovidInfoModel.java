
package com.adl.main.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AllCovidInfoModel {

    @SerializedName("Active Cases_text")
    @Expose
    private String activeCasesText;
    @SerializedName("Country_text")
    @Expose
    private String countryText;
    @SerializedName("Last Update")
    @Expose
    private String lastUpdate;
    @SerializedName("New Cases_text")
    @Expose
    private String newCasesText;
    @SerializedName("New Deaths_text")
    @Expose
    private String newDeathsText;
    @SerializedName("Total Cases_text")
    @Expose
    private String totalCasesText;
    @SerializedName("Total Deaths_text")
    @Expose
    private String totalDeathsText;
    @SerializedName("Total Recovered_text")
    @Expose
    private String totalRecoveredText;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AllCovidInfoModel() {
    }

    /**
     * 
     * @param newCasesText
     * @param newDeathsText
     * @param totalCasesText
     * @param lastUpdate
     * @param totalDeathsText
     * @param totalRecoveredText
     * @param countryText
     * @param activeCasesText
     */
    public AllCovidInfoModel(String activeCasesText, String countryText, String lastUpdate, String newCasesText, String newDeathsText, String totalCasesText, String totalDeathsText, String totalRecoveredText) {
        super();
        this.activeCasesText = activeCasesText;
        this.countryText = countryText;
        this.lastUpdate = lastUpdate;
        this.newCasesText = newCasesText;
        this.newDeathsText = newDeathsText;
        this.totalCasesText = totalCasesText;
        this.totalDeathsText = totalDeathsText;
        this.totalRecoveredText = totalRecoveredText;
    }

    public String getActiveCasesText() {
        return activeCasesText;
    }

    public void setActiveCasesText(String activeCasesText) {
        this.activeCasesText = activeCasesText;
    }

    public String getCountryText() {
        return countryText;
    }

    public void setCountryText(String countryText) {
        this.countryText = countryText;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getNewCasesText() {
        return newCasesText;
    }

    public void setNewCasesText(String newCasesText) {
        this.newCasesText = newCasesText;
    }

    public String getNewDeathsText() {
        return newDeathsText;
    }

    public void setNewDeathsText(String newDeathsText) {
        this.newDeathsText = newDeathsText;
    }

    public String getTotalCasesText() {
        return totalCasesText;
    }

    public void setTotalCasesText(String totalCasesText) {
        this.totalCasesText = totalCasesText;
    }

    public String getTotalDeathsText() {
        return totalDeathsText;
    }

    public void setTotalDeathsText(String totalDeathsText) {
        this.totalDeathsText = totalDeathsText;
    }

    public String getTotalRecoveredText() {
        return totalRecoveredText;
    }

    public void setTotalRecoveredText(String totalRecoveredText) {
        this.totalRecoveredText = totalRecoveredText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AllCovidInfoModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activeCasesText");
        sb.append('=');
        sb.append(((this.activeCasesText == null)?"<null>":this.activeCasesText));
        sb.append(',');
        sb.append("countryText");
        sb.append('=');
        sb.append(((this.countryText == null)?"<null>":this.countryText));
        sb.append(',');
        sb.append("lastUpdate");
        sb.append('=');
        sb.append(((this.lastUpdate == null)?"<null>":this.lastUpdate));
        sb.append(',');
        sb.append("newCasesText");
        sb.append('=');
        sb.append(((this.newCasesText == null)?"<null>":this.newCasesText));
        sb.append(',');
        sb.append("newDeathsText");
        sb.append('=');
        sb.append(((this.newDeathsText == null)?"<null>":this.newDeathsText));
        sb.append(',');
        sb.append("totalCasesText");
        sb.append('=');
        sb.append(((this.totalCasesText == null)?"<null>":this.totalCasesText));
        sb.append(',');
        sb.append("totalDeathsText");
        sb.append('=');
        sb.append(((this.totalDeathsText == null)?"<null>":this.totalDeathsText));
        sb.append(',');
        sb.append("totalRecoveredText");
        sb.append('=');
        sb.append(((this.totalRecoveredText == null)?"<null>":this.totalRecoveredText));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
