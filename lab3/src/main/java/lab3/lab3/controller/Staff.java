package lab3.lab3.controller;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Staff {
    private String id;
    private String fullname;
    @Default
    private String photo = "photo.png";
    @Default
    private Boolean gender = true;
    @Default
    private Date birthday = new Date();
    @Default
    private Double salary = 12345.6789;
    @Default
    private Integer level = 0;
}
