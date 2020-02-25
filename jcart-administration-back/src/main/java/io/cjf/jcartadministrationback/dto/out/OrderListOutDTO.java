package io.cjf.jcartadministrationback.dto.out;

public class OrderListOutDTO {
    private Integer orderId;
    private Integer customerId;
    private String customerName;
    private  Byte status;
    private double totalPirce;
    private  Long createTimesTamp;
    private  Long updateTimesTamp;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public double getTotalPirce() {
        return totalPirce;
    }

    public void setTotalPirce(double totalPirce) {
        this.totalPirce = totalPirce;
    }

    public Long getCreateTimesTamp() {
        return createTimesTamp;
    }

    public void setCreateTimesTamp(Long createTimesTamp) {
        this.createTimesTamp = createTimesTamp;
    }

    public Long getUpdateTimesTamp() {
        return updateTimesTamp;
    }

    public void setUpdateTimesTamp(Long updateTimesTamp) {
        this.updateTimesTamp = updateTimesTamp;
    }
}
