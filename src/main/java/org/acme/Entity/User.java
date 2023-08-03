package org.acme.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
    
    @Id
    @SequenceGenerator(name = "giftSeq", sequenceName = "user_code_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "giftSeq")
    private Long code;
    private String email;
    private String password;
    private String role;

    public Long getCode(){
        return code;
    }

    public void setCode(Long code){
        this.code = code;
    }
    
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }
}
