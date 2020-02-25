package io.cjf.jcartadministrationback.dto.out;

public class AdministratorListOutDTO {
    private Integer administratorId;
    private String username;
    private Byte status;
    private Long createTimesTamp;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimesTamp() {
        return createTimesTamp;
    }

    public void setCreateTimesTamp(Long createTimesTamp) {
        this.createTimesTamp = createTimesTamp;
    }
}
