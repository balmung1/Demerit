package RoomSystem;

public class Demerited extends AbstractEvent {

    private Long id;
    private Long demeritId;
    private String userId;

    public Demerited(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getDemeritId() {
        return demeritId;
    }

    public void setDemeritId(Long demeritId) {
        this.demeritId = demeritId;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
