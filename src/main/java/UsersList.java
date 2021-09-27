import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "list")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersList {

    @XmlElement(name = "user")
    private List<User> list = null;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
