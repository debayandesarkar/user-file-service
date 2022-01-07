package com.coding.userfileservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {
    String userID;
    char hasPassword;
    int userIdentifier;
    int groupIdentifier;
    String gecosField;
    String homeDirectory;
    String startProgram;
}
