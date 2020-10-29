package bt.project.system.entity;

import lombok.Data;

@Data
public class User {
    private java.lang.String id;
    private java.lang.String username;
    private java.lang.String password;
    private java.lang.String phone;
    private java.util.Date created;
    private java.lang.String salt;

}
