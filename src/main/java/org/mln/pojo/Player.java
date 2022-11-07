package org.mln.pojo;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "set")
@Getter()
public class Player {


    private String id;
    private String Name;
    private String Sport;
    private String Country;
    private boolean isCaptain;

}
