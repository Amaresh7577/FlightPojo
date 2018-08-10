package Model;

import java.util.List;

public class Flight {
private String actualFlightLegCount;
private String actualLegSequenceText;
private apiError apiError;
private String arrivalDate;
private String departDate;
private List<flightLegDetails> flightLegDetails;
private String flightNo;
private String fpesFlightId;
private List<String> operationalRemarks;
private List<String> remarksTexts;
private String responseMessage;
private String scheduledArrivalTime;
private String scheduledDepartTime;

public String getActualFlightLegCount() {
	return actualFlightLegCount;
}
public void setActualFlightLegCount(String actualFlightLegCount) {
	this.actualFlightLegCount = actualFlightLegCount;
}
public String getActualLegSequenceText() {
	return actualLegSequenceText;
}
public void setActualLegSequenceText(String actualLegSequenceText) {
	this.actualLegSequenceText = actualLegSequenceText;
}
public apiError getApiError() {
	return apiError;
}
public void setApiError(apiError apiError) {
	this.apiError = apiError;
}
public String getArrivalDate() {
	return arrivalDate;
}
public void setArrivalDate(String arrivalDate) {
	this.arrivalDate = arrivalDate;
}
public String getDepartDate() {
	return departDate;
}
public void setDepartDate(String departDate) {
	this.departDate = departDate;
}
public List<flightLegDetails> getFlightLegDetails() {
	return flightLegDetails;
}
public void setFlightLegDetails(List<flightLegDetails> flightLegDetails) {
	this.flightLegDetails = flightLegDetails;
}
public String getFlightNo() {
	return flightNo;
}
public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
}
public String getFpesFlightId() {
	return fpesFlightId;
}
public void setFpesFlightId(String fpesFlightId) {
	this.fpesFlightId = fpesFlightId;
}
public List<String> getOperationalRemarks() {
	return operationalRemarks;
}
public void setOperationalRemarks(List<String> operationalRemarks) {
	this.operationalRemarks = operationalRemarks;
}
public List<String> getRemarksTexts() {
	return remarksTexts;
}
public void setRemarksTexts(List<String> remarksTexts) {
	this.remarksTexts = remarksTexts;
}
public String getResponseMessage() {
	return responseMessage;
}
public void setResponseMessage(String responseMessage) {
	this.responseMessage = responseMessage;
}
public String getScheduledArrivalTime() {
	return scheduledArrivalTime;
}
public void setScheduledArrivalTime(String scheduledArrivalTime) {
	this.scheduledArrivalTime = scheduledArrivalTime;
}
public String getScheduledDepartTime() {
	return scheduledDepartTime;
}
public void setScheduledDepartTime(String scheduledDepartTime) {
	this.scheduledDepartTime = scheduledDepartTime;
}


}
