package com.scm.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserForm {

  @NotBlank(message = "User Name is Required")
  @Size(min = 3,message = "Minimum 3 Character is Required")
  private String name;
  @NotBlank(message = "Email is Required")
  @Email(message = "Invalid Email Address")
  private String email;
  @NotBlank(message = "Password is Required")
  @Size(min = 6,message = "Minimum 6 Character is Required")
  private String password;
  @NotBlank(message = "About field is Required")
  private String about;
  @NotBlank(message = "Number is Required")
  @Size(min = 8,max = 12,message = "Invalid Number")
  private String phoneNumber;

}
