package RoomSystem;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Demerit_table")
public class Demerit {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long demeritId;
    private String userId;

    @PostPersist
    public void onPostPersist(){
        Demerited demerited = new Demerited();
        BeanUtils.copyProperties(this, demerited);
        demerited.publish();


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
