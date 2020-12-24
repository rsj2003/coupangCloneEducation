package com.seungjae.dataModel.dto;

import com.seungjae.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    String userId;
    String name;
    String email;
    String pass;
    String phone;
    int grade = 0;
    String address;
    int point = 0;

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.pass = user.getPass();
        this.phone = user.getPhone();
        this.grade = user.getGrade();
        this.address = user.getAddress();
        this.point = user.getPoint();
    }
}
