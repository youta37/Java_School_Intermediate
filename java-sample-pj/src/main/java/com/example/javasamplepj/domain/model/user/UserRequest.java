package com.example.javasamplepj.domain.model.user;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest implements Serializable {

    @NotEmpty(message = "ユーザー名を入力してください")
    @Size(max = 100, message = "名前は100桁以内で入力してください")
    private String userName;

    @NotEmpty(message = "ユーザー名を入力してください")
    @Size(min = 6, max = 16, message = "パスワードは6～16桁以内で入力してください    ")
    private String password;

    @NotEmpty(message = "メールアドレスを入力してください")
    @Email(message = "メールアドレス形式で入力してください")
    private String mailAddress;
}
